package softuni.exams;

import softuni.exams.states.GameState;
import softuni.exams.states.MenuState;
import softuni.exams.states.State;

import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Created by PetyoPetrov on 05.04.2016 г..
 */
public class Game implements Runnable {
    private Display display;
    private int widht, height;
    private Thread thread;
    private boolean running = false;
    public String title;
    private BufferStrategy bs;
    private Graphics g;
    private State gameState;
    private State menuState;
    private KeyManager keyManager;

    public synchronized void start() {
        if (running)
            return;
        running = true;
        thread = new Thread(this);
        thread.start();

    }

    public synchronized void stop() {
        if (!running)
            return;
        running = false;

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public Game(String title, int width, int height) {
        this.widht = width;
        this.height = height;
        this.title = title;
        keyManager=new KeyManager();

    }

    private void init() {
        display = new Display(title, widht, height);
        display.getFrame().addKeyListener(keyManager);
        Assets.init();
        gameState=new GameState(this);
        menuState=new MenuState(this);
        State.setCurrentState(gameState);


    }

    private void tick() {
        keyManager.tick();
        if(State.getState()!=null){
            State.getState().tick();
        }

    }

    private void render() {

        bs = display.getCanvas().getBufferStrategy();
        if (bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        // draw here
         g.clearRect(0,0,widht,height);
        //g.drawImage(Assets.player,100,200,null);
        if(State.getState()!=null){
            State.getState().render(g);
        }

        bs.show();
        g.dispose();

    }

    @Override
    public void run() {


        init();

        int fps=60;
        double timePerTick=1000000000/fps;
        double delta=0;
        long now;
        long lastTime=System.nanoTime();
        long timer=0;
        long tiks=0;


        while (running){
            now= System.nanoTime();
            delta+=(now-lastTime)/timePerTick;
            timer+=now-lastTime;
            lastTime=now;
            if(delta>=1){
                tick();
                render();
                tiks++;
                delta--;
            }
            if(timer>=1000000000){
                System.out.println("Ticks and frames "+ tiks);
                tiks=0;
                timer=0;
            }

        }
        stop();


    }

    public KeyManager getKeyManager() {
        return keyManager;
    }
}

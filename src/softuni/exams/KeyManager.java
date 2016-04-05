package softuni.exams;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by PetyoPetrov on 05.04.2016 г..
 */
public class KeyManager implements KeyListener {
    private boolean[]keys;
    public boolean up,down,left,right;

    public void tick(){
        up=keys[KeyEvent.VK_UP];
        down=keys[KeyEvent.VK_DOWN];
        left=keys[KeyEvent.VK_LEFT];
        right=keys[KeyEvent.VK_RIGHT];
    }
    public void render(){

    }

    public KeyManager() {
        keys = new boolean[256];
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()]=true;
        System.out.println("Pressed");

    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()]=false;
    }
}

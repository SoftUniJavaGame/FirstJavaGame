package softuni.exams.states;

import softuni.exams.Game;

import java.awt.*;

/**
 * Created by PetyoPetrov on 05.04.2016 г..
 */
public abstract class State {

    private static State currentState=null;

    public static void setCurrentState(State state){
        currentState=state;
    }

    public static State  getState(){
        return currentState;
    }
    protected Game game;

    public State(Game game){
        this.game=game;
    }
    public abstract void tick();
    public abstract void render(Graphics g);
}




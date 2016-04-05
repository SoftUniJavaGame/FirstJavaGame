package softuni.exams.entity;

import softuni.exams.Assets;
import softuni.exams.Game;

import java.awt.*;

/**
 * Created by PetyoPetrov on 05.04.2016 г..
 */
public class Player extends Creature {
    private Game game;
    public Player(Game game,float x, float y) {
        super(x, y);
        this.game=game;
    }

    @Override
    public void tick() {
        if(game.getKeyManager().up){
            y-=4;
        }if(game.getKeyManager().down){
            y+=4;
        }if(game.getKeyManager().left){
            x-=4;
        }if(game.getKeyManager().right) {
            x += 4;
        }

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.player,(int)x,(int)y,null);
    }
}

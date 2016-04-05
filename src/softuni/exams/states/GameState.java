package softuni.exams.states;

import softuni.exams.Assets;
import softuni.exams.Game;
import softuni.exams.entity.Player;

import java.awt.*;

/**
 * Created by PetyoPetrov on 05.04.2016 г..
 */
public class GameState extends State {
    private Player player;

    public GameState(Game game) {
        super(game);

        player=new Player( game,100,100);
    }

    @Override
    public void tick() {
        player.tick();

    }

    @Override
    public void render(Graphics g) {
        player.render(g);
        //g.drawImage(Assets.player,300,300,null);

    }
}

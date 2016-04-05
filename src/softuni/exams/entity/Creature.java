package softuni.exams.entity;

import java.awt.*;

/**
 * Created by PetyoPetrov on 05.04.2016 г..
 */
public abstract class Creature extends Entity {
    protected int health;

    public Creature(float x, float y) {
        super(x, y);
        health=10;
    }


}

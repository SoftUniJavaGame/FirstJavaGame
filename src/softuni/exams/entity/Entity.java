package softuni.exams.entity;

import java.awt.*;

/**
 * Created by PetyoPetrov on 05.04.2016 г..
 */
public abstract class Entity {
    protected float x,y;

    public Entity(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public abstract void tick();
    public abstract void render(Graphics g);
}

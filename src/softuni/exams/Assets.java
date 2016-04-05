package softuni.exams;

import java.awt.image.BufferedImage;

/**
 * Created by PetyoPetrov on 05.04.2016 г..
 */
public class Assets {
    private static int width=95,height=130;

    public static BufferedImage player;
    public static void init(){
        SpriteSheet sheet=new SpriteSheet(ImageLoader.loadImage("/res/player.png"));

        player=sheet.crop(0,0,width,height);

    }
}

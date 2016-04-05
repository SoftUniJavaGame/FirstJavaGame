package softuni.exams;

import java.awt.image.BufferedImage;

/**
 * Created by PetyoPetrov on 05.04.2016 г..
 */
public class SpriteSheet {
    private BufferedImage sheet;

    public SpriteSheet(BufferedImage sheet) {
        this.sheet = sheet;
    }
    public BufferedImage crop(int row,int col,int widht,int height){
        return sheet.getSubimage(row*130,col*95,widht,height);
    }
}

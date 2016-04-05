package softuni.exams;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by PetyoPetrov on 05.04.2016 г..
 */
public class ImageLoader {

    public static BufferedImage loadImage(String path){

        try {
            return ImageIO.read(ImageLoader.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}

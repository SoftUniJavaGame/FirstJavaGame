package softuni.exams;

import javax.swing.*;
import java.awt.*;

public class Display {
    private JFrame frame;
    private int width, height;
    private String title;
    private Canvas canvas;

    public JFrame getFrame() {
        return frame;
    }

    public Display(String title, int width, int height) {
        this.title = title;
        this.height = height;
        this.width = width;
        createDisplay();
    }

    private void createDisplay() {
        frame = new JFrame(title);
        frame.setSize(width,height);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        canvas=new Canvas();
        canvas.setPreferredSize(new Dimension(width,height));
        canvas.setMaximumSize(new Dimension(width,height));
        canvas.setMinimumSize(new Dimension(width,height));
        canvas.setFocusable(false);
        frame.add(canvas);
        frame.pack();

    }

    public Canvas getCanvas() {
        return canvas;
    }
}

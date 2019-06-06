import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Control extends JPanel{
    private int width;
    private int height;
    Box box;
    Mouse mouse;

    public Control(int width,int height, Box box,Mouse mouse){
        JFrame object = new JFrame();
        object.setVisible(true);
         object.setSize(width,height);
         object.getContentPane().add(this);
         this.box=box;
         this.mouse = mouse;
    }
    public void paintComponent(Graphics g){
        boolean done = false;
        g.setColor(Color.black);
        box.drawBox(g);
        repaint();

    }

}

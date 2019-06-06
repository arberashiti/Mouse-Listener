import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Box {
private int width;
private int height;
Mouse mouse;
    public Box(int width,int height,Mouse mouse ){
        this.width = width;
        this.height = height;
        this.mouse = mouse;
    }
    public void drawBox(Graphics g){
    g.clearRect(0,0,width,height);
        int x_position = 15;
        int y_position = 30;
    while (x_position == 15 && y_position<width-5){
        g.drawString("|",x_position,y_position);
        y_position = y_position+8;
    }
        x_position = width;
         y_position = 30;
        while (x_position == width && y_position<width-5){
            g.drawString("|",x_position,y_position);
            y_position = y_position+8;
        }
         y_position = 20;
         x_position = 20;
        while (y_position==20 && x_position<height){
           g.drawString("-",x_position,y_position);
            x_position = x_position+8;

       }
        y_position = height;
        x_position = 20;
        while (y_position==height && x_position<height){
            g.drawString("-",x_position,y_position);
            x_position = x_position+8;

        }
        if(mouse.getX_position()==height||mouse.getY_position()==width){
            mouse.x_position = 40;
            mouse.y_position=40;}
          mouse.setMouse(g);
    }


}

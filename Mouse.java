import java.awt.*;
import java.util.Scanner;

public class Mouse {
public int x_position;
public int y_position;
public String position;

    public Mouse(int x_position,int y_position, String position){
        this.x_position=x_position;
        this.y_position= y_position;
        this.position = position;
    }
    public int getX_position(){
        return x_position;}

    public int getY_position() {
        return y_position;
    }
    public String getPosition(){
        return position;
    }

    public void drawMouse(Graphics g ){
        g.drawString("  __   ",x_position,y_position);
        g.drawString("         ",x_position,y_position+8);
        g.drawString("/    . \\",x_position,y_position+15);
        g.drawString("       ",x_position,y_position+25);
        g.drawString("-----",x_position,y_position+30);

    }
    public void drawMouseRight(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.rotate(Math.toRadians(-90),x_position,y_position);
        this.drawMouse(g);}
    public void drawMouseLeft(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.rotate(Math.toRadians(90),x_position,y_position);
        this.drawMouse(g);}

   private void drawMouseDown(Graphics g){
      Graphics2D g2 = (Graphics2D)g;
      
      g2.rotate(Math.toRadians(0),x_position,y_position);
       this.drawMouse(g);
   }
   
    private void drawMouseUp(Graphics g){
      Graphics2D g2 = (Graphics2D)g;
      
      g2.rotate(Math.toRadians(180),x_position,y_position);
       this.drawMouse(g);
   }


     public void setMouse(Graphics g){
        if(this.getPosition()=="horizontal"){this.drawMouse(g);}
        else if(this.getPosition()=="left"){this.drawMouseLeft(g);}
        else if (this.getPosition()=="right"){this.drawMouseRight(g);}
        else if (this.getPosition()=="down"){this.drawMouseDown(g);}
             else if (this.getPosition()=="up"){this.drawMouseUp(g);}
     }

    public void moveForward(){
    
    if(this.position.equals("left")){
    if(this.x_position -50 >10){
        this.x_position -= 50;
        }
        // this.y_position -= 50;
        }
        else if(this.position.equals("right")){
               if(this.x_position +50 <290){
                 this.x_position +=50;
                 }
         // this.y_position -= 50;
        }else if (this.position.equals("down")){
        if(this.y_position +50 <270){
         this.y_position += 50;
         }
        }else if(this.position.equals("up")){
          if(this.y_position -50 >0){
        this.y_position -= 50;
        }
        }else{
          if(this.y_position +50 <270){
        this.y_position += 50;
        }
        }
        
    }
    public void move() {
        boolean done = false;
        while (!done){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What do you want to do:\n F - forward\n " +
                    "R - move Right \n L - move Left");
            String input=  scanner.nextLine();
            switch (input){
                case "F":this.moveForward();break;
                case "L":this.position = "left";break;
                case "R":this.position = "right";break;
                case "U":this.position = "up";break;
                case "D" :this.position = "down"; break;
                default: done = true;

            }

        }
    }


}

public class Runner {
    public static void main(String[] args){
        Mouse mouse = new Mouse(40,40,"horizontal");
        Box box = new Box(280,270,mouse);
        new Control(310,310,box,mouse);
      mouse.move();
    }
}

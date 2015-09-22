import java.util.Scanner;

public class StrollingTurtles2 {
  
  public static void main(String[] args) {
    World moon = new World (600,600);
    Scanner input = new Scanner(System.in);
    System.out.println("how many turtles?");
    int n = input.nextInt();
    Turtle[] turtles = new Turtle[n];
    
    for (int number = 0; number < n; number++) {
      int x = (int) (Math.random()*600)+1;
      int y = (int) (Math.random()*600)+1;
      turtles[number] = new Turtle (moon, x, y); 
    }
    System.out.println("how many steps?");
    int d = input.nextInt();
    for (int i = 0; i < d; i++) {
      for (Turtle turtle : turtles) {
        turtle.moveRandom();
//        try {
//          Thread.sleep(30);
//        } catch (InterruptedException ei) {}
      }
    }
  }
}
    
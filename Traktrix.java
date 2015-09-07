public class Traktrix {

     public static void main(String[] args) throws InterruptedException {  
        // Create the world and the turtles here and other necessary initializations
       

        World Gallifrey = new World(400,400);
        Turtle Doctor = new Turtle(Gallifrey,20,20);
        Turtle Dalek = new Turtle(Gallifrey,20,380);
        Turtle Silence = new Turtle(Gallifrey,380,380);
        Turtle Weepingangel = new Turtle(Gallifrey,380,20);
        
        int d = (int)(Doctor.distanceTo(200,200));
        
        while (d>20) {
           Doctor.turnTo(Dalek);
           Dalek.turnTo(Silence);
           Silence.turnTo(Weepingangel);
           Weepingangel.turnTo(Doctor);
           Doctor.move(20);
           Dalek.move(20);
           Silence.move(20);
           Weepingangel.move(20);
           
           d = (int)(Doctor.distanceTo(200,200));
           System.out.println(d);
           
           Thread.sleep(200);  // Makes the program sleep for 0.2 sec.
        } // Slut på while-satsen
     
     } // End of main method

  } // End of class 
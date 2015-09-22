public class StrollingTurtles {
  
  
     public static void main(String[] args) throws InterruptedException {  
        // Create the world and the turtles here and other necessary initializations 
        World Gallifrey = new World(400,400);
        Turtle Doctor = new Turtle(Gallifrey,175,200);
        Turtle Dalek = new Turtle(Gallifrey,225,200);
       
        double d = Doctor.distance(Dalek);
        int a = 0;
        int b = 0;
      
        while (d<200) {
           
          // Code that moves the turtles and checks for collisions
           b++;
           Doctor.moveRandom();
           Dalek.moveRandom();
           d = Doctor.distance(Dalek);
             
           if (d<20){
              System.out.println("Krock");
              a++;
           }
//           Thread.sleep(200);  // Makes the program sleep for 0.2 sec.
         } // Slut på while-satsen
        
        // Code that prints the number of steps and collisions      
       System.out.println(a+" krockar");
       System.out.println(b+" steg");
     } // End of main method

  } // End of class 
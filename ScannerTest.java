import java.util.Scanner;

public class ScannerTest {
  
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Hur många sidor ska tärningen ha?");
     int sides = sc.nextInt();
     Dice die = new Dice(sides);
     int [] freq = new int[sides];
     
     System.out.print("Hur ofta ska tärningen rullas?");
     int rolls = sc.nextInt();
     int value = 0;
     for (int i = 0; i < rolls; i++) {
       die.roll();
       value = die.getValue();
       freq[value-1] = freq[value-1] +1;
      // System.out.print(value + "\n");
     }

    System.out.println("side" + "\t" +"antal");
    
    for (int counter=1; counter<=sides; counter++) {
      double frequency = (double)freq[counter-1]/(double)rolls;
      System.out.println(counter + "\t" + freq[counter-1] + "\t" + frequency);
    }
     
     
   }
}
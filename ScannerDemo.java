import java.util.Scanner;

 public class ScannerDemo {

   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Beräknar medelvärdet av ett antal tal");
     System.out.print("Ge första tal: ");

     double sum = 0;
     int n = 0;
     while(sc.hasNextDouble()) {
       System.out.print("Ge nästa tal (sluta med något som inte är ett tal): ");  
       sum += sc.nextDouble();
       n++;
     }
     System.out.println("Medelvärdet av dessa " + n + " tal är " + sum/n);
     System.out.println("(Du skrev \"" + sc.next() + "\" för att avbryta");
   }

 }
 
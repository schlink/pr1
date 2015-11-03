 import java.util.Scanner;
 import java.io.*; 

public class Lottery {
  
  
  public static void main(String[] args) throws FileNotFoundException {
    PersonList people = new PersonList(); 
    people.load("persons.txt"); 
    Tombola t = new Tombola(people.getSize()); 
    Scanner input = new Scanner(System.in);
    System.out.println("How many tickets do you wish to draw?"); 
    int amount = input.nextInt(); 
    int i = 0; 
    System.out.println("winners: "); 
    PersonList peopleSorted = new PersonList(); 
    while (i<amount) {
      int nr = t.draw(); 
      i++;  
      peopleSorted.addNameSorted(people.get(nr)); 
    }
    System.out.println(peopleSorted.toString()); 
  }
}
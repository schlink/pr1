import java.util.ArrayList;
import java.io.*; 
import java.util.Scanner;

public class PersonList {
 
  private ArrayList<Person> list;
  
  public PersonList() {
     this.list = new ArrayList<Person>(); 
  }
  
  public int getSize()  {
    return this.list.size(); 
  }
  
  public void add(Person p)  {
    this.list.add(p); 
  }
  
  public void addNameSorted(Person p) {
    int i = 0;  
    while (i<this.list.size() && p.compareTo(this.list.get(i))>0 ) {
      i++;  
    }
    this.list.add(i,p); 
  }
  
  public void addAgeSorted(Person p) {
    int i = 0; 
    while (i<this.list.size() && p.getAge()>this.list.get(i).getAge()) {
      i++; 
    }
    this.list.add(i,p); 
  }
    
  public void load(String filename) throws FileNotFoundException {    
    File input = new File(filename);
    Scanner fscan = new Scanner(input,"ISO-8859-1");
    Person p;
    while (fscan.hasNextLine()) { 
      String name = fscan.nextLine(); 
      String address = fscan.nextLine(); 
      if (fscan.hasNextInt()) {
        int age = fscan.nextInt(); 
        if (fscan.hasNextLine()) {
          fscan.nextLine(); 
        }
        p = new Person(name,address,age);
      }
      else { 
        p = new Person(name,address,-1); 
      }
      this.list.add(p); 
    }
  }
  
  public Person get(int i) {
    return this.list.get(i);
  }
  
  public PersonList nameSorted()  {
    PersonList sorted = new PersonList();
    for (int i = 0; i<this.list.size(); i++) {
      sorted.addNameSorted(this.list.get(i)); 
    }
    return sorted; 
  }
  
  public PersonList ageSorted()  {
    PersonList sorted = new PersonList(); 
    for (int i = 0; i<this.list.size(); i++) {
      sorted.addAgeSorted(this.list.get(i)); 
    }
    return sorted; 
  }
    
  public String toString()  { 
    String s = ""; 
    for (int i = 0; i<this.list.size(); i++)  {
      s = s + this.list.get(i) + "\n";
    } 
    return s; 
  }
  
  public void print() {
    for (int i =0; i<this.list.size(); i++) {
      System.out.println(this.list.get(i)); 
    }
  } 
}
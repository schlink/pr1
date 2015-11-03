import java.util.ArrayList;

public class Tombola {

  private ArrayList<Integer> tombola; 
  private int originalSize;
  
  public Tombola(int n) { 
    this.tombola = new ArrayList<Integer>(); 
    for (int i = 0; i<n; i++) {
      this.tombola.add(new Integer(i+1)); 
    } 
    originalSize = this.tombola.size(); 
  }

  public int draw() {
    int b = 0;
    if (this.tombola.size()==0) {
      System.out.println("No more tickets available"); 
    }
    else {
      int a = (int)(Math.random()*(this.tombola.size()-1)); 
      b = this.tombola.get(a); 
      this.tombola.remove(a); 
    }
    return b; 
  }

  public void fill() { 
    this.tombola.clear();
    for (int i = 0; i<originalSize; i++) {
      this.tombola.add(new Integer(i+1)); 
    }
  }
  
  public boolean isEmpty()  {
    return this.tombola.isEmpty(); 
  }
  
  public String toString()  {
    return "The tombola has the following " + this.tombola.size() + "tickets available: " + this.tombola.iterator();
  }
}  
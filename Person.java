public class Person {
  
  private String name;
  private int age;
  private String address;
  
  public Person() {
    name = "NoName";
    age = 0;
  }
  
  public Person(int isage, String isname, String isaddress) {
    name = isname;
    age = isage;
    address = isaddress;
  }
  
  public String getAddress(){
    return address;
  }
  
  public int getAge() {
    return age;
  }
  
  public String getName() {
    return name;
  }
  
  public void birthday() {
    age++;
  }
  
  public int days() {
    int days = age*365;
    return days;
  }
  
  public String toString() {
    String s = "The person is called " + getName() + " and is roughly " + days() + " days old. They live on " + getAddress() + "."; 
    return s;
  }
  
  
}
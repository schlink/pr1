public class Person {
  
  private String name;
  private int age;
  private String address;
  
  public Person() {
    name = "NoName";
    age = 0;
  }
  
  public Person(String name, String address, int age) {
    this.name = name;
    this.age = age;
    this.address = address;
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
  
  public int compareTo(Person p) {
    int x = this.name.compareTo(p.getName());
    return x;
  }
  
  public boolean equals(Person p) {
    if (this.name.equals(p.getName())&& this.age==(p.getAge()) && this.address.equals(p.getAddress())) {
      return true;
    } else {
      return false;
    }
  }
  
  public String toString() {
    String s;
    if (this.getAge() < 0) {
      s = this.getName() + "\n" + this.getAddress() + "\n";
    } else {
      s = this.getName() + "\n" + this.getAddress() + "\n" + this.getAge() + "\n"; 
    }
    return s;
  }
}
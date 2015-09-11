public class PersonTest {
  public static void main(String [] arg) {
    Person a = new Person(21, "Link", "Flogstavägen");
    System.out.println(a.toString());
    a.birthday();
    System.out.println(a.toString());
  }
}
    
import junit.framework.TestCase;

/**
 * A JUnit test case class.
 */
public class TestPerson extends TestCase {

  public void testGetName() {
    Person p = new Person("Mr x", "", 0);
    assertEquals("Mr x", p.getName());
  }
  
  public void testGetAddress() {
    Person p = new Person("", "Mullholland Drive", 0); 
    assertEquals("Mullholland Drive", p.getAddress());
  }
  
  public void testCompareTo() {
    Person p = new Person("Anna", "2415", 0);
    Person q = new Person("Tom", "2414", 0);
    assertEquals(p.compareTo(q)<0, true);
    assertEquals(p.compareTo(q)>0, false);
    assertEquals(p.compareTo(p)==0, true);
  }

  public void testEquals() {
    // Try to make sure that == comparison on strings fail
    String name = "Abe";
    Person p = new Person(name+'l', "2415", 0);
    Person q = new Person(name+'l', "2414", 0);
    Person r = new Person(name+'l', "2415", 0); 

    assertEquals(p.equals(q), false);
    assertEquals(p.equals(r), true);
    
  }
  
}
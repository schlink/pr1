import junit.framework.TestCase;


public class TestPersonList extends TestCase {

  public void testMostThings() {
    PersonList pl = new PersonList();
    pl.add(new Person("G", "g", 4));  // empty
    pl.add(new Person("A", "a", 3));  // first
    pl.add(new Person("X", "x", 2));  // last
    pl.add(new Person("C", "c", -1));  // n the middle
    assertEquals(pl.get(0).getName(), "G");
    assertEquals(pl.get(1).getName(), "A");
    assertEquals(pl.get(2).getName(), "X");
    assertEquals(pl.get(3).getName(), "C");
    assertEquals(pl.getSize(), 4);
    PersonList ns = pl.nameSorted();
    assertEquals(ns.get(0).getName(), "A");
    assertEquals(ns.get(1).getName(), "C");
    assertEquals(ns.get(2).getName(), "G");
    assertEquals(ns.get(3).getName(), "X");
    PersonList as = pl.ageSorted();
    assertEquals(as.get(0).getName(), "C");
    assertEquals(as.get(1).getName(), "X");
    assertEquals(as.get(2).getName(), "A");
    assertEquals(as.get(3).getName(), "G");
    System.out.println("\nOriginal order:");
    pl.print();
    System.out.println("\nName sorted:");
    ns.print();
    System.out.println("\nAge sorted:");
    as.print();
  }
  
}
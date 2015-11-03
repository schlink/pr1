import junit.framework.TestCase;
import java.util.ArrayList;

/**
 * A JUnit test case class.
 */
public class TestTombola extends TestCase {
  
  public void testTombola() {
    Tombola t = new Tombola(1);
    assertEquals(false, t.isEmpty());
    assertEquals(1, t.draw());
    assertEquals(true, t.isEmpty());
    t.fill();
    assertEquals(1, t.draw());
    assertEquals(true, t.isEmpty());
    
    t = new Tombola(2);
    int x1= t.draw();
    int x2= t.draw();
    assertEquals(true, (x1==1 && x2==2) || (x1==2 && x2==1));
    
    int testSize=10; // Value 1 will fail the test, 2 will fail half of the times
    Tombola u = new Tombola(testSize);
    t = new Tombola(testSize);
    ArrayList<Integer> fromT = new ArrayList<Integer>();
    ArrayList<Integer> fromU = new ArrayList<Integer>();
    for (int i=0; i<testSize; i++) {
       fromT.add(t.draw());
       fromU.add(u.draw());
    }
    assertEquals(false, fromT.equals(fromU));
  }
}
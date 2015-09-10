public class PairOfDiceTest {
 
  public static void main(String [] arg) {
    PairOfDice d = new PairOfDice(6);
    for (int n=0; n<10; n++) {
      d.rollPair();
      if (d.isPair()) {
        System.out.println(d.toStringPair() + "   Pair");
      } else {
        System.out.println(d.toStringPair());
      }
    }
  }
}
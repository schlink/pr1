public class PairOfDice {
  
  private Dice bert;
  private Dice ernie;
  
  public PairOfDice() {
    this.bert = new Dice(6);
    this.ernie = new Dice(6);
  }
 
   public PairOfDice(Dice bert, Dice ernie) {
    this.bert = bert;
    this.ernie = ernie;
  }
  
  public PairOfDice(int n) {
    this.bert = new Dice(n);
    this.ernie = new Dice(n);
  }
 
  public void rollPair() {
    bert.roll();
    ernie.roll();
  }
  
  public int getValueBert() {
    return bert.getValue();
  }
  
  public int getValueErnie() {
    return ernie.getValue();
  }
  
  public boolean isPair() {
    if (getValueBert() == getValueErnie()) {
      return true;
    } else {
      return false;
    }
  }
  
  public String toStringPair() {
    return "{" + ernie.toString() + ", "  + bert.toString() + "}" ;
  }
  
  
}
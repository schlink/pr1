/**
 * Class for practicing fundamental array handling 
 * @author PVJ
 * 
 */
public class ArrayPlay {
  
  private int[] theArray;

  
  /**
   * Constructs an ArrayPlay object with integer random number in [0, limit-1]
   * @param n  the number of values (size of the array)
   * @param limit the upper limit (exclusive)
   */
  public ArrayPlay(int n, int limit) {
    this.theArray = new int[n];
    this.randomize(limit);
  }

  
  /** 
   * Constructor that takes the size of the array.
   * The array is filled with random numbers 0-9.
   * @param n the size of the array
   */ 
  public ArrayPlay(int n) {
    this(n, 10);
  }
  
  /** 
   * Constructor that creates an object with 10 integers
   */
  public ArrayPlay() {
    this(10);
  }

  /**
   * Method to get the value stored at a specified index
   * @param index the index
   * @return the stored value
   */
  public int get(int index) {
    return this.theArray[index];
  }
  
  /**
   * Method to return a text representation of the object
   * @return the text representation
   */
  public String toString() {
    String ret = "";
    for (int i= 0; i< this.theArray.length; i++) {
      ret = ret + this.theArray[i];
      if (i<this.theArray.length-1) {
        ret = ret + ",  ";
      }
    }
    return "{" + ret + "}";
  }
  
  /**
   * Method to fill the array with non negative random numbers
   * @param limit the upper limit. All numbers will be less than this value
   */
  public void randomize(int limit) {
    for (int i = 0; i<this.theArray.length; i++) {
      this.theArray[i] = (int)(Math.random()*limit);
    }
  }
  
  //////////////// Put more methods here ////////////////////////////

  
  public int maxValue() {
    int i = 0;
    int n = this.theArray.length-1;
    int maxValue;
    int valueOne = this.get(i);
    i++;
    int compareValue = this.get(i);
    while (i<n) {
      if (valueOne>compareValue) {
        i++;
        compareValue = this.get(i);
      } else {
        i++;
        valueOne = this.get(i);
      }
    }
    if (valueOne>compareValue) {
      maxValue = valueOne;
    } else {
      maxValue = compareValue;
    }
    
    
//    int i = 0;
//    int n = this.theArray.length-1;
//    int maxValue = 0;
//    while (i < n) {
//      int currentValue = get(i);
//      if (currentValue > maxValue) {
//        maxValue = currentValue;
//      }
//      i++;
//    }
    
    
//    int maxValue = 0;
//    for (int currentValue : theArray) {
//      if (currentValue > maxValue) {
//        maxValue = currentValue;
//      }
//    }
    return maxValue;
  }
  
public int maxIndex() {
    int maxValue = maxValue();
    int i = 0;
    int maxIndex = 0;
    while (i<this.theArray.length-1) {
      int currentValue = this.get(i);
      if (maxValue == currentValue) {
        maxIndex = i;
      }
      i++;
    }
    return maxIndex;
  } 
    
  
  
  
} ////////////// end of class ArrayPlay ///////////////////////////
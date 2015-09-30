/**
 * used to store any number of values and get information
 * about them
 */

public class Measurements {
  
  private  double[] array;
  private int stored = 0;
  
  /**
  * initialises an array 
  */
  public Measurements(int max) {
    this.array = new double[max];
  }
  
  /**
   * returns a string-object with the values 
   * which have been stored in the array
   */
  
  public String toString() {
    String s = "<";
    for (int i = 0; i<this.stored; i++) {
      s = s + this.array[i];
      if (i<this.stored-1) {
        s = s +  ", ";
      }      
    }
  return s + ">";
  }
  
  /**
   * adds input numbers to the array
   * and doubles the size of the array
   * if it is full
   */
  
  public void add(double value) {
    int counter = 0;
    double a = 0;
    
    if (this.stored > this.array.length-1) {
      double[] temp = new double[this.stored+1];
      
      while (counter < this.stored) {
        a = this.array[counter];
        temp[counter]=a;
        counter++;
      }
      
      array = new double[2*this.array.length];
      for (int i = 0; i <= this.stored; i++) {
        this.array[i] = temp[i];
      }
      this.array[this.stored] = value;
      
    } else {
      this.array[this.stored] = value;
    }
    
    this.stored = this.stored + 1; 
  }
   
  /**
   * returns the number of stored elements
   * in the array
   */
  
  public int stored() {
    return stored;
  }
   
  /**
   * returns the value of the element on the
   * given index of the array
   */
   
  public double get(int index) {
    return this.array[index];
  }
   
  /**
   * returns the mean value of all elements
   * in the array
   */
   
  public double mean() {
    double sum = 0;
    int i = 0;
    while (i<stored) {
      sum = sum + this.array[i];
      i++;
    }
    return sum/this.stored;
  } 
   
  /**
   * returns the minimum value of the array
   */
   
  public double min() {
    double min = this.array[0];
    int i = 0;
    while (i < this.stored) {
      double currentValue = this.array[i];
      if (currentValue < min) {
        min = currentValue;
      }
      i++;
    }
    return min;
  }
   
  /**
   * returns the maximum value of the array
   */
   
  public double max() {
     double max = 0;
     for (double currentValue : this.array) {
       if ((int) currentValue > max) {
         max = currentValue;
       }
     }
     return max;
   }
     
  /**
   * returns the standard deviation of the
   * stored values
   */
    
  public double stdDev() {
    double d = 0;
    double sum = 0;
    int n = 0;
    while (n<this.stored) {
      d = Math.pow(this.array[n]-this.mean(),2);
      sum = sum + d;
      n++;
    }
    return Math.sqrt(sum/n);
  }
  
  /**
   * konstruktor
   * copies the array 'values' into a new array 'array'
   */
  
  public Measurements(double[] values) {
    this.stored = values.length;
    this.array = new double[values.length];
    for (int i=0; i < this.stored; i++) { 
      this.array[i] = values[i];
    }
  }
  
  /**
   * returns an array with all stored numbers
   */
  
  public double[] getArray() {
    double[] getArray = new double[this.stored];
    for (int i=0; i<this.stored; i++) {
      getArray[i] = this.array[i];
    }
    return getArray;
  }
  
  /**
   * creates a new object with balanced values
   */ 
  
  public Measurements smooth() {
    Measurements value = new Measurements(this.stored);
    for (int i = 0; i<this.stored; i++) {
      if (i>0 && i<this.stored-1) {
        value.add((this.array[i-1]+this.array[i]+this.array[i+1])/3);
      }
      else {
        value.add(this.array[i]);
      }
    }
    return value;
  }
      
}
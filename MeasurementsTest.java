public class MeasurementsTest {
  
  public static void main(String [] arg) {
    
    Measurements test = new Measurements(4);
  
    System.out.println("nothing added");
    System.out.println(test.toString());
    test.add(3.55);
    test.add(5.690);
    test.add(1);
    System.out.println("\n");
    System.out.println(test.stored() + " numbers added");
    System.out.println(test.toString());
    test.add(4);
    test.add(0.001);
    test.add(399);
    System.out.println("\n");
    System.out.println(test.stored() + " numbers added");
    System.out.println(test.toString());
    System.out.println("\n");
    System.out.println("get index 5");
    System.out.println(test.get(5));
    System.out.println("\n");
    System.out.println("get mean");
    System.out.println(test.mean());
    System.out.println("\n");
    System.out.println("get min");
    System.out.println(test.min());
    System.out.println("\n");
    System.out.println("get max");
    System.out.println(test.max());
    System.out.println("\n");
    System.out.println("Standard deviation");
    System.out.println(test.stdDev());
    
    double[] testArray = {4, 7, 9.4, 2};
    
    Measurements test2 = new Measurements(testArray);
    
    System.out.println("\n");
    System.out.println("copied array {4, 7, 9.4, 2}");
    System.out.println(test2.toString());
    
    System.out.println("\n");
    System.out.println("get first array, then second");
    
    for (double currentValue : test.getArray()) {
      System.out.print(currentValue + "  ");
    }
    System.out.println("\n");
    for (double currentValue : test2.getArray()) {
      System.out.print(currentValue + "  ");
    }

    System.out.println("\n");
    System.out.println("get first array smooth");
    System.out.println(test.smooth());
  
  }
}
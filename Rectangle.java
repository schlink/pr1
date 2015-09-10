/** 
   * Represents a rectangle defined by height and width 
   */
  public class Rectangle {

     //****************************** 
     private double width;
     private double height;

     //****************************** 
     public Rectangle() {
        width = 0;
        height = 0;
     }

     public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
     }

     //******************************
     public void setWidth(double width) {
        this.width = width; 
     }

    

     public double area() { 
        double a;
        a = width * height;
        return a;     //OBS! Metoden returnerar ett tal
     }

      public void setHeight(double h) {
        height = h; 
     }
     
     public double circumference() {
       double omkrets = 2*width+2*height;
       return omkrets;
     }
     
     public String toString() {
        String s = "The rectangle is " + width + " by " + height + " area units.";  
        return s;
     }

     public static void main(String [] arg) {
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(3, 2);

        rec1.setWidth(4);
        rec1.setHeight(5);
        System.out.println(rec1);
        double yta;
        yta = rec1.area();
        System.out.println("Rectangle 1 has the area " + yta);
        //double c = rec2.circumference();
        System.out.println("Rectangle 2 has the circumference " + rec2.circumference());
     }
  }
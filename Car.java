/**
 * Klassen beskriver en bil. 
 * @author ...
 * 
 */

public class Car {

    //====INSTANSVARIABLER:  ======================

    private String brand;
    private String owner;       //ägarens namn
    private int year;   //Årsmodell
    private int km;        //antal km

    //====KONSTRUKTORER: ==========================

    public Car() {      //Skapa en Rolls Royce, 1934 som du äger
      owner = "Link" ;
      brand = "RollsRoyce";
      year = 1934;
    }
   
    
    public Car(String abrand, String aowner, int ayear, int akm) { //Skapa valfri bil
        owner = aowner;
        brand = abrand;
        year = ayear;
        km = akm;
    }

    //====METODER:  ===============================

    public int getKm() {      //returnera antal km bilen kört
        return km;
    }

    public String getBrand() {   //returnera vilket märke bilen är av
        return brand;
    }

public String getName() {               //Skriv en metod som returnerar ägarens namn
        return owner;
    }

    public void setOwner(String newOwner) { //bilen byter ägare
        owner = newOwner;
    }

    public void drive(int distance) { //öka på antal kilometer bilen kört. Inget returneras.
        km = km + distance;
    }

    public String toString() {
        String info = getName() + " owns the " + getBrand() + " from year " + year + " with " + getKm() + " km." ;
        return info;
    }

    public static void main(String[] arg) {
 Car a = new Car();
 Car b = new Car("Volvo", "Siv Knut", 1994, 28000);

        System.out.println(a);
        System.out.println(b);
        a.drive(200);
        System.out.println(a);

        System.out.println(a.getBrand() + " is owned by " + a.getName());
        System.out.println("Sell " + a.getBrand());
        a.setOwner("Per Kvist");
        System.out.println(a.getBrand() + " ägs nu av " + a.getName());        
    }
}
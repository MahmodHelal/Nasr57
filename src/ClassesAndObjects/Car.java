package ClassesAndObjects;

public class Car {
    String color;
    String brand;
    int year;

    public void walk(){
        System.out.println("Car is walking");
    }
    public void brake(){
        System.out.println("Car is breaking");
    }
    public void stop(){
        System.out.println("Car is stopping");
    }


    public void displayInfo(){
        System.out.println("Color is "+ color);
        System.out.println("Brand is "+ brand);
        System.out.println("Year is "+ year);
    }
}

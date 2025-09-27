package ClassesAndObjects;

public class MainClassForTest {
    public static void main(String[] args) {


        Car BMW = new Car("BMW X7");
        Car Fiat = new Car("FIAT X500");
        Car Mercedes = new Car("Mercedes C200");


        BMW.color = "Red";
        BMW.brand = "BMW X7";
        BMW.year = 2025;
        Fiat.brand = "FIAT X500";
        Fiat.year = 2024;
        Mercedes.color = "White";
        Mercedes.brand = "Mer C200";



        BMW.displayInfo();
        System.out.println("**************");
        Mercedes.displayInfo();
        System.out.println("**************");
        Fiat.displayInfo();
        System.out.println("**************");
        BMW.walk();
        Fiat.walk();
        Mercedes.walk();


    }
}

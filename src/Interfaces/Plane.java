package Interfaces;

public class Plane extends Vehicle implements Flyable{
    @Override
    public void start() {
        System.out.println("Plane is starting");
    }

    @Override
    public void stop() {
        System.out.println("Plane is stopping");
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    public void land() {
        System.out.println("Plane is landing");
    }
}

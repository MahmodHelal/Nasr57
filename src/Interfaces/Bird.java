package Interfaces;

public class Bird extends Animal implements Flyable{
    @Override
    public void makeSound() {
        System.out.println("Bird is making sound");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void land() {
        System.out.println("Bird is landing");
    }
}

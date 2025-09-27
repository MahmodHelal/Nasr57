package Interfaces;

public abstract class Animal {
    String name;
    int age;

    public abstract void makeSound();
    public abstract void sleep();

    public void eat(){
        System.out.println("Animal is eating");
    }
}

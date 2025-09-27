package OOP;

public class Animal {
    public String name;
    public int age;

     protected String protectedVar; // same package and sub class
     String defaultVar;

    public void makeSound(){
        System.out.println("Animal is making sound");
    }
}

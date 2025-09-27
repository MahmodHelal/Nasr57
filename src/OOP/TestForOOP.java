package OOP;

import Methods.Cat;

public class TestForOOP {
    public static void main(String[] args) {
/*

        BankAccount accountOne = new BankAccount();

//        accountOne.balance = -100;

        accountOne.setBalance(-100);

        int balance =accountOne.getBalance();


        System.out.println("Balance is " + balance);
*/

/*        Calculator calc = new Calculator();

        int result = calc.add(20,10);
        double result2 = calc.add(20,10.5);

        System.out.println("Result is " + result);*/

        Cat cat = new Cat();

        cat.age =10;
        cat.name = "cat1";
        cat.makeSound();
        cat.sleep();

        Animal animalCat = new Animal();

        animalCat.makeSound();


        Animal[] animals ={new Cat(), new Dog()};

    }
}

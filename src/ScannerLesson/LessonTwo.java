package ScannerLesson;

import java.util.Scanner;

public class LessonTwo {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

       /* System.out.println("Enter First Number");
        int num1 =input.nextInt();

        System.out.println("Enter Second Number");
        double num2 =input.nextDouble();


        System.out.println("Sum is " + (num1+num2));
*/
        /*System.out.println("Please Enter Your Name");
        String name = input.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Please Enter Your first Name");
        String name2 = input.next();
        System.out.println("Hello " + name2);*/


        /*System.out.println("Please Enter Your Age");
        String age = input.next();

        System.out.println("Age is " + age);

        System.out.println("Please Enter Your Name");
        String name = input.nextLine();

        System.out.println("Hello " + name + " You are " + age + " years old");*/


        /*System.out.println("Please Enter Your Name");
        String name = input.nextLine();

        System.out.println("Please Enter Your Friend name");
        String secondName = input.nextLine();

        System.out.println("Hello " + name + " and " + secondName);*/

/*
        Write a program that:
        Asks the user for their name, age, and favorite programming language. Calculates their age in months.
                Uses the ++ operator to show their age next year.

                Hello! My name is Mo Salah
        I am 25 years old, which is 300 months My favorite programming language is Java Next year I will be 26 years old
*/


        /*System.out.println("Please Enter Your Name");
        String name = input.nextLine();
        System.out.println("Please Enter Your Age");
        int age = input.nextInt();
        System.out.println("Please Enter Your Favorite Programming Language");
        String language = input.next();

        System.out.println("Hello! My name is " + name);
        System.out.println("I am " + age + " years old, which is " + age*12 + " months");
        System.out.println("My favorite programming language is " + language);
        System.out.println("Next year I will be " + ++age);*/




        /*Create a Java program that takes two numbers and performs: Addition
Subtraction Multiplication Division
Input: Two double values	Output: All four results

// Example:
Enter first number: 10 Enter second number: 5

Sum = 15.0
Difference = 5.0
Product = 50.0
Quotient = 2.0*/
        System.out.println("Enter first number");
        double num1 = input.nextDouble();

        System.out.println("Enter second number");
        double num2 = input.nextDouble();

        System.out.println("Sum = " + (num1+num2));
        System.out.println("Difference = " + (num1-num2));
        System.out.println("Product = " + (num1*num2));
        System.out.println("Quotient = " + (num1/num2));







    }
}

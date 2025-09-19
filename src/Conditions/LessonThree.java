package Conditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LessonThree {
     static int Helal = 10;

    public static void main(String[] args) {



        /*int age = 20;

        if (age > 18) {
            System.out.println("You are eligible to vote");
        }
        System.out.println("You are not eligible to vote");


       *//* if (age>18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }*/

        Scanner input = new Scanner(System.in);

      /*  System.out.println("Enter Your Grade");
        int grade =  input.nextInt();*/


/*if (grade >= 90) {
            System.out.println("A");
        }else if (grade >= 60) {
            System.out.println("D");
        }
        else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        }
        else {
            System.out.println("F");
        }*/

/*        switch (grade ){
            case 90:
                System.out.println("A");

            case 80:
                System.out.println("B");
                break;
            case 70:
                System.out.println("C");
                break;
            default:
                System.out.println("F");
                break;

        }*/


/*        int numberOfDay = 8;

        switch (numberOfDay){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid Day");
                break;
        }*/
        /*
Task:
Write a program that takes a character grade from the user (A, B, C, D, F) and prints:
A → "Excellent"
B → "Very Good"
C → "Good"
D → "Pass" F → "Fail"
Anything else → "Invalid grade" Use Scanner + switch
*/

/*        System.out.println("Enter your Grade");
        char grade = input.next().toUpperCase().charAt(0);// A a

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
        }*/

        /*System.out.println("Enter a Number");
        int num = input.nextInt();
        System.out.println("Enter a Result");
        String result = input.nextLine();
        System.out.println(result);

        System.out.println("***************");

        System.out.println("Enter a Number");
        int num1 = input.nextInt();
        System.out.println("Enter a Result2");
        String result2 = input.nextLine();
        System.out.println(result2);
*/

   /*     int num1 = 10;
        int num2 = 0;*/
/*
        if ((num2 / num1)== 2 && (num1 / num2)==0){
            System.out.println("Both are Zero");
        }*/


/*        int age = 20;
        if (age>= 18)
            System.out.println("You are eligible to vote");
        else {

            System.out.println("You are not eligible to vote OutsideIfCondition ");
        }


        int x = 10;
        Integer y = 10;*/

        for (int i =0; i<=5; i++){

            if (i==3){
                System.out.println("i = "+ i);
                break;
            }
        }

        System.out.println("After the loop");




    }
}

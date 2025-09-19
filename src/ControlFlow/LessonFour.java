package ControlFlow;


import Methods.LessonFive;

import java.util.*;

public class LessonFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*//print from 1 to 5
        for (int i = 1 ; i<=5 ; i++){
            System.out.println("i = "+ i + " for iteration number "+ i);
        }*/




/*    for (int i = 0 ; i <= 12 ; i++){// i = i + 1
//        System.out.println(i * 5);

        System.out.println( i + " x 5 = " + (i*5) );

    }*/



/*        for (int i = 0; i <= 5 ; System.out.println("Hello"+ i++)){
            System.out.println(i);
        }*/


//        for (int i = 1 ; i< 5 ; i++){
//            System.out.print("* ");
//        }


        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
/*        for (int i = 1 ; i<= 4; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/


       /* int x  =1;

        for (int i = 1 ; i<=5;i++){
            System.out.println(i);
            x++;
        }//5
        for (int i = 1 ; i<=5;i++){
            System.out.println(i);
            x++;
        }//5
        for (int i = 1 ; i<=5;i++){
            System.out.println(i);
            x++;
        }//5*/

/*
        }while (i<=5);

        System.out.println("after second  while loop" + i);//6

        int i = 1;
        while (i<=5) {
            System.out.println("from while loop" + i);
            i++;
            x++;
        }//5
        System.out.println("after first  while loop" + i);//6


        System.out.println("value od x  = " +x);//21

       *//* while (i<=5) {
            System.out.println("second while loop" + i);
            i++;
        }*//*
    do

    {
        System.out.println("second do while loop" + i);
        i++;
    }while (i<=5);*/


        String password =
                "Amit123";
        String inputPassword;
        System.out.println("Please enter your password");
        int count = 1;
        int maxAttempts = 3;

/*        do {
            inputPassword = scanner.next();
             if (password.equals(inputPassword)){
                 System.out.println("Correct Password");
                 break;
             }else {

                 if (count<maxAttempts){
                     count++;
                     System.out.println("Incorrect Password");
                     System.out.println("Please try again");
                 }else {
                     System.out.println("Too many attempts");
                     break;
                 }
             }

        }while (count<= maxAttempts);*/
/*        System.out.println("Please enter your password");
        do {
            inputPassword = scanner.next();
            count++;
        }while (count<=maxAttempts && !password.equals(inputPassword));



        if (password.equals(inputPassword)){
            System.out.println("Correct Password");
        }else {
            System.out.println("Incorrect Password");
            System.out.println("Too many attempts");
        }*/





    }

}

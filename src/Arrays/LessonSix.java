package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LessonSix {
    public static void main(String[] args) {

   /*     int num1 = 1;
        int num1 = 1;
        int num1 = 1;
        int num1 = 1;
        int num1 = 1;
        int num1 = 1;
        int num1 = 1;*/

       /* Scanner  input = new Scanner(System.in);

        System.out.println("Please enter your length of array");
        int length = input.nextInt();*/
/*
        int[] numbers  = {1,2};
        String[] names = new String[]{"Ali","Ahmed","Mohamed"};


        System.out.println("last name " + names[names.length-1]);

        System.out.println("last numbers2[] before assign  " + numbers2[numbers2.length-1]);
        numbers2[numbers2.length-1] = 123;
        System.out.println("last numbers2[] after assign  " + numbers2[numbers2.length-1]);
        System.out.println("Before filling"+Arrays.toString(numbers2));

        numbers2[0] = 10;
        numbers2[1] = 20;
        numbers2[2] = 30;
        numbers2[3] = 40;
//        numbers2[4] = 50;


        System.out.println("After filling"+Arrays.toString(numbers2));


        */



        int[] array = new int[5]; // 1 2 3 4 5

 /*       for (int i = 0; i<= array.length-1; i++){
            array[i] =i + 1;

        }*/
        double[] numbers2 = new double[4];// 10 20 30 40
        for (int i = 0 ; i< numbers2.length ; i++ ){
            numbers2[i] = (i+1)*10;
        }

/*        System.out.println(numbers2[0]);
        System.out.println(numbers2[1]);
        System.out.println(numbers2[2]);
        System.out.println(numbers2[3]);*/

//        System.out.println( "After Filling Array "+ Arrays.toString(numbers2));

double sum = 0;

        for (int i = 0; i<= numbers2.length-1 ; i++){
            System.out.println("number " + (i+1)+" is " + numbers2[i]);
            sum = sum + numbers2[i];
        }

        System.out.println("sum of array is "+sum);





    }
}

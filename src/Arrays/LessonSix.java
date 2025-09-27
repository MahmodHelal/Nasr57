package Arrays;


import java.util.ArrayList;
import java.util.List;
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
/*



        int[] array = new int[5]; // 1 2 3 4 5

 */
/*       for (int i = 0; i<= array.length-1; i++){
            array[i] =i + 1;

        }*//*

        double[] numbers2 = new double[4];// 10 20 30 40
        for (int i = 0 ; i< numbers2.length ; i++ ){
            numbers2[i] = (i+1)*10;
        }

*/
/*        System.out.println(numbers2[0]);
        System.out.println(numbers2[1]);
        System.out.println(numbers2[2]);
        System.out.println(numbers2[3]);*//*


//        System.out.println( "After Filling Array "+ Arrays.toString(numbers2));

double sum = 0;

        for (int i = 0; i<= numbers2.length-1 ; i++){
            System.out.println("number " + (i+1)+" is " + numbers2[i]);
            sum = sum + numbers2[i];
        }

        System.out.println("sum of array is "+sum);



*/

/*
        int[] Rashford = {1,2,3,4,5};


        for (int i =0 ; i<= Rashford.length-1 ; i++){
            System.out.println("numbers from traditional loop is " + Rashford[i]);
        }

        System.out.println("*******************");



        for (int number : Rashford){
            System.out.println("numbers from for each loop is " + number);
        }*/
        /*        String[] names = {"Ali","Ahmed","Mohamed"};


        for (int i =0 ; i<= names.length-1 ; i++){
            System.out.println("names fro traditional loop " + names[i]);
        }

        System.out.println("*******************");

        // for each
        for (String helal : names){
            System.out.println("names from for each loop " + helal);
        }*/

     /**************************************  Two Dimensional Array **********************************/

/*int[] row1 = {1,2,3};
int[] row2 = {4,5,6,7,8};
int[] row3 = {7,8,9};*/

/*

            // 1 2 3
            // 4 5 6 7 8
            // 7 8 9


        // [row][column]
        System.out.println(numbers[0][0]);//1
        System.out.println(numbers[2][1]);//8

        System.out.println(numbers.length);// length of rows
        System.out.println(numbers[1].length);// length of column one*/


        // row number 0
        // print all elements from row number 0

        // row number 1
        // print all elements from row number 1

        // row number 2
        // print all elements from row number 2

        //

//        numbers[i].length

/*        String[] names = {"Ali","Ahmed","Mohamed"};


        for (int i =0 ; i<= names.length-1 ; i++){
            System.out.println("names fro traditional loop " + names[i]);
        }

        System.out.println("*******************");

        // for each
        for (String helal : names){
            System.out.println("names from for each loop " + helal);
        }
   for (int i = 0 ;i < numbers.length ; i++) {//0 1 2 -> 3 rejected
            for (int j = 0; j < numbers[i].length;j++){
                System.out.print(numbers[i][j]+ " ");
                // 00 " " 01 " " 02 " " -> 03 rejected -> increment i i will be
                // 10 " " 11 " " 12 " " 13 " " 14 " " -> 15 rejected -> increment i i will be 2
                // 20 " " 21 " " 22 " " -> 23 rejected -> increment i i will be 3

            }
            System.out.println();
        }*/        // 1 2 3
        // 4 5 6 7 8
        // 7 8 9
  /*      int [][] numbers = {{1,2,3}, {4,5,6,7,8}, {7,8,9}};


        System.out.println(numbers[1][4]);//8


        System.out.println("*******************");*/

        /*
        * ask user
number of rows=> 2
number of columns=>2

int [2][3]

then let user fill 2d array
please enter element number [] for row number [] :

then print 2d array
print
*/


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number of rows");
        int rows = scanner.nextInt();

        System.out.println("Please enter number of columns");
        int columns = scanner.nextInt();


        int[][] Leva = new int[rows][columns];


        for (int i = 0; i< Leva.length;i++){
            for (int j =0 ; j< Leva[i].length;j++){
                System.out.println("Please enter element number " + (j+1) + " for row number " + (i+1));
                Leva[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i< Leva.length;i++){
            for (int j =0 ; j< Leva[i].length;j++){
                System.out.print(Leva[i][j]+ " ");
            }
            System.out.println();
        }



        int[][] Rashford = {{1,2,3,4},{4,5,4,6}};
        int[][] Rashford2 = new int[2][4];




    }

    public static void printArray(int[][] array){
        for (int i = 0; i< array.length;i++){
            for (int j =0 ; j< array[i].length;j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public void carDriver(){
        System.out.println("I am car driver");
    }
}

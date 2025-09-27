package Methods;

import OOP.Animal;

public class LessonFive {
    Animal animal;



    public static void main(String[] args) {



   int price = totalPrice(20,30);
        System.out.println("price after discount is "+price+ " $");

    }

    public static int totalPrice(int priceOfProduct1, int priceOfProduct2){
        int totalCalc = priceOfProduct1 + priceOfProduct2;
        int discount = 5;


        return  totalCalc - discount;
        



    }

    public  void hello(String name){
        System.out.println("Hello "+ name);
    }


}

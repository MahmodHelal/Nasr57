package OOP;

public class BankAccount {
    private int balance;
    Animal animal;




    // getter and setters
    public void setBalance(int amount){
animal.defaultVar="Hello";
        if(amount >= 0){
        balance = amount;}else {
//            balance =0;
//            System.out.println("Invalid amount");
            throw new IllegalArgumentException("Invalid amount");
        }
    }

    public int getBalance(){
        return balance;
    }




}

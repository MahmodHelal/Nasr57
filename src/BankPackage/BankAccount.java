package BankPackage;

public class BankAccount {

    public  String BankName = "MID";
    private int AccountNumber;
    private double balance;
    private String ownerName;

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    double maxAmountForDeposit = 20000;
    double maxAmountForWithdraw = 10000;

    public BankAccount(double balance){
        this(balance,10);
    }
    public BankAccount(){
        System.out.println("FirstLine");
    }

    public BankAccount(double balance,int conAccountNumber){
        this.balance = balance;
        AccountNumber = conAccountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }



    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double amount){
        if (amount <= maxAmountForDeposit&& amount > 0){
            balance += amount;
        }else {
            System.out.println("Amount is too large");
        }
    }

    public void withdraw(double amount) {
    if(amount <= balance && amount != 0 && amount <= maxAmountForWithdraw){
        balance -= amount;
    }else {
        System.out.println("Invalid amount");
    }
    }


    public void displayInfo(){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Balance: " + balance);

    }
}

package BankPackage;

public class SavingAccount extends  BankAccount{
    double interestRate = 0.10;

public SavingAccount(double balance,int accountNumber){
    super(balance,accountNumber);
}

    public double calculateInterest(){
        return super.getBalance()*interestRate;
    }
    @Override
    public double getBalance(){
        double result = calculateInterest()+ super.getBalance();
        return result;
    }

}

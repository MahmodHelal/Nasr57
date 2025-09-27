package BankPackage;

public class CurrentAccount extends BankAccount{
    double overDraftLimit = 3000;

    public CurrentAccount(double consBalance) {
        super(consBalance);
    }


    public void withdraw(double amount) {
        if(amount != 0 && amount <= maxAmountForWithdraw && amount <= overDraftLimit+getBalance()){
            setBalance(getBalance() - amount);
        }else {
            System.out.println("Invalid amount");
        }
    }
}

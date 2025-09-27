package BankPackage;

public class MainBank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(300);
        System.out.println("BANK ACCOUNT************************");
      /*  account.displayInfo();

        account.setOwnerName("John");
        account.setAccountNumber(123456);
        account.withdraw(200);
        account.displayInfo();*/
        System.out.println("BankAccountObject :- "+account.getBankName());
//        account.setBankName("Helal Bank");
        account.BankName = "Mo Bank";
        System.out.println("BANK ACCOUNT************************");
        System.out.println("--------------------------------");


        SavingAccount account1 = new SavingAccount(400.0,123);
        System.out.println("SAVING ACCOUNT************************");
       /* account1.displayInfo();                account1.setOwnerName("John"); account1.setAccountNumber(123456);
        account1.withdraw(200);
        System.out.println("Balance------------");
        System.out.println(account1.getBalance());
        System.out.println("Balance-----------");
        account1.displayInfo();*/
        System.out.println("SavingAccountObject :- "+account1.getBankName());
        System.out.println("SAVING ACCOUNT************************");
        System.out.println("--------------------------------");


        CurrentAccount account2 = new CurrentAccount(1000);
        System.out.println("CURRENT ACCOUNT************************");
      /*  account2.displayInfo();                account2.setOwnerName("John"); account2.setAccountNumber(123456);
        account2.withdraw(200);
        System.out.println("Balance------------");
        System.out.println(account2.getBalance());
        System.out.println("Balance-----------");
        account2.displayInfo();*/
        System.out.println("CurrentAccountObject :- "+account2.getBankName());
        System.out.println("CURRENT ACCOUNT************************");
        System.out.println("--------------------------------");



    }
}

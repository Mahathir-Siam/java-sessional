class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    static String bankName = "Sonali Bank";

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", "sabid", 5000.0);
        BankAccount account2 = new BankAccount("789012", "sabil", 7000.0);
        BankAccount.showBankName();
        account1.displayAccountInfo();
        account2.displayAccountInfo();
    }
}

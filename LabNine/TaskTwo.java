class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() >= 6) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Account number must be at least 6 digits.");
        }
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        // Mask all but last 4 digits
        if (accountNumber.length() > 4) {
            return "" + accountNumber.substring(accountNumber.length() - 4);
        }
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void showAccountInfo() {
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: $" + getBalance());
    }

    public class taskTwo {
        public static void main(String[] args) {
            BankAccount account = new BankAccount("Nahid", "1234567890", 3900);
            account.showAccountInfo();
        }
    }
}

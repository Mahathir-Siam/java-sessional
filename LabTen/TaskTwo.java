interface ATMService {
    void withdraw(double amount);
    void deposit(double amount);
    void checkBalance();
}

class DBBL implements ATMService {
    private double balance;

    public DBBL(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("❌ Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("✅ Withdrawn: $" + amount);
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("✅ Deposited: $" + amount);
    }

    @Override
    public void checkBalance() {
        System.out.println("💰 Current Balance: $" + balance);
    }
}

public class taskTwo {
    public static void main(String[] args) {
        // Create DBBL account with initial balance
        DBBL myAccount = new DBBL(1000.0);

        // Perform some operations
        myAccount.deposit(500.0);      // Deposit $500
        myAccount.withdraw(300.0);     // Withdraw $300
        myAccount.checkBalance();      // Check balance
    }
}

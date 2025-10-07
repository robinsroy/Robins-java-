class Account {
    protected double balance;

    public Account(double bal) {
        balance = bal;
    }

    public final String getAccountType() {
        return "Generic Account";
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(double bal) {
        super(bal);
    }

    @Override
   public final String getAccountType() {  // cannot override final method

        return "Savings";
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(double bal) {
        super(bal);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(1000);
        System.out.println("Account Type: Savings");
        s.withdraw(500);
        System.out.println("Balance after withdrawal: " + s.getBalance());
    }
}

// Abstract Class
abstract class BankAccount {
    private double balance;  // Encapsulation

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Abstract methods (Abstraction)
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Encapsulation (getter & setter)
    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

// Savings Account subclass
class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited " + amount + " to Savings Account");
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn " + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient balance in Savings Account!");
        }
    }
}

// Current Account subclass
class CurrentAccount extends BankAccount {
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited " + amount + " to Current Account");
    }

    @Override
    public void withdraw(double amount) {
        // Allow overdraft up to -500 for Current Account
        if (getBalance() - amount >= -500) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn " + amount + " from Current Account");
        } else {
            System.out.println("Overdraft limit reached in Current Account!");
        }
    }
}

// Main class
public class Bank {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1000);
        savings.deposit(500);
        savings.withdraw(300);
        System.out.println("Savings Balance: " + savings.getBalance());

        BankAccount current = new CurrentAccount(2000);
        current.withdraw(2500);  // overdraft allowed
        System.out.println("Current Balance: " + current.getBalance());
    }
}

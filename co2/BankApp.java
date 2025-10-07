class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    static int accountCount = 1000;  // Static counter for account numbers

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.accountNumber = ++accountCount;  // Unique account number
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    // Transfer method
    public Transaction transferTo(BankAccount target, double amount) {
        if (this.withdraw(amount)) {
            target.deposit(amount);
            return new Transaction(this.accountNumber, target.accountNumber, amount, "Success");
        } else {
            return new Transaction(this.accountNumber, target.accountNumber, amount, "Failed - Insufficient Balance");
        }
    }

    // Display account info
    public void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
        System.out.println("------------------------------");
    }
}

class Transaction {
    private int fromAccount;
    private int toAccount;
    private double amount;
    private String status;

    // Constructor
    public Transaction(int fromAccount, int toAccount, double amount, String status) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.status = status;
    }

    // Display transaction
    public void displayTransaction() {
        System.out.println("Transaction Details:");
        System.out.println("From Account: " + fromAccount);
        System.out.println("To Account: " + toAccount);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Status: " + status);
        System.out.println("------------------------------");
    }
}

public class BankApp {
    public static void main(String[] args) {
        // Create two accounts
        BankAccount acc1 = new BankAccount("Alice", 5000);
        BankAccount acc2 = new BankAccount("Bob", 2000);

        // Successful transfer
        Transaction t1 = acc1.transferTo(acc2, 1500);
        t1.displayTransaction();

        // Failed transfer (insufficient funds)
        Transaction t2 = acc2.transferTo(acc1, 5000);
        t2.displayTransaction();

        // Display account info
        acc1.displayAccount();
        acc2.displayAccount();
    }
}

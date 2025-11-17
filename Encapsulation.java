class BankAccount {
    private String owner;
    private double balance;

    // Constructor
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println(owner + " deposited Php " + amount + ". New balance: Php " + balance);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(owner + " withdrew Php " + amount + ". Remaining balance: Php " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        BankAccount amount1 = new BankAccount("Mia", 100000);
        amount1.deposit(1500);
        amount1.withdraw(2000);
        amount1.withdraw(100001);
    }
}

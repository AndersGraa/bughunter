public class Account {
    private int accountNumber;
    private double accountBalance;

    public Account(){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;

    }

    void withdraw(double amount) {
        accountBalance = accountBalance - amount;
    }

    void deposit(double amount) {
        accountBalance = accountBalance + amount;
    }
    public String toString(){
        return String.format("%d, %f",accountNumber, accountBalance);
    }

}

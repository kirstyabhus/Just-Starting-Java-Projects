package bank;

public class Account {
    private double balance;
    String accountNumber;
    double amount;

    // constructor 
    public Account(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // get the balance
    public double getBalance(){
        return balance;
    }

    // withdraw money (a setter)
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    // deposit money (a setter)
    public void deposit(double amount) {
        balance = balance + amount;
    }
}

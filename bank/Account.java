package bank;

public class Account {
    private double balance;
    // double balance;
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

    // get the account number
    public String getAccountNumber(){
        return accountNumber;
    }

    // withdraw money (a setter)
    public void withdraw(double amount) {
        balance -= amount;
    }

    // deposit money (a setter)
    public void deposit(double amount) {
        balance += amount;
    }
}

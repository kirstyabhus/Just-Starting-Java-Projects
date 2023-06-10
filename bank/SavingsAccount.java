package bank;

public class SavingsAccount extends Account {
    // percentage interest as decimal e.g. 5% -> 0.05
    double interest = 0.05;
    
    // call the constructor of the Account super/parent class
    public SavingsAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    /* 
    @Override
    // deposit money (a setter)
    public void deposit(double amount) {
        double balance = getBalance();
        balance = addInterest(balance);
    }
    */

    /* 
    public double addInterest(double oldBalance) {
        // to get the (private) balance from the parent Account use the getBalance getter.
        // add the interest to the balance
        oldBalance = (interest * oldBalance) + oldBalance;
        return oldBalance;
    }
    */

    
    public void addInterest() {
        balance = (interest * balance) + balance;
    }
    
}

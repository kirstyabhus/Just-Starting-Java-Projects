package bank;

public class SavingsAccount extends Account {
    // percentage interest as decimal e.g. 5% -> 0.05
    double interest = 0.05;
    
    // call the constructor of the Account super/parent class
    public SavingsAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    public void addInterest() {
        // to get the (private) balance from the parent Account use the getBalance getter.
        double balance = getBalance();
        // add the interest to the balance
        balance = (interest * balance) + balance;
    }
}

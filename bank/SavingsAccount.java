package bank;

public class SavingsAccount extends Account {
    // percentage interest as decimal e.g. 5% -> 0.05
    double interestRate = 0.05;
    
    // call the constructor of the Account super/parent class
    public SavingsAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }
    
    // method to add interest to the balance
    public void addInterest() {
        // calculates interst based on the current balance using getBalance()
        double interest = getBalance() * interestRate;
        // deposit the interest into the account
        deposit(interest);
    }
    
}

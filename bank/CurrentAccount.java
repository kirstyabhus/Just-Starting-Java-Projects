package bank;

public class CurrentAccount extends Account{
    double overdraftLimit = -50;

    // call the constructor of the Account super/parent class
    public CurrentAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    public double getOverDraftLimit() {
        return overdraftLimit;
    }
    
}

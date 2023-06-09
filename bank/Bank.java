package bank;

import java.util.ArrayList;

public class Bank {
    
    // update the accounts
    public ArrayList<Account> updateAccounts(ArrayList<Account> accountInput) {
        
        // HOW TO GET OVERDRAFT LIMIT VALUE

        // loop through the accounts in the list
        for (Account x : accountInput) {
            double balance = x.getBalance();
            
            // if the account is a Current Account
            if (x instanceof CurrentAccount) {
                // downcasting 
                CurrentAccount currentAccountX = (CurrentAccount) x;
                // get overdraft limit
                double overdraftLimit = currentAccountX.getOverDraftLimit();
                // check if balance is lower than overdraft limit
                if (balance < overdraftLimit) {

                }
            // if the account is a Savings Account
            } else if (x instanceof SavingsAccount) {
                SavingsAccount savingsAccountX = (SavingsAccount) x;
                savingsAccountX.addInterest();
            }
            
        }
        return accountInput;
    }
    
    public static void main(String[] args) {
        // create a list of Account objects
       // Account is the type of object I want to store in accounts
       ArrayList<Account> accounts = new ArrayList<Account>();

       accounts.add(new Account(20, "12345"));
       accounts.add(new SavingsAccount(40, "543657"));
       accounts.add(new CurrentAccount(30, "254744"));

    }
}

package bank;

import java.util.ArrayList;

public class Bank {
    
    // update the accounts
    public static void updateAccounts(ArrayList<Account> accountInput) {
        
        // HOW TO GET OVERDRAFT LIMIT VALUE

        // iterate through the accounts in the list
        for (Account x : accountInput) {
            // get balance
            double balance = x.getBalance();
            // get account number
            String accountNumber = x.getAccountNumber();
            
            // if the account is a Current Account
            if (x instanceof CurrentAccount) {
                // downcasting -> casts the account to a CurrentAccount object
                CurrentAccount currentAccountX = (CurrentAccount) x;
                // get overdraft limit
                double overdraftLimit = currentAccountX.getOverDraftLimit();

                // check if balance is lower than overdraft limit
                if (balance < overdraftLimit) {
                    System.out.println("Account Number: " + accountNumber);
                    System.out.println("You are over your overdraft limit.");
                }

            // if the account is a Savings Account
            } else if (x instanceof SavingsAccount) {
                // downcasting 
                SavingsAccount savingsAccountX = (SavingsAccount) x;

                System.out.println("Account Number: " + accountNumber);
                System.out.println("Old balance: " + savingsAccountX.getBalance());

                // add interest to balance of the current Account
                savingsAccountX.addInterest();
                // addInterest() method will have access to the balance of the current item in the list
                
                System.out.println("New balance after interest: " + savingsAccountX.getBalance());
            }
            
        }
    }
    /* 
    // method to open Account
    public void openAccount(ArrayList<Account> accountList) {
        return accountList;
    }

    // method to close Account
    public ArrayList<Account> openAccount(ArrayList<Account> accountList) {
        return accountList;
    }
    */

    public static void main(String[] args) {
        // create a list of Account objects
       // Account is the type of object I want to store in accounts
       ArrayList<Account> accounts = new ArrayList<Account>();

       accounts.add(new Account(20, "12345"));
       accounts.add(new SavingsAccount(40, "543657"));
       accounts.add(new CurrentAccount(-90, "254744"));
       accounts.add(new Account(35, "647574"));
       accounts.add(new SavingsAccount(50, "25744"));
       accounts.add(new CurrentAccount(-100, "87326"));

       updateAccounts(accounts);
       
    }
}

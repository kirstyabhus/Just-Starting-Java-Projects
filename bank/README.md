# Bank
Bank created using Java.

The Account class has the following characteristics:
- an instance variable balance to hold the account balance
- and instance variable accountNumber to hold the account number
- allows deposits and withdraws, but not overdraft limits or interest rates.
- the balance of an account may only be modified through the deposit and withdraw methods.

The Account class is used as a base class to create two derived classes SavingsAccount and CurrentAccount.
- A SavingsAccount object, in addition to the attributes of an Account object, has an interest variable and a method which adds interest to the account.
- A CurrentAccount object, in addition to the attributes of an Account object, has an overdraft limit variable.

The Bank class has the following characteristics:
- The Bank class is an object which contains a list of Account objects. 
- Accounts in the list could be instances of the Account class, the SavingsAccount class, or the CurrentAccount class.
- Bank class has an update method. It iterates through each account, updating it in the following ways:
    - saving accounts get interest added (via the method already written)
    - current accounts get a letter sent if they are in overdraft.
- Additionally, the Bank class requires methods for opening and closing accounts, and for paying a dividend into each account.


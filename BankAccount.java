// Program to demonstrate Encapsulation in Java
// Simulates a simple bank account with private variables

import java.util.Scanner;

// BankAccount class — demonstrates Encapsulation
class BankAccount
{
    // Private variables — hidden from outside, 
    // can only be accessed through getters and setters
    private String accNumber;       // account number
    private String accHolderName;   // account holder name
    private double balance;         // current balance

    // ========== GETTERS ==========

    // Returns account number
    public String getAccNumber()
    {
        return accNumber;
    }

    // Returns account holder name
    public String getAccHolderName()
    {
        return accHolderName;
    }

    // Returns current balance
    public double getBalance()
    {
        return balance;
    }

    // ========== SETTERS ==========

    // Sets account number
    public void setAccNumber(String accNumber)
    {
        this.accNumber = accNumber; // 'this' refers to class variable
    }

    // Sets account holder name
    public void setAccHolderName(String accHolderName)
    {
        this.accHolderName = accHolderName;
    }

    // Sets initial balance — rejects negative values
    public void setBalance(double balance)
    {
        if(balance >= 0)
            this.balance = balance;
        else
            System.out.println("Invalid balance!");
    }

    // ========== METHODS ==========

    // Deposits money into account
    public void deposit(double amount)
    {
        if(amount > 0)
            balance = balance + amount; // add to balance
        else
            System.out.println("Invalid amount!"); // reject negative
    }

    // Withdraws money from account
    public void withdraw(double amount)
    {
        if(amount <= balance)
            balance = balance - amount; // deduct from balance
        else
            System.out.println("Insufficient balance!"); // reject if not enough
    }

    // Displays all account details
    public void display()
    {
        System.out.println("Account Number : " + accNumber);
        System.out.println("Account Holder : " + accHolderName);
        System.out.println("Balance        : " + balance);
    }
}

// Main class — entry point of the program
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Create a new BankAccount object
        BankAccount acc = new BankAccount();

        // Set account details using setters
        System.out.println("Enter account number: ");
        acc.setAccNumber(sc.nextLine());

        System.out.println("Enter account holder name: ");
        acc.setAccHolderName(sc.nextLine());

        System.out.println("Enter initial balance: ");
        acc.setBalance(sc.nextDouble());

        // Display account details using display method
        System.out.println("\n--- Account Details ---");
        acc.display();

        // Verify using getters
        System.out.println("\nVerifying account...");
        System.out.println("Account Number : " + acc.getAccNumber());
        System.out.println("Account Holder : " + acc.getAccHolderName());

        // Deposit money
        System.out.println("\nEnter amount to deposit: ");
        acc.deposit(sc.nextDouble());
        System.out.println("After deposit  : " + acc.getBalance());

        // Withdraw money
        System.out.println("\nEnter amount to withdraw: ");
        acc.withdraw(sc.nextDouble());
        System.out.println("After withdrawal: " + acc.getBalance());
    }
}
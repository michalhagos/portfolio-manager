package com.pluralsight.finance;

public class BankAccount implements Valuable {

    // the name of the account holder
    private String name;
    // the unique account number
    private String accountNumber;
    // the current balance in the account
    private double balance;

    public BankAccount(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // returns the name of the account holder
    public String getName() {
        return name;
    }

    // returns the account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // returns the current balance
    public double getBalance() {
        return balance;
    }
    // updates the name of the account holder
    public void setName(String name) {
        this.name = name;
    }

    // updates the account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // updates the balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // the deposit method adds money to the account balance

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited $" + amount + " into " + name + "'s account");
    }

    // this method removes money from the account

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrew $" + amount + " from " + name + "'s account");
        } else {
            System.out.println("Insufficient funds in " + name + "'s account");
        }
    }

    // override the get value method implementing Valuable. the value of a bank account is current balance

    @Override
    public double getValue() {
        return balance;
    }


}

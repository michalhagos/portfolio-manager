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




}

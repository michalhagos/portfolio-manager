package com.pluralsight.finance;

public class CreditCard implements Valuable{

    // the name of the card-holder
    private String name;
    // the unique account number
    private String accountNumber;
    // how much is currently owed on the card
    private double balance;


    public CreditCard(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // returns the name of the card-holder
    public String getName() {
        return name;
    }

    // returns the account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // returns the current balance owed
    public double getBalance() {
        return balance;
    }
    // updates the name of the card-holder
    public void setName(String name) {
        this.name = name;
    }

    // updates the account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // updates the balance owed
    public void setBalance(double balance) {
        this.balance = balance;
    }
    // adds a charge to what you owe on the card
    public void charge(double amount) {
        this.balance += amount;
        System.out.println("Charged $" + amount + " to " + name + "'s credit card");
    }

    // reduces what you owe by making a payment
    public void pay(double amount) {
        this.balance -= amount;
        System.out.println("Paid $" + amount + " on " + name + "'s credit card");
    }
    // credit card value is negative balance because it represents debt. it means if you owe $600 your net worth goes down by $600
    @Override
    public double getValue() {
        return -balance;
    }

}

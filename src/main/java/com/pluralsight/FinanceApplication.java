package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.CreditCard;
import com.pluralsight.finance.Gold;
import com.pluralsight.finance.House;
import com.pluralsight.finance.Jewelry;
import com.pluralsight.finance.Valuable;

public class FinanceApplication {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("123", "Pam", 12500);
        Valuable account2 = new BankAccount("456", "Gary", 1500);

        account1.deposit(100);
       // account2.deposit(100); error only getValue() is available because it implements valuable

        System.out.println("Account 1 value: $" + account1.getValue());
        System.out.println("Account 2 value: $" + account2.getValue());

       // testing all classes
        Jewelry ring = new Jewelry("Gold Ring", 5000.00, 18);
        Gold goldBar = new Gold("Gold Bar", 1900.00, 10);
        House myHouse = new House("My House", 300000.00, 2005, 2000, 4);
        CreditCard myCard = new CreditCard("789", "Pam", 500.00);

        System.out.println("\nJewelry value: $" + ring.getValue());
        System.out.println("Gold value: $" + goldBar.getValue());
        System.out.println("House value: $" + myHouse.getValue());
        System.out.println("Credit card value: $" + myCard.getValue());
    }
}
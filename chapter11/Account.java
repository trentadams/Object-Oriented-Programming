package chapter11;

import java.util.*;
public class Account {
    // Data fields
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0; // Static because all accounts share the same interest rate
    private Date dateCreated;
    

    // No-arg constructor
    public Account() {
        this.dateCreated = new Date();
    }

    // Constructor with id and initial balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }
    
    
    // Accessor and mutator methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // Method to get monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // Method to get monthly interest
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Method to deposit amount
    public void deposit(double amount) {
        balance += amount;
    }
}
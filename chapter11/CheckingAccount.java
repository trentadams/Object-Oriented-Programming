package chapter11;
import java.util.*;

public class CheckingAccount extends Account {
    // Overdraft limit
    private final double overdraftLimit = 50.0;

    // No-arg constructor
    public CheckingAccount() {
    	super();
    }

    // Constructor with id and initial balance
    public CheckingAccount(int id, double balance) {
    	super(id, balance);
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit");
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
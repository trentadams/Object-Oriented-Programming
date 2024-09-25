package chapter11;
import java.util.*;

public class SavingsAccount extends Account {
    // No-arg constructor
    public SavingsAccount() {
        super();
    }

    // Constructor with id and initial balance
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
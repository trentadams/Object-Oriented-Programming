package chapter10;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        // Create an array of 10 Account objects
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100); // Each account with initial balance $100
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int id = -1;
            // Prompt for a valid ID
            while (id < 0 || id > 9) {
                System.out.print("Enter an account ID (0-9): ");
                id = scanner.nextInt();
                if (id < 0 || id >= 10) {
                    System.out.println("Invalid ID. Please try again.");
                }
            }

            boolean exit = false;
            while (!exit) {
                // Display the menu
            	System.out.println();
                System.out.println("Main Menu:");
                System.out.println("1: View balance");
                System.out.println("2: Withdraw money");
                System.out.println("3: Deposit money");
                System.out.println("4: Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                if (choice == 1) { // View balance
                    System.out.println("Account ID: " + accounts[id].getId());
                    System.out.println("Balance: $" + accounts[id].getBalance());
                    
                } else if (choice == 2) { // Withdraw money
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    accounts[id].withdraw(withdrawAmount);
                    
                } else if (choice == 3) { // Deposit money
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    accounts[id].deposit(depositAmount);
                    
                } else if (choice == 4) {
                    exit = true;
                    
                } else {
                    System.out.println("Invalid choice. Please try again.");
                    
                }
            }
        }
    }
}
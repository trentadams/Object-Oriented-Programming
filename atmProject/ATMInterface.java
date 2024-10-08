package atmProject;
import java.util.Scanner;
/**
 * <H1>ATMInterface</H1>
 * <p>This is the main ATM portion of the program</p>
 *
 *
 * <p>Created: 10/07/24</p>
 * 
 * @author Trent Adams
*/
public class ATMInterface {
	/**
	 * This is the main method which makes use of the command line interface for user input
	 * 
	 * @param args (String[]; unused)
	*/
	public static void main(String[] args) {
		
        // Create an array of 100 Account objects
        Account[] accounts = new Account[100];
        int accountCount = 1; // Track the number of created accounts
        accounts[0] = new CheckingAccount(0, 100);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Dufus ATM");
            System.out.println("1: Create a new account");
            System.out.println("2: Access an existing account");
            System.out.print("Enter your choice: ");
            int mainChoice = scanner.nextInt();

            if (mainChoice == 1) { // Create a new account
            
                 	if (accountCount < 100) {
                        System.out.println("Select account type:");
                        System.out.println("1: Checking");
                        System.out.println("2: Savings");
                        System.out.println("3: Business");
                        int accountTypeChoice = scanner.nextInt();

                        switch (accountTypeChoice) {
                            case 1:
                            	accounts[accountCount] = new CheckingAccount(accountCount, 100);
                                break;
                            case 2:
                            	accounts[accountCount] = new SavingsAccount(accountCount, 100);
                                break;
                            case 3:
                            	accounts[accountCount] = new Account(accountCount, 100);
                                break;
                            default:
                                System.out.println("Invalid choice. Account creation aborted.");
                                continue; // Skip to the next iteration of the loop
                        }

                        
                        System.out.println("Account created successfully! Your account ID is: " + accountCount);
                        accountCount++;
                } else {
                    System.out.println("Account limit reached. Cannot create more accounts.");
                }
                    
            } else if (mainChoice == 2) { // Access an existing account
                int id = -1;
                // Prompt for a valid ID
                while (id < 0 || id >= accountCount) {
                    System.out.print("Enter an account ID (0-100): ");
                    id = scanner.nextInt();
                    if (id < 0 || id >= accountCount) {
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
                        System.out.println("Account Type: " + accounts[id].getType());
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
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
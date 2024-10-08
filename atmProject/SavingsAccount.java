package atmProject;

/**
 * The SavingsAccount class represents a savings account.
 * It extends the Account class and provides functionality specific to savings accounts.
 */
public class SavingsAccount extends Account {
    
    /**
     * No-argument constructor that initializes a SavingsAccount.
     */
    public SavingsAccount() {
        super(); // Call to the parent (Account) no-arg constructor
    }

    /**
     * Constructor that initializes a SavingsAccount with a specific ID and balance.
     *
     * @param id The unique identifier for the account.
     * @param balance The initial balance of the account.
     */
    public SavingsAccount(int id, double balance) {
        super(id, balance); // Call to the parent (Account) constructor with parameters
    }

    /**
     * Withdraws a specified amount from the savings account.
     * If the withdrawal amount exceeds the current balance,
     * an error message is displayed.
     *
     * @param amount The amount to withdraw.
     */
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount); // Deduct the amount from the balance
        } else {
            System.out.println("Insufficient funds."); // Error message
        }
    }

    /**
     * Returns the type of account as a string.
     *
     * @return The type of the account ("Savings Account").
     */
    @Override
    public String getType() {
        return "Savings Account";
    }
}
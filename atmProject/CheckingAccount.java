package atmProject;

/**
 * The CheckingAccount class represents a checking account with an overdraft feature.
 * It extends the Account class and provides additional functionality for managing overdrafts.
 */
public class CheckingAccount extends Account {
    
    // Overdraft limit
    private final double overdraftLimit = 100.0; // The maximum amount that can be overdrawn

    /**
     * No-argument constructor that initializes a CheckingAccount.
     */
    public CheckingAccount() {
        super(); // Call to the parent (Account) no-arg constructor
    }

    /**
     * Constructor that initializes a CheckingAccount with a specific ID and balance.
     *
     * @param id The unique identifier for the account.
     * @param balance The initial balance of the account.
     */
    public CheckingAccount(int id, double balance) {
        super(id, balance); // Call to the parent (Account) constructor with parameters
    }

    /**
     * Withdraws a specified amount from the checking account.
     * This method allows the withdrawal to exceed the balance by the overdraft limit.
     * If the withdrawal amount exceeds the total balance plus the overdraft limit,
     * an error message is displayed.
     *
     * @param amount The amount to withdraw.
     */
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount); // Deduct the amount from the balance
        } else {
            System.out.println("Withdrawal exceeds overdraft limit"); // Error message
        }
    }

    /**
     * Gets the overdraft limit for the checking account.
     *
     * @return The overdraft limit.
     */
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    /**
     * Returns the type of account as a string.
     *
     * @return The type of the account ("Checking Account").
     */
    @Override
    public String getType() {
        return "Checking Account";
    }
}
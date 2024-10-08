package atmProject;
import java.util.Date;
import java.util.Random;

/**
 * The Account class represents a bank account with various attributes such as ID, balance, and PIN.
 * It provides methods for withdrawing, depositing money, and calculating interest.
 */
public class Account {
    
    // Data fields
    private int id = 0; // Unique identifier for the account
    private double balance = 0; // Current balance of the account
    private String pin = "0000"; // Account PIN
    private static double annualInterestRate = 0; // Static variable for the annual interest rate shared among all accounts
    private Date dateCreated; // Date when the account was created

    /**
     * No-argument constructor that initializes the account with the current date.
     */
    public Account() {
        this.dateCreated = new Date();
    }

    /**
     * Constructor with parameters to initialize the account with an ID and an initial balance.
     * A random PIN is generated for the account.
     *
     * @param id The unique identifier for the account.
     * @param balance The initial balance of the account.
     */
    public Account(int id, double balance) {
        Random rand = new Random();
        this.id = id;
        this.balance = balance;
        this.pin = String.format("%04d", rand.nextInt(10000)); // Generate a random 4-digit PIN
        this.dateCreated = new Date();
    }

    // Accessor and mutator methods

    /**
     * Gets the account ID.
     *
     * @return The account ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the account ID.
     *
     * @param id The new account ID.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the current balance of the account.
     *
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the balance of the account.
     *
     * @param balance The new balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Gets the account PIN.
     *
     * @return The account PIN.
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the account PIN.
     *
     * @param pin The new account PIN.
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * Gets the annual interest rate.
     *
     * @return The annual interest rate.
     */
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * Sets the annual interest rate for the account.
     *
     * @param annualInterestRate The new annual interest rate.
     */
    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    /**
     * Gets the date the account was created.
     *
     * @return The creation date of the account.
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * Calculates the monthly interest rate.
     *
     * @return The monthly interest rate.
     */
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    /**
     * Calculates the monthly interest earned on the account balance.
     *
     * @return The monthly interest amount.
     */
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }

    /**
     * Withdraws a specified amount from the account balance.
     * If there are insufficient funds, a message is displayed.
     *
     * @param amount The amount to withdraw.
     */
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    /**
     * Deposits a specified amount into the account balance.
     *
     * @param amount The amount to deposit.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Determines the type of account.
     *
     * @return The type of the account as a string (in this case, "Business").
     */
    public String getType() {
        return "Business";
    }
}
package chapter10;

public class TestAccount {
    public static void main(String[] args) {
        // Create an Account object with specified id and initial balance
        Account testAccount = new Account(1122, 20000);
        testAccount.setAnnualInterestRate(4.5);

        // Withdraw $2,500
        testAccount.withdraw(2500);

        // Deposit $3,000
        testAccount.deposit(3000);

        // Display the balance, monthly interest, and testAccount creation date
        System.out.println("Account ID: " + testAccount.getId());
        System.out.printf("Balance: $%.2f", testAccount.getBalance());
        System.out.println();
        System.out.printf("Monthly Interest: $%.2f", testAccount.getMonthlyInterest());
        System.out.println();
        System.out.println("Account Created On: " + testAccount.getDateCreated());
    }
}
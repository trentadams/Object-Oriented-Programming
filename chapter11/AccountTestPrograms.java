package chapter11;

public class AccountTestPrograms {

	public static void main(String[] args) {
		// Create an Account object with specified id and initial balance
		Account testAccount = new Account(0001, 560);
		SavingsAccount testSavings = new SavingsAccount(0002, 250);
		CheckingAccount testChecking = new CheckingAccount(0003, 100);
		
		System.out.println("Account ID: " + testAccount.getId());
    	System.out.printf("Balance: $%.2f", testAccount.getBalance());
    	System.out.println();
    	System.out.println("Account Type: Basic");
    	System.out.println("Account Created On: " + testAccount.getDateCreated());
    	System.out.println();
		System.out.println("Account ID: " + testSavings.getId());
    	System.out.printf("Balance: $%.2f", testSavings.getBalance());
    	System.out.println();
    	System.out.println("Account Type: Savings");
    	System.out.println("Account Created On: " + testSavings.getDateCreated());
    	System.out.println();
    	System.out.println("Account ID: " + testChecking.getId());
    	System.out.printf("Balance: $%.2f", testChecking.getBalance());
    	System.out.println();
    	System.out.println("Account Type: Checking");
    	System.out.println("Account Created On: " + testChecking.getDateCreated());
	}

}

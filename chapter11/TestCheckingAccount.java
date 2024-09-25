package chapter11;

public class TestCheckingAccount {
	public static void main(String[] args) {
		// Create an Account object with specified id and initial balance
		CheckingAccount testChecking = new CheckingAccount(10, 100);
		
		testChecking.deposit(50);
		testChecking.withdraw(200);
		
    	System.out.println("Account ID: " + testChecking.getId());
    	System.out.printf("Balance: $%.2f", testChecking.getBalance());
    	System.out.println();
    	System.out.println("Account Created On: " + testChecking.getDateCreated());
	}

}

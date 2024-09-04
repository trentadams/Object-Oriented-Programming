package module_1;

import java.util.Scanner;

public class Exercise06_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner

		// Prompt the user to enter a password
		System.out.print("Enter a password: ");
		String password = input.nextLine();

		// Display Valid Password if rules are followed, Invalid Password otherwise
		System.out.println((isValidPassword(password) ? "Valid " : "Invalid ") + "Password");
		
		main(args);
	}
	
	public static boolean isValidPassword(String password) {
		boolean validPassword = isLengthValid(password) && isOnlyLettersAndDigits(password) && has2Digits(password);
		return validPassword;
	}
	
	public static boolean isLengthValid(String password) {
		return password.length() >= 8;
	}
	
	public static boolean isOnlyLettersAndDigits(String password) {
		for (int i = 0; i < password.length(); i++) {
			//If the character at "i" is NOT a letter or digit return false
			if (!Character.isLetterOrDigit(password.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean has2Digits(String password) {
		int numberOfDigits = 0;
		for (int i = 0; i < password.length(); i++) {
			//If the character of password at "i" is a digit add 1 to "numberOfDigits"
			if (Character.isDigit(password.charAt(i))) {
				numberOfDigits++;
			}		
		}
		
		if (numberOfDigits >= 2) {
			return true;
		} else {
		return false;
		}
	}

}

package module_1;
import java.util.*;
public class Exercise06_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String orgString = input.next();
		int length = countLetters(orgString);
		System.out.println(orgString + " is " + length + " characters long!");
		int letters = countUniqueCharacters(orgString);
		System.out.println(orgString + " has " + letters + " letters!");
		System.out.println();
		
		main(args);
	}
	
	public static int countLetters(String s) {
		int length = s.length();
		return length;
	}
	
	public static int countUniqueCharacters(String input) {
	    String buffer = "";
	    for (int i = 0; i < input.length(); i++) {
	        if (!buffer.contains(String.valueOf(input.charAt(i)))) {
	            buffer += input.charAt(i);
	        }
	    }
	    return buffer.length();
	}                
}

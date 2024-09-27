package chapter12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
public class Exercise12_15 {

	public static void main(String[] args) throws FileNotFoundException {
		// Generate text file
		java.io.File txtFile = new java.io.File("Exercise12-15.txt");
		
		// Create PrintWriter OBJ
		java.io.PrintWriter output = new java.io.PrintWriter(txtFile);
		
		// Create Random OBJ for random number generation
		Random random = new Random();
		int randomInt;
		
		//Write to the file
		for (int i = 0; i < 101; i++) {
			randomInt = random.nextInt(10);
			// Note: Writes as a hex value 
			output.print(randomInt + " ");
			System.out.print(randomInt + " ");
		}
		
		// Close the file
		output.close();
	}

}

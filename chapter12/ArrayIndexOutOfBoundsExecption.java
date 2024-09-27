package chapter12;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExecption {
	public static void main(String[] arg) {
		// Create Random OBJ
		Random random = new Random();
		int randomInt;
		
		// Create a Scanner OBJ
		Scanner input = new Scanner(System.in);
		
		// Create an Array
		int[] numbers;
		numbers = new int[100];
		
		//Write to the array
		for (int i = 0; i < 100; i++) {
			randomInt = random.nextInt(10);
			numbers[i] = randomInt;
		}
		
		System.out.println("New random array generated.");
		
		
		System.out.print("Index you would like to view (0-99): ");
		int index = input.nextInt();
		
		pullIndex(numbers, index);
	}
	
	public static void pullIndex(int[] numbers, int index) {
		// Read the number at the index given.
		if (index > -1 && index < 100) {
			System.out.println("The number at index " + index + " is " + numbers[index]);
		} else {
			System.out.println("Out of Bounds.");
		}
	}
}

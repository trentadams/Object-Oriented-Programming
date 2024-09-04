package module_1;

import java.util.Scanner;

public class Exercise06_19 {
	
	public static void main(String[] args) {
		//Create a Scanner OBJ
		Scanner input = new Scanner(System.in); 

		//Prompt
		System.out.print("Enter three sides for a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		// Compute area if input is valid. Otherwise, display that input is invalid
		System.out.println(isValid(side1, side2, side3) ? 
			"The area of the triangle is " + area(side1, side2, side3) :
			"Input is invalid");
		System.out.println();
		
		main(args);
	}


	public static boolean isValid(
		double side1, double side2, double side3) {
		boolean valid =
			side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
		return valid;
	}

	//
	public static double area(
		double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
}

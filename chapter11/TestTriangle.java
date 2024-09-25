package chapter11;
import java.util.Scanner;
public class TestTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Create New Triangle:");
		System.out.println("");
		System.out.print("side1: ");
		double side1 = scanner.nextDouble();
		System.out.print("side2: ");
		double side2 = scanner.nextDouble();
		System.out.print("side3: ");
		double side3 = scanner.nextDouble();
		System.out.print("filled? (true/false): ");
		boolean filled = scanner.nextBoolean();
		System.out.print("Color: ");
		String color = scanner.next();
		
		Triangle triangle1 = new Triangle(side1, side2, side3);
		triangle1.asString(filled, color);
	}

}

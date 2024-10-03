package chapter13;
import chapter13.Triangle;
import java.util.Scanner;

public class TestTriangle  {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt for side length
        System.out.println("Enter side 1 of the Triangle: ");
        double side1 = input.nextDouble();
        System.out.println("Enter side 2 of the Triangle: ");
        double side2 = input.nextDouble();
        System.out.println("Enter side 3 of the Triangle: ");
        double side3 = input.nextDouble();
        
        // Create Triangle OBJ
        Triangle triangle = new Triangle(side1, side2, side3);
        
        // Set Color Property
        System.out.println("Enter the color of the Triangle: ");
        String color = input.next();
        triangle.setColor(color);
        
        // Set Filled Property
        System.out.println("Is the Triangle filled? (true/false): ");
        boolean filled = input.nextBoolean(); 
        triangle.setFilled(filled);
        
        // As string
        System.out.println();
        System.out.println(triangle.toString());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled?: " + triangle.isFilled());
        System.out.println();
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Date Created: " + triangle.getDateCreated());
        
        

      
    }
    
}
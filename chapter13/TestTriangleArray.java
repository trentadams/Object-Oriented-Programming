package chapter13;
public class TestTriangleArray {

	public static void main(String[] args) {
		 // Create an array to hold 5 Triangle objects
        Triangle[] triangles = new Triangle[5];

        // Initialize the triangles with random side lengths
        triangles[0] = new Triangle(3, 4, 5);
        triangles[1] = new Triangle(5, 12, 13);
        triangles[2] = new Triangle(6, 8, 10);
        triangles[3] = new Triangle(7, 24, 25);
        triangles[4] = new Triangle(9, 12, 15);

        // Display the area of each triangle and invoke the howToColor method
        for (Triangle triangle : triangles) {
            System.out.println(triangle);
            System.out.printf("Area: %.2f%n", triangle.getArea());
            triangle.howToColor();
            System.out.println(); // Print a blank line for better readability
        }
	}
}

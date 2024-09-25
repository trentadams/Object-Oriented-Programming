package chapter11;
import java.util.*;

public class Triangle extends GeometricObject {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;
	private Date dateCreated;

    // no-arg constructor
    public Triangle() {
    	this.dateCreated = new Date();
    }
    
    
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.dateCreated = new Date();
    }

    // Side1 Methods
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }
    // Side2 Methods
    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
    
    // Side3 Methods
    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    
    public Date getDateCreated() {
    	return dateCreated;
    }
    //Calculate Area according to what I found online
    public double getArea() {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        return area;
    }

    //Calculate Perimeter
    public double getPerimeter() {
        return (side1 + side2 + side3);
    }
    
    public void asString(boolean filled, String color) {
    	System.out.println("");
    	System.out.println("Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3);
    	System.out.println("Color: " + color);
    	System.out.println("Filled: " + filled);
    	System.out.println("");
    	System.out.println("Area: " + this.getArea());
    	System.out.println("Perimeter: " + this.getPerimeter());
    	System.out.println("");
    	System.out.println("Date Created: " + this.getDateCreated());
    }
}
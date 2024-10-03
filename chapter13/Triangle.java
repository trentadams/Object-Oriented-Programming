package chapter13;

public class Triangle extends GeometricObject implements Colorable {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double setSide1() {
        return side1;
    }

    public double setSide2() {
        return side2;
    }

    public double setSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side2;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2; // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Heron's formula
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
    return " Triangle: Side 1 = " + side1 + " Side 2 = " + side2
           + " Side 3 = " + side3;
    }
    
    // Implements howToColor() method from Colorable interface.
    public void howToColor() {
        System.out.println("Color all three sides of the triangle.");
    }
}
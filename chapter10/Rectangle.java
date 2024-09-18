package chapter10;

public class Rectangle {
    private double width = 1.0;
    private double height = 1.0;

    // no-arg constructor
    public Rectangle() {

    }
    
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Width Methods
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //Height Methods
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Calculate Area
    public double getArea() {
        return width * height;
    }

    //Calculate Perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
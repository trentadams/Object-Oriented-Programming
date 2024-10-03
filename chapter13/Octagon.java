package chapter13;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	// Data Field
	private double sideLength = 1.0;
	 
	// Constructor
    public Octagon(double sideLength) {
        this.sideLength = sideLength;
    }
    
	// Access Methods
	public double getSideLength() {
		 return sideLength;
	}

	public void setSideLength(double sideLength) {
		 this.sideLength = sideLength;
	}
	
	// Calculate Perimeter
	public double getPerimeter() {
		return sideLength * 8;
	}
	
	// Calculate Area
	public double getArea() {
		return (2 + (4/ Math.sqrt(2.0))) * sideLength * sideLength;
	}
	
	// Comparable Implementation  
	public int compareTo(Octagon o) {
		return 0;
	}
	
	// Implementation of clone method
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
	// toString
	public String toString() {
        return "Octagon: side = " + sideLength + ", area = " + getArea() + ", perimeter = " + getPerimeter();
    }
}

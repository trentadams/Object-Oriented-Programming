package chapter10;

public class TestRectangle {
    public static void main(String[] args) {
        // Create an Account object with specified id and initial balance
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        
        System.out.println("Rectangle 1:");
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println();
        System.out.println("Rectangle 2:");
        System.out.println(rectangle2.getWidth());
        System.out.println(rectangle2.getHeight());
        System.out.printf("%.1f", rectangle2.getArea());
        System.out.println();
        System.out.println(rectangle2.getPerimeter());
       
    }
}
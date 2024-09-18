package chapter10;

public class MyIntegerTest {

    public static void main(String[] args) {
        MyInteger myInt;
        // Should throw a detailed if any of the methods fail

        // Testing the constructor and getValue/setValue methods
        myInt = new MyInteger(10);
        if (myInt.getValue() != 10) {
            System.out.println("Error: getValue() failed");
        }
        
        myInt.setValue(20);
        if (myInt.getValue() != 20) {
            System.out.println("Error: setValue() failed");
        }

        // Testing isEven method
        if (!myInt.isEven()) {
            System.out.println("Error: isEven() failed for 20");
        }
        
        // Testing isOdd method
        if (myInt.isOdd()) {
            System.out.println("Error: isOdd() failed for 20");
        }

        // Testing isPrime method
        myInt.setValue(29);
        if (!myInt.isPrime()) {
            System.out.println("Error: isPrime() failed for 29");
        }
        
        myInt.setValue(20);
        if (myInt.isPrime()) {
            System.out.println("Error: isPrime() failed for 20");
        }

        // Testing static isEven(int number) method
        if (!MyInteger.isEven(40)) {
            System.out.println("Error: static isEven() failed for 40");
        }
        if (MyInteger.isEven(41)) {
            System.out.println("Error: static isEven() failed for 41");
        }

        // Testing static isOdd(int number) method
        if (!MyInteger.isOdd(41)) {
            System.out.println("Error: static isOdd() failed for 41");
        }
        if (MyInteger.isOdd(42)) {
            System.out.println("Error: static isOdd() failed for 42");
        }

        // Testing static isPrime(int number) method
        if (!MyInteger.isPrime(47)) {
            System.out.println("Error: static isPrime() failed for 47");
        }
        if (MyInteger.isPrime(48)) {
            System.out.println("Error: static isPrime() failed for 48");
        }

        // Testing equals(int number) method
        myInt.setValue(20);
        if (!myInt.equals(20)) {
            System.out.println("Error: equals() failed for 20");
        }
        if (myInt.equals(21)) {
            System.out.println("Error: equals() failed for 21");
        }

        // Testing parseInt(String string) method
        if (MyInteger.parseInt("5") != 5) {
            System.out.println("Error: parseInt(String) failed for '5'");
        }
        if (MyInteger.parseInt("7") != 7) {
            System.out.println("Error: parseInt(String) failed for '7'");
        }

        // Testing parseInt(char character) method
        if (MyInteger.parseInt('3') != 3) {
            System.out.println("Error: parseInt(char) failed for '3'");
        }
        if (MyInteger.parseInt('8') != 8) {
            System.out.println("Error: parseInt(char) failed for '8'");
        }

        System.out.println("Testing completed.");
    }
}
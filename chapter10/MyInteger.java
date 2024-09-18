package chapter10;
import java.util.*;
public class MyInteger {
    // Data fields
    private int value;

    // Constructor with value
    public MyInteger(int value) {
        this.value = value;
    }
    
    
    // Accessor and mutator methods
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    //"is" Methods
    boolean isEven() {
    	if (this.value % 2 == 0) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    boolean isOdd() {
    	if (this.value % 2 == 1) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    boolean isPrime()
    {
        for (int i = 2; i < this.value; i++)
        {
            if((this.value % i) == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    //Static "is" Methods
    static boolean isEven(int number) {
    	if (number % 2 == 0) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    static boolean isOdd(int number) {
    	if (number % 2 == 1) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    static boolean isPrime(int number)
    {
        for (int i = 2; i < number; i++)
        {
            if((number % i) == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    //Equals Methods
    
    boolean equals(int number) {
    	if (this.value == number) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    //Parse Methods
    static int parseInt(String string) {
    	int value = Character.getNumericValue(string.charAt(0));
    	return value;
    }
    
    static int parseInt(char charater) {
    	int value = Character.getNumericValue(charater);
    	return value;
    }
}
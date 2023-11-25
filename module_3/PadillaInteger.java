/*
Luis Padilla
8/23/23
CSD405

Assignment 3:
Create a class titled Integer.  Examples:
AnnaInteger
LarryInteger
SueInteger
Etc.

This class is to contain:
1) An int data field titled with your first name.
2) A constructor that takes and sets the initial value.
3) Getter and setter methods.
4) Non-Static methods titled isEven(), isOdd(), and isPrime() returning true or false based on the variable’s value.
5) Static methods with signatures isEven(int), isOdd(int), and isPrime(int) with the same basic logic 
    as the previous methods with results based on the parameter.
6) Static methods with signatures isEven( Integer), isOdd( Integer), and isPrime( Integer) with the same basic logic 
    as the previous methods with results based on the parameter.
7) The methods equals(int) and equals( Integer) which returns true if int values are equal and false if they are not.
8) Write test code that creates three instances, two with the same value, and one with a different value.
9) Write test code that ensures all methods function correctly.
 */

public class PadillaInteger {
    
    // data field
    private int luis;

    // constructor
    public PadillaInteger(int luis) {
        setLuis(luis);
    }

    // getter setter
    public int getLuis() {
        return luis;
    }
    public void setLuis(int luis) {
        this.luis = luis;
    }

    // non-static methods isEven(), isOdd(), isPrime()
    boolean isEven() {
        if (luis%2 == 0) {
            return true;
        } else {
            return false;
        }   
    }
    boolean isOdd() {
        if (luis%2 == 0) {
            return false;
        } else {
            return true;
        }
    }
    public boolean isPrime() {
        if (luis <= 1) {
            return false;
        }
        for (int i=2; i<luis; i++) {
            if (luis % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // static methods isEven(int), isOdd(int), isPrime(int)
    public static boolean isEven(int luis) {   
        if (luis%2 == 0) {
            return true;
        } else {
            return false;
        }   
    }
    public static boolean isOdd(int luis) {
        if (luis%2 == 0) {
            return false;
        } else {
            return true;
        }
    }
    public boolean isPrime(int luis) {
        if (luis <= 1) {
            return false;
        }
        for (int i=2; i<luis; i++) {
            if (luis % i == 0) {
                return false;
            }
        }
        return true;
    }

    // equals method
    public boolean equals(int num) {
        return this.luis == num;
    }
    public boolean equals(PadillaInteger luis) {
        return this.luis == luis.luis;
    }

    // print methods
    public void printAttributes() {
        System.out.println(luis + " Attributes:");
        System.out.println("Even: " + isEven(luis));
        System.out.println("Odd: " +isOdd(luis));
        System.out.println("Prime: " + isPrime(luis));
        System.out.println("");
    }

}

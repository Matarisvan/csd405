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
    private boolean checkOne, checkTwo, checkThree;

    // constructor
    public PadillaInteger(int luis) {
        setLuis(luis);
    }
    

    // getter setter
    public int getLuis() {
        return luis;
    }
    public void setLuis(int Luis) {
        this.luis = luis;
    }

    // non-static methods isEven(), isOdd(), isPrime()
    public boolean isEven(int luis) {
        if (luis % 2 == 0) {
            return true;
        } else {
            return false;
        }   
    }
    public boolean isOdd(int luis) {
        if (luis % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
  /*  public boolean isPrime() {
        
    }

*/
    // static methods isEven(Integer), isOdd(Integer), isPrime(Integer)
    public void printPad() {
        System.out.println(this.isEven(luis));
        System.out.println(this.isOdd(luis));
    }

    
}

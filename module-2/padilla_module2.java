/*
Luis Padilla
8/7/23
CSD340 - Assignment 1 

* Write a program with a class titled Fan. This class is to contain:

1.  Four constants named STOPPED, SLOW, MEDIUM, and FAST. The constants are to hold the values of 0, 1, 2, and 3 respectively.
2.  A private field named speed that holds one of the constant values with the default being STOPPED.
3.  A private Boolean field titled on that specifies whether the fan is on or off.
4.  A private field named radius that holds the radius of the fan with a default value of 6.
5.  A String field that holds the color, with the default being white.
6.  Setter and getter methods for all mutable fields.
7.  A no-argument constructor that sets all fields with a default value.
8.  A constructor taking arguments and setting values.
9.  Write a toString() method that returns a description of the Fans state.
10. Write test code that creates two instances of the Fan class, one using the default constructor and the other using the argument constructor.
    Write code that displays the functionality of the Fan class methods.


Starting with your code from Module 1 create the following new class titled UseFans:
11. Create a collection of Fan instances.
12. Create a method taking a collection of Fan instances for displaying without using the toString() method.
13. Create a method that takes a single instance of a Fan for displaying without using the toString() method.
14. Use the this reference throughout the Fan class where allowed.
15. fnaWrite test code that creates a collection of Fans and displays the functionality of all of the Fan instances in the collection.
 */


public class padilla_module2 {
    
    public static void main(String[] args) {

        // Welcome Message
        System.out.println("\nWelcome to Module 1 for CSD405\n");

        //test code
        Fan fanDefault = new Fan();
        fanDefault.fanPrint();
        
        Fan fanArgument = new Fan(Fan.FAST, true, 21, "red");
        fanArgument.fanPrint();

    // ----- Module 2 -----
        System.out.println("\nModule 2 Additions:\n");
        
        // Fan Instances
        Fan fanOff = new Fan(Fan.STOPPED, false, 6, "white");
        Fan fanOne = new Fan(Fan.SLOW, true, 7, "red");
        Fan fanTwo = new Fan(Fan.MEDIUM, true, 8, "green");
        Fan fanThree = new Fan(Fan.FAST, true, 9, "blue");

        // Creating the collection of Instances
        Fan[] fanCollection = {fanOff, fanOne, fanTwo, fanThree};
        
        // Method to call UseFans class
        UseFans UseFans = new UseFans();
        System.out.println(UseFans.fanSingle(fanOff));

        // Space for cleanliness
        System.out.println("");

        // Method for multiple instances
        UseFans.fanMultiple(fanCollection); 

        //closing message
        System.out.println("\nGracias\n");
    }
    
}

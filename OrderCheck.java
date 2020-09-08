/*************************************************************************
 *  Compilation:  javac OrderCheck.java
 *  Execution:    java OrderCheck 5 10 15 2
 *
 *  @author: Shaan Jalal, sfj21@scarletmail.rutgers.edu, sfj21
 *
 *  Prints true if the four integer inputs are in strictly ascending
 *  or descending order, false otherwise
 *
 *  % java OrderCheck 5 10 15 2
 *  false
 *
 *  % java OrderCheck 15 11 9 4
 *  true
 *
 *************************************************************************/

public class OrderCheck {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    	boolean valid1 = (Integer.parseInt(args[0]) < Integer.parseInt(args[1]));
    	boolean valid2 = (Integer.parseInt(args[1]) < Integer.parseInt(args[2]));
    	boolean valid3 = (Integer.parseInt(args[2]) < Integer.parseInt(args[3]));
    	boolean valid = (valid1 == valid2 && valid2 == valid3);
    	System.out.println(valid);
	
    }
}

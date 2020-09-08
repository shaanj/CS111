/*************************************************************************
 *  Compilation:  javac WindChill.java
 *  Execution:    java WindChill 35.0 10.0
 *
 *  @author: Shaan Jalal, sfj21@scarletmail.rutgers.edu, sfj21
 *
 *  That takes two double command-line arguments temperature and velocity 
 *  and prints the wind chill (a double) according to the following:
 *
 *  w = 35.74 + 0.6215 * T + (0.4275 * T - 35.75) v^0.16
 *
 *  % java WindChill 35.0 10.0
 *  27.445420765619037
 *
 *  The formula is not valid if T is larger than 50 in absolute value or if 
 *  v is larger than 120 or less than 3.
 *
 *  Assume the inputs are valid values
 *
 *
 *************************************************************************/

public class WindChill {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
	double temp;
	double velocity;
	double chill;

	temp = Double.parseDouble(args[0]);
	velocity = Double.parseDouble(args[1]);
	chill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(velocity, 0.16);

	System.out.println(chill);
    }
}

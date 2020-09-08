/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author: Shaan Jalal, sfj21@scarletmail.rutgers.edu
 *
 *
 * WARNING: before submitting this file to Autolab comment out all 
 *          calls to StdDraw methods 
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {

	double height = length * (Math.sqrt(3) / 2);

    return height;
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {

	/* 
         * WARNING: before submitting this file to Autolab comment out 
	 *          all calls to StdDraw methods 
         */

    double[] newx = {x, x - length/2, x + length/2};
    double[] newy = {y, y + height(length), y + height(length)};
    StdDraw.filledPolygon(newx, newy);
    
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length){

    if(n > 0)
    {
        filledTriangle(x, y, length);
        sierpinski(n-1, x - length/2, y, length/2);
        sierpinski(n-1, x + length/2, y, length/2);
        sierpinski(n-1, x, y + height(length), length/2);
    }

	// WRITE YOUR CODE HERE
    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {
    double length = 1;
    double[] x = {0, 0.5, 1};
    double[] y = {0, height(length), 0};
    StdDraw.polygon(x, y);

    int n = Integer.parseInt(args[0]);

    sierpinski(n, 0.5, 0, length/2);


	// WRITE YOUR CODE HERE to test your recursive Sierpinki
    }
}

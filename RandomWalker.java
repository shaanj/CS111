/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author: Shaan Jalal, sfj21@scarletmail.rutgers.edu, sfj21
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    	int n;
    	n = Integer.parseInt(args[0]);
    	int xcor = 0;
    	int ycor = 0;
    	double xSquared = 0.00;
    	double ySquared = 0.00;


    	System.out.println("(" + xcor + "," + ycor + ")");
    	for (int i = 0; i < n; i++)
    	{
    		double step = Math.random();
    		if (step >= 0.00 && step < 0.25)
    		{
    			xcor++;
    		}

    		else if (step >= 0.25 && step < 0.50)
    		{
    			xcor--;
    		}

    		else if (step >= 0.50 && step < 0.75)
    		{
    			ycor++;
    		}

    		else
    		{
    			ycor--;
     		}
     		System.out.println("(" + xcor + "," + ycor + ")");
     		
    	}

    	xSquared = Math.pow(xcor, 2);
    	ySquared = Math.pow(ycor, 2);

    	System.out.println("Squared distance = " + (xSquared + ySquared));

    }
}

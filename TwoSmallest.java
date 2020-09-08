/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author: Shaan Jalal, sfj21@scarletmail.rutgers.edu, sfj21
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest {
    public static void main(String[] args) {

    double first;
    double second;
    first = second = Double.MAX_VALUE;

    if (args.length < 2)
    {
    	System.out.println("Illegal input");
    }

    else
    {

    for (int i = 0; i < args.length; i++)
    {
    	if (Double.parseDouble(args[i]) <= first)
    	{
    		second = first;
    		first = Double.parseDouble(args[i]);
    	}

    	else if(Double.parseDouble(args[i]) < second && Double.parseDouble(args[i]) != first)
    	{
    		second = Double.parseDouble(args[i]);
    	}
    }

    System.out.println(first);
    System.out.println(second);
    }
	}
}


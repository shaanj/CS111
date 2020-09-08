/*************************************************************************
 *  Compilation:  javac LuckySevens.java
 *  Execution:    java LuckySevens 421
 *
 *  @author: Shaan Jalal, sfj21@scarletmail.rutgers.edu, sfj21
 *
 * LuckySevens takes an int as a command-line argument and displays
 * how many digits in the integer number are 7s.  
 *
 * Note: the number can be negative.
 *
 *  % java LuckySevens 3482
 *  0
 *
 *  % java LuckySevens 372777
 *  4
 * 
 *  % java LuckySevens -2378272
 *  2
 *************************************************************************/

public class LuckySevens {
    public static void main(String[] args) {

	int num;
	int digits = 0;
	num = Integer.parseInt(args[0]);
	num = Math.abs(num);

	while (num > 0)
	{
		if (num % 10 == 7)
		{
			digits += 1;
		}
		num /= 10;
	}
	System.out.println(digits);
    }
}
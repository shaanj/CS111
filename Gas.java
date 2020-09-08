/*************************************************************************
 *  Compilation:  javac Gas.java
 *  Execution:    java Gas 3.40 15.0 true
 *
 *  @author: Shaan Jalal, sfj21@scarletmail.rutgers.edu, sfj21
 *
 * The program Gas computes and displays the price a
 * person will pay for gas at the gas station.
 *
 *  % java Gas 3.40 15.0 false
 *  56.1
 *
 *  % java Gas 3.40 15.0 true
 *  51.0
 *
 *************************************************************************/

public class Gas {
    public static void main(String[] args) {
	double PricePerGal;
	double GasNum;
	boolean CashorCredit;
	double Price = 0.0;

	PricePerGal = Double.parseDouble(args[0]);
	GasNum = Double.parseDouble(args[1]);

	if (GasNum <= 0 || PricePerGal <= 0)
	{
		System.out.println("Illegal input");
	}
	else
	{
		CashorCredit = Boolean.parseBoolean(args[2]);

		if(CashorCredit == true)
		{
			Price = PricePerGal * GasNum;
			System.out.println(Price);
		}
		else
		{
			Price = PricePerGal * GasNum * 1.1;
			System.out.println(Price);
		}
	}
    }
}
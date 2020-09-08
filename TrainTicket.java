/*************************************************************************
 *  Compilation:  javac TrainTicket.java
 *  Execution:    java TrainTicket
 *
 *  @author: Shaan Jalal, sfj21@scarletmail.rutgers.edu, sfj21
 *
 * The program TrainTicket takes two command-line arguments: an int
 * referring to the persons age and a boolean referring to whether or
 * not the ticket was bought at the train station (true for a ticket
 * bought at the train station). The program computes and displays the
 * ticket price the person needs to pay for the train ride.
 *
 *  % java TrainTicket 23.0 true
 *  13.20
 *
 *  % java TrainTicket 23.0 false
 *  15.84
 * 
 *  % java TrainTicket 230 false
 *  Illegal input
 *
 *************************************************************************/

public class TrainTicket {
    public static void main(String[] args) {
    	int age;
    	boolean location;
    	double price = 0.0;

    	age = Integer.parseInt(args[0]);
    	location = Boolean.parseBoolean(args[1]);

    	if(age < 0 || age > 120)
    	{
    		System.out.println("Illegal input");
    	}

    	else if (age < 7)
    	{
    		System.out.println(price);
    	}

    	else 
    	{
    		if(location == true)
    		{
    			if (age > 65)
    			{
    				price = 7.50;
    				System.out.println(price + "0");
    			}
    			else 
    			{
    				price = 13.20;
    				System.out.println(price + "0");
    			}
    		}
    		else 
    		{
    			if (age > 65)
    			{
    				price = 7.50 * 1.2;
    				System.out.println(price + "0");
    			}
    			else 
    			{
    				price = 15.84;
    				System.out.println(price);
    			}
    		}
    	}
    	}
    }
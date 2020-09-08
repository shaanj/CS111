/*************************************************************************
 *  Compilation:  javac HadamardMatrix.java
 *  Execution:    java HadamardMatrix 2
 *
 *  @author: Shaan Jalal, sfj21@scarletmail.rutgers.edu, sfj21
 *
 * The program HadamardMatrix prints H(n)
 *
 *  % java HadamardMatrix 2
 *  T T
 *  T F
 *
 *************************************************************************/

public class HadamardMatrix {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    	int num;
    	num = Integer.parseInt(args[0]);
    	boolean [][] HMatrix = new boolean[num][num];

    	HMatrix[0][0] = true;

    	for (int k = 1; k < num; k += k)
    	{
    		for(int i = 0; i < k; i++)
    		{
    			for(int j = 0; j < k; j++)
    			{
    				HMatrix[i+k][j] = HMatrix[i][j];
    				HMatrix[i][j+k] = HMatrix[i][j];
    				HMatrix[i+k][j+k] = !HMatrix[i][j];
    			}
    		}
    	}

    	for (int i = 0; i < num; i++)
    	{
    		for(int j = 0; j < num; j++)
    		{
    			if (HMatrix[i][j])
    			{
    				System.out.print("T ");
    			}

    			else
    			{
    				System.out.print("F ");
    			}
    		}
    		System.out.println();
    	}
}
}
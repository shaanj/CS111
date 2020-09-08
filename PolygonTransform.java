/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Shaan Jalal, sfj21@scarletmail.rutgers.edu, sfj21
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array)
    {

        double[] CopiedArr = new double[array.length];

        for (int i = 0; i < array.length; i++)
        {
            CopiedArr[i] = array[i];
            StdOut.print(CopiedArr[i] + " ");

        }
        return CopiedArr;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) 
    {

        double[] scaledx = new double[x.length];
        double[] scaledy = new double[y.length];

        for (int i = 0; i < x.length; i++)
        {
            scaledx[i] = x[i] * alpha;
            x[i] = scaledx[i];
        }

        for (int j = 0; j < y.length; j++)
        {
            scaledy[j] = y[j] * alpha;
            y[j] = scaledy[j];
        }
	
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) 
    {
        double[] shiftedx = new double[x.length];
        double[] shiftedy = new double[y.length];

        for (int i = 0; i < x.length; i++)
        {
            shiftedx[i] = x[i] + dx;
            x[i] = shiftedx[i];
        }

        for (int j = 0; j < y.length; j++)
        {
            shiftedy[j] = y[j] + dy;
            y[j] = shiftedy[j];
        }

    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) 
    {
        double[] array = new double[x.length];
        double angle = theta * Math.PI/180;

        for (int i = 0; i < x.length; i++)
        {
            array[i] = (x[i]*Math.cos(angle) - y[i]*Math.sin(angle));

            y[i] = (y[i]*Math.cos(angle) + x[i]*Math.sin(angle));
        }

        for (int i = 0; i < x.length; i++)
        {
            x[i] = array[i];
        }

        
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
    StdDraw.setScale(-8.0, +8.0);

    double[] x = {0, 1, 1, 0};
    double[] y = {0, 0, 2, 1};

    double alpha = 2;
    double dx = 2;
    double dy = 1;
    double theta = 45;

    StdDraw.setPenColor(StdDraw.RED); 
    StdDraw.polygon(x, y); 

    copy(x);
    copy(y);
    scale(x, y, alpha);
    translate(x, y, dx, dy);
    rotate(x, y, theta); 
    StdDraw.setPenColor(StdDraw.BLUE);
    StdDraw.polygon(x, y);

	// Use the StdDraw library methods to test the polygon transform methods here
    }
}

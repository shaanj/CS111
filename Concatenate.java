public class Concatenate{
	public static void main(String[] args){

		int[] a;
		int[] b;
		int[] c = new int[a.length + b.length];
		int pointer = 0;

		for(int i = 0; i < a.length; i++)
		{
			c[pointer] = a[i];
			pointer++;
		}

		for(int i = 0; i < b.length; i++)
		{
			c[pointer] = b[i];
			pointer++;
		}

			System.out.print(c);
	}
}
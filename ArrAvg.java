public class ArrAvg{
	public static void main(String[] args){
		double avg = 0.0;
		double sum = 0.0;

		for(int i = 0; i < args.length; i++)
		{
			sum = sum + Double.parseDouble(args[i]);
		}

		avg = sum/args.length;
		System.out.println(avg);
	}
}
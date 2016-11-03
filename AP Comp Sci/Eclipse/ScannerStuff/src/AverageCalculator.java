import java.util.Scanner;

public class AverageCalculator {

	public static void main(String[] args) 
	{
		Scanner scan = null;
		int sum = 0;

		try
		{
			scan = new Scanner( System.in );
			System.out.println( "How many grades do you have?" );
			int amount = scan.nextInt();
			System.out.println( "Type in the percentages of those grades." );
			for(int i = 0; i < amount; i++)
			{
				sum = sum + scan.nextInt();
			}
			sum = sum / amount;
			System.out.println("Your average is: " + sum);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			if(scan != null)
			{
				scan.close();
			}
		}
	}

}
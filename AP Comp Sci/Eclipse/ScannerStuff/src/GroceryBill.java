import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;

public class GroceryBill {

	public static void main(String[] args) 
	{
		
		DecimalFormat df2 = new DecimalFormat(".##");
		
		final double TAX_PERCENT = .06;
		
		Scanner scan = null;
		double sum = 0;
		
		String amount = "";
		int amnt = 0;
		
		String name = "";
		
		String price = "";
		double pr = 0;
		
		double tax = 0;
		
		try 
		{
			File f = new File("src/groceries.txt");
			scan = new Scanner(f);
			while(scan.hasNextLine())
			{
				name = scan.next();
				
				amount = scan.next();
				amnt = Integer.parseInt(amount);
				
				price = scan.next();
				pr = Double.parseDouble(price);
				
				sum += amnt * pr;
			}
			System.out.println("Without Tax: " + df2.format(sum));
			tax = sum * TAX_PERCENT;
			sum += tax;
			System.out.println("With 6% Tax: " + df2.format(sum));
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

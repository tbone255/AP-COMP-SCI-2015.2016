import java.util.Scanner;

public class WarmUp 
{

	public static void main(String[] args) 
	{
		warmUp1();
		warmUp2();
		warmUp3();
	}
	
	public static void warmUp1()
	{
		int[][] nums = new int[7][4];
		int start = 1;
		for(int r = 0; r < nums.length; r++)
		{
			for(int c = 0; c < nums[r].length; c++)
			{
				nums[r][c] = (r + 1) * (c + 1);
				
				System.out.printf("%-3d", nums[r][c]);
			}
			System.out.println(" ");
		}
	}

	
	public static void warmUp2()
	{
		int[][] nums;
		int rows = 0;
		int cols = 0;
		
		Scanner s = null;
		try
		{
			s = new Scanner(System.in);
			System.out.println("How many rows will satisfy your desire for rows?");
			rows = s.nextInt();
			System.out.println("How many columns will satisfy your desire for columns?");
			cols = s.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			if(s != null)
			{
				s.close();
			}
		}
		
		nums = new int[rows][cols];
		
		
		
		for(int r = 0; r < nums.length; r++)
		{
			for(int c = 0; c < nums[r].length; c++)
			{
				nums[r][c] = (r + 1) * (c + 1);
				
				System.out.printf("%-5d", nums[r][c]);
			}
			System.out.println(" ");
		}
	}
	
	public static void warmUp3()
	{
		String[][] nums = new String[7][8];
		for(int r = 0; r < nums.length; r++)
		{
			for(int c = 0; c < nums[r].length; c++)
			{
				nums[r][c] = r + "" + c;
				System.out.printf("%-3s", nums[r][c]);
			}
			System.out.println("");
		}
	}
		
}


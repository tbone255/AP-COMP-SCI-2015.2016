public class MatrixDemo 
{
	public static void main(String[] args) 
	{	
		int[][] nums = generateRandomMatrix(5, 5);
		prIntMatrix(nums);
		
		System.out.println("\nSum: " + sum(nums));
		System.out.println("Average: " + average(nums));
		System.out.println("SumRow: " + sumRow(nums, 1));
		System.out.println("SumCol: " + sumCol(nums, 3));
	}
	
	
	
	
	public static void prIntMatrix(int[][] nums)
	{
		for(int r = 0; r < nums.length; r++)
		{
			for(int c = 0; c<nums[r].length; c++)
			{
				if(c == nums[r].length - 1)
				{
					System.out.print(nums[r][c]);
				}
				else
				{
					System.out.print(nums[r][c] + ", ");
					
				}
			}
			System.out.println();			
		}
		
	}
	
	public static void num1()
	{
		//sets all to 42 and prints the matrix
		int[][] nums = new int[10][3];
		for(int r = 0; r < nums.length; r++)
		{
			for(int c = 0; c<nums[r].length; c++)
			{
				nums[r][c] = 42;
			}	
		}
		prIntMatrix(nums);
	}

	public static void num2(int numRows, int numColumns)
	{
		//sets each to a random number 0-9 and prints
		int[][] nums = new int[numRows][numColumns];
		for(int r = 0; r < nums.length; r++)
		{
			for(int c = 0; c<nums[r].length; c++)
			{
				int rand = (int)(Math.random() * 9);
				nums[r][c] = rand;
			}	
		}
		prIntMatrix(nums);
	}
	
	public static int [][] generateRandomMatrix( int numRows, int numColumns )
	{
		//sets all to random number 0-9 and returns
		int[][] nums = new int[numRows][numColumns];
		for(int r = 0; r < nums.length; r++)
		{
			for(int c = 0; c<nums[r].length; c++)
			{
				int rand = (int)(Math.random() * 9);
				nums[r][c] = rand;
			}	
		}
		
		return nums;
	}


	public static int sum( int [][] numbers )
	{
		int sum = 0;
	    //calculate the sum of the numbers in the entire 2d array
	    //return this sum
		int[][] nums = numbers;
		for(int r = 0; r < nums.length; r++)
		{
			for(int c = 0; c<nums[r].length; c++)
			{
				sum += nums[r][c];
			}	
		}
		return sum;		
		
	}

	public static double average( int [][] nums )
	{
	    //calculate the average of the numbers in the entire 2d array
	    //return this average
		return (double)sum(nums) / (nums.length * nums[0].length);
	}

	public static int sumRow( int [][] numbers, int row )
	{
		int sum = 0;
	    //calculate the sum of the numbers in the given row
	    //return this sum
		int[][] nums = numbers;
		for(int c = 0; c<nums[row].length; c++)
		{
			sum +=nums[row][c];
		}	
		return sum;
	}

	public static int sumCol( int [][] numbers, int col )
	{
		int sum = 0;
	    //calculate the sum of the numbers in the given column
	    //return this sum
		int[][] nums = numbers;
		for(int r = 0; r<nums.length; r++)
		{
			sum +=nums[r][col];
		}	
		return sum;
	}
}


	
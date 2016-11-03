
public class BoardBuilder
{

	private final static char X = 'X';
	private final static char O = 'O';
	private final static char A = 'A';
	
	public BoardBuilder()
	{
		buildXO();
	}
	public static void main(String[] args)
	{
		//part a
		//codes();
		
		//part b
		buildXO();
	}
	
	//PART A
	public static void codes()
	{
		String[] cs = {"time", "year", "people", "way", "day", "man", "thing", "woman", "life", "child", "world", "school", "state", "family", "student", "group", "country", "problem", "hand", "ayy lmao", "part", "place", "case", "week", "company", "system"};
		String[][] codes = new String[5][5];
		int i = 0;
		int x = 0;
		int y = 0;
		for(int r = 0; r < codes.length; r++)
		{
			for(int c = 0; c < codes[r].length; c++)
			{
				codes[r][c] = cs[i];
				i++;
			}
		}
		
		for(int r = 0; r < codes.length; r++)
		{
			for(int c = 0; c < codes[0].length; c++)
			{
				System.out.printf("%-10s", codes[r][c]);
				
			}
			System.out.println(" ");
		}
	}
	
	/////////////////////////////////////////////////////////////////
	//PART B
	public static void buildXO()
	{
		int[] rrr = new int[5];
		int[] ccc = new int[5];
		char[][] matrix = new char[5][5];
		//add stars
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[r].length; c++)
			{
				matrix[r][c] = '*';
			}
		}
		
		
		//add the A
		int rand1 = (int)(Math.random() * 5);
		int rand2 = (int)(Math.random() * 5);
		matrix[rand1][rand2] = 'A';
		
		
		//add the O
		int oAmount = 0;
		while(oAmount < 8)
		{
			rand1 = (int)(Math.random() * 5);
			rand2 = (int)(Math.random() * 5);
			if(matrix[rand1][rand2] == '*')
			{
				matrix[rand1][rand2] = 'O';
				oAmount++;
			}
		}
		
		
		
		//add the X	
		int xAmount = 0;
		while(xAmount < 9)
		{
			rand1 = (int)(Math.random() * 5);
			rand2 = (int)(Math.random() * 5);
			if(matrix[rand1][rand2] == '*')
			{
				matrix[rand1][rand2] = 'X';
				xAmount++;
			}
		}
		
		
		//printing
		for(int r = 0; r < matrix.length; r++)
		{
			for(int c = 0; c < matrix[r].length; c++)
			{
				System.out.printf("%-2s ", matrix[r][c]);
			}
			System.out.println(" ");	
		}
		
	}
}

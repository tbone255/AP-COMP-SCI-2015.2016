import java.util.Scanner;

public class CodeNames 
{
	
	private final static int xMax = 9;
	private final static int oMax = 8;
	
	static boolean aChosen = false;
	static int xChosen = 0;
	static int oChosen = 0;
	
	static int x = 0;
	static int y = 0;
	public static void main(String[] args)
	{
		
		BoardBuilder board = new BoardBuilder();
		
		System.out.println("COORDINATES: (1, 1) is the top left corner card, and (5, 5) is the bottom right! \n");
		input();

	}
	
	public static void input()
	{
		Scanner s = null;
		try
		{
			s = new Scanner(System.in);
			System.out.println("Team 1: Input your x coordinate, then your y coordinate");
			x = s.nextInt();
			y = s.nextInt();
			System.out.println(x);
			System.out.println(y);
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
	}
}

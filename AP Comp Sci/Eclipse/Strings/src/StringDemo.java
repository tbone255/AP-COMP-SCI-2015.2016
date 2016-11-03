import java.util.Scanner;
import java.lang.Character;
public class StringDemo 
{
	static int m = (int)'m';
	public static void main(String[] args) 
	{	
		
		String s = "hello";
		System.out.println(Character.isLetter(s.charAt(0)));
		
		
		
//		System.out.println(decrypt("dpnqvufs"));
//		System.out.println(decrypt("azaazwb"));
//	
//		System.out.println(rot13("ebg guvegrra"));
//		
//		printWeirdA("games");
		mystery("alphabet", 0, 6);

printWeirdB("games");
		
		
		System.out.println(doubleLet("ay lmmao"));
		String [] array = {"She", "sells", "sea shells", "by the sea", "shore"};
		System.out.println(mergeReversed(array));
	}
	
	public static void mystery( String word, int a, int b )
	{
	   if ( a < b && word.length() >= b )
	   {
	       System.out.println( word.substring(a, b) );
	       mystery( word.substring( a + 2 ), a + 1, b - 1 );
	       System.out.println( word.substring( a, b-1 ));
	   }
	   System.out.println( "*" );
	}
	
	public static void strings()
	{
		System.out.println("KYLO REN IS HAN SOLOS SON HAN SOLO DIES REY HAS THE FORCE NOT FINN".charAt(0));
		
		System.out.println("KYLO REN IS HAN SOLOS SON HAN SOLO DIES REY HAS THE FORCE NOT FINN".substring(0, 1));
		
		System.out.println("Taha_Amir".substring(0, 5));
		System.out.println("Taha_Amir".substring(5, 9));
		System.out.println("Taha_Amir".substring(5));
		
		System.out.println("KYLO REN IS HAN SOLOS SON HAN SOLO DIES REY HAS THE FORCE NOT FINN".length());
		

		System.out.println("KYLO REN IS HAN SOLOS SON HAN SOLO DIES REY HAS THE FORCE NOT FINN".charAt("KYLO REN IS HAN SOLOS SON HAN SOLO DIES REY HAS THE FORCE NOT FINN".length()-1));
		System.out.println("KYLO REN IS HAN SOLOS SON HAN SOLO DIES REY HAS THE FORCE NOT FINN".substring("KYLO REN IS HAN SOLOS SON HAN SOLO DIES REY HAS THE FORCE NOT FINN".length()-1));

		
		System.out.println(" sfhadiohio;fsdh;fdsahsadf;fsd;haohofsdahpsdfdfsph'hipf'sphidffsdhipasfd;hk'jk;sdf'fwpiu5w[4uifsdpak';lkhvfsdflhkfspajk';afjsd;lak;lsdjfkaljk;fglsjd;l;jksdfa;lsdafkjsldjklk;fajwturwipsdflk;sfdklj".contains("jkl"));
		System.out.println(" sfhadiohio;fsdh;fdsahsadf;fsd;haohofsdahpsdfdfsph'hipf'sphidffsdhipasfd;hk'jk;sdf'fwpiu5w[4uifsdpak';lkhvfsdflhkfspajk';afjsd;lak;lsdjfkaljk;fglsjd;l;jksdfa;lsdafkjsldjklk;fajwturwipsdflk;sfdklj".indexOf("jkl"));
		
		System.out.println(" sfhadiohio;fsdh;fdsahsadf;fsd;haohofsdahpsdfdfsph'hipf'sphidffsdhipasfd;hk'jk;sdf'fwpiu5w[4uifsdpak';lkhvfsdflhkfspajk';afjsd;lak;lsdjfkaljk;fglsjd;l;jksdfa;lsdafkjsldjklk;fajwturwipsdflk;sfdklj".replace('j', '*'));
		
		System.out.println(" sfhadiohio;fsdh;fdsahsadf;fsd;haohofsdahpsdfdfsph".replace(" sfhadiohio;fsdh;fdsahsadf;fsd;haohofsdahpsdfdfsph".charAt(" sfhadiohio;fsdh;fdsahsadf;fsd;haohofsdahpsdfdfsph".lastIndexOf('s') + 1), ' '));
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("practice problems are above, just scroll up if you wanna see it");
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Tipe Sumetin: ");
		String phrase = scan.nextLine();
		
		//print phrase
		System.out.println(phrase);
		//last letter
		System.out.println(phrase.charAt(phrase.length()-1));
		//print backwards
		for(int i = phrase.length()-1; i >= 0; i--)
		{
			System.out.print(phrase.charAt(i));
			
		}
		//print pairs of letters
		System.out.println();
		for(int i = 1; i < phrase.length(); i++)
		{
			System.out.println("" + phrase.charAt(i-1) + phrase.charAt(i));
		}
		
		//location of every space
		for(int i = 0; i < phrase.length(); i++)
		{
			if(phrase.charAt(i) == ' ')
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//palindrome check
		int end = phrase.length()-1;
		boolean palin = true;
			//|| (!abc.contains(Character.toUpperCase(phrase.charAt(end))) && end != 0)
		for(int i = 0; i < phrase.length(); i++)
		{
			if(phrase.charAt(i) == ' ')
			{
				i++;
			}
			if(phrase.charAt(end) == ' ')
			{
				end--;
			}
			if( !(phrase.charAt(i) + "").equalsIgnoreCase(phrase.charAt(end) + ""))
			{
				palin = false;
			}	
			end--;
		}
		if(palin)
		{
			System.out.println("YES ITS A PALINDROME");
		}
		else
		{
			System.out.println("NO ITS NOT A PALIDROME");
		}
		
		
		//letter count
		int[] letNum = new int[26];
			//List<Character> abc = new ArrayList<Character>(Arrays.asList('A', 'B', 'C', 'D', 'E','F','G','H','I','J','K','L','M','N','O', 'P', 'Q','R','S','T','U','V','W','X','Y','Z'));
		for(int i = 0; i < phrase.length(); i++)
		{
			char chara = phrase.charAt(i);
			int ascii = (int) chara;
			letNum[ascii - 97] += 1;
		}
		
		for(int i = 0; i < letNum.length; i++)
		{
			System.out.printf("%-5s", letNum[i]);
		}
		System.out.println();
		
		
		
		
		
	}
	
	public static String decrypt(String msg)
	{
		String decrypted = "";
		for(int i = 0; i < msg.length(); i++)
		{
			int ascii = msg.charAt(i);
			if(ascii == 'a')
			{
				decrypted += "z";
			}
			else
			{
				ascii -= 1;
				decrypted += (char)ascii;
			}
		}
		
		return decrypted;
	}
	public static String rot13(String msg)
	{
		String decrypted = "";
		for(int i = 0; i < msg.length(); i++)
		{
			int ascii = msg.charAt(i);
			if(ascii <= 109)
			{
				ascii += 13;
				decrypted += (char)ascii;
			}
			else
			{
				ascii -= 13;
				decrypted += (char)ascii;
			}
		}
		
		return decrypted;
	}
	
	public static void printWeirdA(String word)
	{
		int start = 0; 
		for(int i = 0; i < word.length(); i++)
		{
			for(int j = start; j < word.length(); j++)
			{
				System.out.print(word.charAt(j));
			}
			System.out.println();
			start++;
		}
		System.out.println("");
		
	}
	
	
	public static void printWeirdB(String word)
	{
		int start = 0; 
		int space = 0; 
		for(int i = 0; i < word.length(); i++)
		{
			space = i;
			while(space > 0)
			{
				System.out.print(" ");
				space--;
			}
			System.out.print(word.substring(i));
			System.out.println();
		}
		System.out.println("");
	}
	
		
	public static void printWeirdA1(String word)
	{
		int start = 0; 
		for(int i = 0; i < word.length(); i++)
		{
			for(int j = start; j < word.length(); j++)
			{
				System.out.print(word.charAt(j));
			}
			System.out.println();
			start++;
		}                                                                                                     
		System.out.println("");
		
	}
	
	public static int doubleLet(String s)
    {
    	for(int i = 1; i < s.length(); i++)
    	{
    		if(s.charAt(i-1) == s.charAt(i) )
    		{	
    			return i-1;
    		}
    	}
    	return -1;
    }


    public static String mergeReversed(String[] array)
    {
    	String rev = "";
    	for(int i = array.length-1; i >= 0; i--)
    	{
    		rev += array[i];
    	}
    	return rev;
    }
}
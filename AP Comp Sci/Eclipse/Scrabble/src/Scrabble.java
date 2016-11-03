import java.io.File;
import java.util.List.*;
import java.util.Scanner;
import java.util.List;
public class Scrabble
{
    private String [] threes;
    
    public Scrabble()
    {
        buildThrees();
        System.out.println(buildRandomThree());
    }
    
    private void buildThrees()
    {
        Scanner scan = null;
        try
        {
            File f = new File( "threeWords.txt" );
            scan = new Scanner( f );
            int numWords = scan.nextInt();
            threes = new String[numWords];
            
            for ( int i = 0; i < numWords; i++ )
            {
                threes[i] = scan.next();
            }
        }
        catch( Exception e )
        {
            System.out.println(e);
        }
        finally
        {
            if ( scan != null )
            {
                scan.close();
            }
        }
        
    }

    public boolean isValidThreeWord(String word)
    {
        //change this to return true if the word is
        //a valid word in the threes array
        return false;
    }
    
    public List pruneInvalidWords( List words)
    {
        //change this to remove all words which are
        //not valid three letters words in Scrabble
        //use your isValidThreeWord method
        return null;
    }
    
    public String buildRandomThree()
    {
        // Change this to return a completely randomly
        // generated word that has exactly three letters
    	return "" + (char)((Math.random() * 26) + 'a') + (char)((Math.random() * 26) + 'a') + (char)((Math.random() * 26) + 'a');
    }
    
    public List buildAllThree( char a, char b, char c )
    {
        // Change this to build and return an array of every 
        // combination of words possible 
        // it is okay to have repeats
        // "abc", "acb", etcetera.
        return null;
    }
    
    
    public List buildThree( char a, char b )
    {
        // Change this to return every word combination
        // possible with a, b, and a blank in scrabble
        // That means it could be 
        // ab_, a_b, _ab, ba_, b_a, _ba
        return null;
    }
    
    
    public static void main(String [] args)
    {
        Scrabble scrab = new Scrabble();
        
        testBuildThreesAndValid(scrab);
    }
    
    
    public static void testBuildThreesAndValid(Scrabble scrab)
    {
        //Test for Build Threes
        for ( int r = 0; r < 20; r++ )
        {
            for ( int c = 0; c < 10; c++ )
            {
                System.out.print(scrab.buildRandomThree() + " ");
            }
            System.out.println();
        }
    }
    
    
}

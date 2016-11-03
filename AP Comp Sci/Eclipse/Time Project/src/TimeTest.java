import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author studentbfhs
 * @version 1.9.9.9
 */
public class TimeTest 
{
    /**
     * tests
     */
    @Test
    public void testGetHour()                                         
    {
        Time t = new Time();
        assertEquals( 12, t.getHour() );
        
        Time t2 = new Time( 5 );
        assertEquals( 5, t2.getHour() );
        
        Time t3 = new Time( 19 );
        assertEquals( 19, t3.getHour() );
    }
    
    /**
     * tests
     */
    @Test
    public void testGetSecond() 
    {
        Time t = new Time();
        assertEquals( 0, t.getSecond() );
        
        Time t2 = new Time( 5, 7, 1 );
        assertEquals( 1, t2.getSecond() );
        
        Time t3 = new Time( 5, 10, 75 );
        assertEquals( 75, t3.getSecond() );
    }
    
    /**
     * tests
     */
    @Test
    public void testGetMinute() 
    {
        Time t = new Time();
        assertEquals( 0, t.getMinute() );
        
        Time t2 = new Time( 5, 7 );
        assertEquals( 7, t2.getMinute() );
        
        Time t3 = new Time( 5, 10 );
        assertEquals( 10, t3.getMinute() );
    }
    
    /**
     * tests
     */
    @Test
    public void testToString() 
    {
        Time t = new Time();
        assertEquals( "12:00:00", t.toString() );
        
        Time t2 = new Time( 5, 7 );
        assertEquals( "5:07:00", t2.toString() );
        
        Time t3 = new Time( 5, 10 );
        assertEquals( "5:10:00", t3.toString() );
        
        Time t4 = new Time( 5, 10, 10 );
        assertEquals( "5:10:10", t4.toString() );
        
        Time t5 = new Time( 5, 10, 5 );
        assertEquals( "5:10:05", t5.toString() );
    }
    
    /**
     * tests
     */
    @Test
    public void testCompareTo()
    {
        Time t = new Time( 5 );
        Time g = new Time();
        assertEquals(-1, t.compareTo(g));
        
        Time t2 = new Time();
        Time g2 = new Time();
        assertEquals(0, t2.compareTo(g2));
        
        Time t3 = new Time( 5 );
        Time g3 = new Time( 1 );
        assertEquals(1, t3.compareTo(g3));
        
        
        
        Time t4 = new Time( 5, 2 );
        Time g4 = new Time( 5, 5 );
        assertEquals( -1, t4.compareTo( g4) );
        
        Time t5 = new Time( 5, 5 );
        Time g5 = new Time( 5, 5 );
        assertEquals( 0 , t5.compareTo( g5) );
        
        Time t6 = new Time( 5, 15 );
        Time g6 = new Time( 5, 5 );
        assertEquals( 1 , t6.compareTo( g6) );
        
        
        
        Time t7 = new Time( 5, 2, 7 );
        Time g7 = new Time( 5, 5, 40 );
        assertEquals( -1, t7.compareTo( g7) );
        
        Time t8 = new Time( 5, 5, 30 );
        Time g8 = new Time( 5, 5, 30 );
        assertEquals( 0 , t8.compareTo( g8) );
        
        Time t9 = new Time( 5, 15, 50 );
        Time g9 = new Time( 5, 5, 10 );
        assertEquals( 1 , t9.compareTo( g9) );
    }

}

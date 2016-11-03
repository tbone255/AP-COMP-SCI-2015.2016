import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Fitzgerald
 * @version v6.6.6
 *
 */
public class FractionTest 
{
    /**
     * saldkj
     */
    @Test
    public void testGetNumerator()
    {
        Fraction f = new Fraction(5, 10);
        assertEquals(5 , f.getNumerator());
    }
    
    /**
     * saldkj
     */
    @Test
    public void testGetDenominator()
    {
        Fraction f = new Fraction(5, 10);
        Fraction g = new Fraction();
        assertEquals(10 , f.getDenominator());
        assertEquals(1 , g.getDenominator());
    }
    
    /**
     * saldkj
     */
    @Test
    public void testSetNumerator()
    {
        Fraction f = new Fraction(5, 10);
        Fraction g = new Fraction();
        Fraction gg = new Fraction(5);
        f.setNumerator(6);
        g.setNumerator(6);
        gg.setNumerator(6);
        
        assertEquals(6 , f.getNumerator());
        assertEquals(6 , g.getNumerator());
        assertEquals(6 , gg.getNumerator());
    }
    
    /**
     * saldkj
     */
    @Test
    public void testSetDenominator()
    {
        Fraction f = new Fraction(5, 10);
        Fraction g = new Fraction();
        Fraction gg = new Fraction(5);
        f.setDenominator(20);
        g.setDenominator(20);
        gg.setDenominator(20);
        assertEquals(20 , f.getDenominator());
        assertEquals(20 , g.getDenominator());
        assertEquals(20 , gg.getDenominator());
    }
    
    /**
     * saldkj
     */
    @Test
    public void testToDecimal()
    {
        Fraction f = new Fraction(5, 10);
        Fraction g = new Fraction();
        Fraction gg = new Fraction(5);
        assertEquals(.5 , f.toDecimal(), 0.0000000001);
        assertEquals(0.0 , g.toDecimal(), 0.0000000001);
        assertEquals(5.0 , gg.toDecimal(), 0.0000000001);
    }
    
    /**
     * saldkj
     */
    @Test
    public void testToString()
    {
        Fraction f = new Fraction(5 , 10);
        Fraction g = new Fraction();
        Fraction gg = new Fraction(5);
        Fraction ggg = new Fraction(23423, 0);
        assertEquals("5/10" , f.toString());
        assertEquals("0" , g.toString());
        assertEquals("5" , gg.toString());
        assertEquals("undefined" , ggg.toString());
    }
    
    /**
     * saldkj
     */
    @Test
    public void testCompareTo()
    {
        Fraction f1 = new Fraction(5 , 10);
        Fraction f2 = new Fraction(9 , 10);
        
        Fraction g1 = new Fraction(0 , 0);
        Fraction g2 = new Fraction(0 , 0);
        
        Fraction x1 = new Fraction(9 , 10);
        Fraction x2 = new Fraction(5 , 10);
               
        assertEquals(-1 , f1.compareTo(f2));
        assertEquals(0 , g1.compareTo(g2));
        assertEquals(1 , x1.compareTo(x2));
    }
    
    /**
     * saldkj
     */
    @Test
    public void testReduce()
    {
        Fraction f1 = new Fraction(5 , 10);
        Fraction g = new Fraction();
        Fraction gf = new Fraction(5);
        Fraction gfg = new Fraction(0, 0);
        Fraction f2 = new Fraction(-5 , 10);
        Fraction f3 = new Fraction(10 , -10);
        Fraction f4 = new Fraction(-2, -2);
        f1.reduce();
        g.reduce();
        gf.reduce();
        f2.reduce();
        f3.reduce();
        f4.reduce();
        assertEquals(1 , f1.getNumerator());
        assertEquals(2 , f1.getDenominator());
        
        assertEquals(0 , g.getNumerator());
        assertEquals(1 , g.getDenominator());
        
        assertEquals(5 , gf.getNumerator());
        assertEquals(1 , gf.getDenominator());
        
        assertEquals(0 , gfg.getNumerator());
        assertEquals(0 , gfg.getDenominator());
        
        assertEquals(-1 , f2.getNumerator());
        assertEquals(2 , f2.getDenominator());
        
        assertEquals(1 , f3.getNumerator());
        assertEquals(-1 , f3.getDenominator());
        
      
        
    }
}

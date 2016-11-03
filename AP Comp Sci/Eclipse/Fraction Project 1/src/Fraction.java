/**
 * Just a fraction class.
 * @author tbone255
 * @version 9/17/15
 */
public class Fraction implements Comparable
{
    private int numer;
    private int denom;
    
    //constructors
    /**
     * Makes a fraction of 0/1
     */
    public Fraction() 
    {
        this.numer = 0;
        this.denom = 1;
    }
    
    /**
     * Makes a fraction with the numerator given and the denominator given
     * @param numerator numerator
     * @param denominator denominator
     */
    public Fraction(int numerator, int denominator)
    {
        this.numer = numerator;
        this.denom = denominator;
    }
    /**
     * Makes a whole number fraction
     * @param whole whole number
     */
    public Fraction(int whole)
    {
        this.numer = whole;
        this.denom = 1;
    }
    
    //getters
    
    /**
     * returns numerator of this fraction
     * @return numerator numerator
     */
    public int getNumerator()
    {
        return numer;
    }
    /**
     * returns denominator of this fraction
     * @return denominator denominator
     */
    public int getDenominator()
    {
        return denom;
    }
    
    //setters
    
    /**
     * Sets the numerator of this fraction to the given numerator
     * @param numerator the value of the fraction, the numerator
     */
    public void setNumerator(int numerator)
    {
        numer = numerator;
    }
    /**
     * Sets the denominator of this fraction to the given denominator
     * @param denominator the bottom value of the fraction, the denominator
     */
    public void setDenominator(int denominator)
    {
        denom = denominator;
    }
    
    //other
    
    /**
     * Returns the double value of the fraction
     * @return double
     */
    public double toDecimal()
    {
        
        return (double)getNumerator() / getDenominator();
    }
    /**
     * converts the fraction to a string
     * @return returns the string format of the fraction
     */
    public String toString()
    {
        if (denom == 1)
        {
            return numer + "";
        }
        
        if (denom == 0)
        {
            return "undefined";
        }
        return numer + "/" + denom;
    }
    
    /**
     */
    public void reduce() {
        // find the larger of the numerator and denominator
        int n = getNumerator();
        int d = getDenominator();
        int largest;
        int smaller;
        if (n > d) 
        {
            largest = n;
            smaller = d;
        }
        else {
            largest = d;
            smaller = n;
        }

        // find the largest number that divide the numerator and
        // denominator evenly
        int gcd = 0;
        for (int i = largest; i >= 2; i--) 
        {
            if (n % i == 0 && d % i == 0) 
            {
                gcd = i;
                break;
            }
        }

        // divide the largest common denominator out 
        //of numerator and the denominator
        if (gcd != 0) 
        {
            n /= gcd;
            d /= gcd;
        }
        if (gcd < 0) 
        {
            if (smaller == n)
            {
                n /= gcd;
                d /= -gcd;
            }
            else if (smaller == d)
            {
                n /= -gcd;
                d /= gcd;
            }
        }
        setNumerator(n);
        setDenominator(d);
        
    }
    
    /**
     * @return returns 1 if this fraction is greater, 0 if equal, -1 if less
     * @param o Requires an object to compare it to
     */
    public int compareTo(Object o) 
    {
        Fraction f2 = (Fraction)o;
        ////////return Double.compare(this.toDecimal(), other.toDecimal());///
        ///////////
        ///////////////////////////////
        if (this.toDecimal() < ((Fraction) f2).toDecimal())
        {
            return -1;
        }
        if (this.toDecimal() > ((Fraction) f2).toDecimal())
        {
            return 1;
        }
        return 0;
    }
}

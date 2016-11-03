/**
 * 
 * @author tates
 * @version 1.9.9.9
 *
 */
public class Time implements Comparable<Object>
{
    final private int hour;
    final private int minute;
    final private int second;
    
    /**
     * makes time with 00:00:00
     */
    public Time()
    {
        this( 0, 0, 0 );
    }
    /**
     * 
     * @param hour makes time with only an hour
     */
    public Time( int hour )
    {
        this( hour, 0, 0 );
    }
    
    /**
     * 
     * @param hour needs an hour
     * @param minute the minute 
     */
    public Time( int hour, int minute )
    {
        this( hour, minute, 0 );
    }
    /**
     * 
     * @param hour requires an hour
     * @param minute requires a minute
     * @param second requires a second
     */
    public Time( int hour, int minute, int second )
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    /**
     * 
     * @return returns hour
     */
    public int getHour() 
    {
        if ( this.hour == 0 )
        {
            return 12;
        }
        return this.hour;
    }
    
    /**
     * 
     * @return returns minute
     */
    public int getMinute() {
        return this.minute; 
    }
    
    /**
     * 
     * @return returns second
     */
    public int getSecond() {
        return this.second;
    }
    
    /**
     * @return returns string format of the time
     */
    public String toString()
    {
        String time = "";
        
        time = getHour() + ":";
        
        if ( getMinute() < 10 )
        {
            time += "0" + getMinute() + ":";
        }
        
        else
        {
            time += getMinute() + ":";
        }
        
        if ( getSecond() < 10 )
        { 
            time += "0" + getSecond();
        }
        
        else
        {
            time += getSecond();
        }
        
        return time;
    
    }
    
    /**
     * @return returns u know what
     * @param o ayy
     */
    public int compareTo( Object o )
    {
        /////////////////////////////////////////////////////////
        if ( this.getHour() < ((Time) o).getHour() )
        {
            return -1;
        }
        
        else if ( this.getHour() > ((Time) o).getHour() ) 
        {
    
            return 1;
        }
        
        /////////////////////////////////////////////////////////
        
        if ( this.getMinute() < ((Time) o).getMinute() )
        {
            return -1;
        }
        
        else if ( this.getMinute() > ((Time) o).getMinute() ) 
        { 
            return 1;
        }
        
        ////////////////////////////////////////////////////////
        if ( this.getSecond() < ((Time) o).getSecond() )
        {
            return -1;
        }
        
        else if ( this.getSecond() > ((Time) o).getSecond() ) 
        {
            return 1;
        }    
        
        return 0;
    }
    
    
    
}

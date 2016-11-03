public abstract class Meal implements Sellable
{
    private double price;
    
    public Meal( double price )
    {
    this.price = price;
    }
    public double getBasePrice()
    {
        return price;
    } 
    public double getTotalPrice( double tax )
    {
        return ( 1 + tax / 100.0 ) * price;
    }
}

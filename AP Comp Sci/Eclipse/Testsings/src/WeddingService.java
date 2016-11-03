public class WeddingService implements Sellable
{
    private int steaks, fishes;
    private SpecialMeal[] list;
    
    private double specialTotal;
    
    final private double SPRICE = 5.99 * 8.0;
    final private double FPRICE = 7.59 * 6.0;

    
    private double price;
	public WeddingService(int steaks, int fishes, SpecialMeal[] list)
	{
	     this.steaks = steaks;
	     this.fishes = fishes;
	     this.list = list;
	     
	     
	}
	public double getBasePrice()
	{
		for(SpecialMeal s : list)
	     {
	         specialTotal += s.getBasePrice();
	     }
	    return (SPRICE * steaks) + (FPRICE * fishes) + specialTotal;
	}
	public double getTotalPrice(double tax)
	{
	    //price = (SPRICE * steaks) + (FPRICE * fishes) + specialTotal;
	    return (getBasePrice() * tax) + getBasePrice();
	}
	
	public String toString()
	{
	    String str = "Wedding Service Bill\nSteak Meals\t" + String.format("%.2f", (SPRICE * steaks)) + "\nFish Meals\t" + String.format("%.2f", (FPRICE * fishes)) + "\nSpecial Meals:\n";												
	    for(SpecialMeal s : list)
	     {
	         str += "" + s.getRestrictions() + "\t" + s.getBasePrice() + "\n";
	     }
	    return str;
	}
}



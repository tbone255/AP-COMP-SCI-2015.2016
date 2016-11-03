public abstract class SpecialMeal extends Meal
{
    private String restrictions;

    public SpecialMeal( double cost, String restriction )
    {
    super( cost ); 
    this.restrictions = restriction;
    }

    public String getRestrictions()
    {
    return restrictions;
    }
}


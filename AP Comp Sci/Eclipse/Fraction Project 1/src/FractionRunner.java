import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FractionRunner
{

   
	public static void main(String[] args)
    {
        List<Fraction> fracs = new ArrayList<Fraction>();
        fracs.add(new Fraction(1, 2));
        fracs.add(new Fraction(3, 4));
        fracs.add(new Fraction(5, 6));
        fracs.add(new Fraction(7, 8));
        fracs.add(new Fraction(9, 10));
        fracs.add(new Fraction(11, 12));
        fracs.add(new Fraction(13, 14));
        fracs.add(new Fraction(15, 16));
        fracs.add(new Fraction(17, 1));
        fracs.add(new Fraction(0, 5));
        
        System.out.println(fracs.get(1));
        
        for(int i = 0; i < fracs.size(); i++)
        {
            System.out.println(fracs.get(i));
        }
        Collections.sort(fracs);
        System.out.println(fracs);
        
        System.out.println(2-1.9);;
        
        Fraction f = new Fraction();
        Fraction g = new Fraction(1,2);
        System.out.println(Double.compare(f.toDecimal(), g.toDecimal()));
        Fraction x = new Fraction();
        System.out.println(x.toDecimal());
        
        Fraction ff = new Fraction(-5, 10);
        ff.reduce();
        System.out.println(ff);
        
        System.out.println(-5 / 5);
        
        
        
    }
}
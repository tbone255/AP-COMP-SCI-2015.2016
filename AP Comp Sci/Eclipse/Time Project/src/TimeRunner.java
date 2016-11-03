import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TimeRunner 
{
	public static void main(String[] args)
	{
		List<Time> times = new ArrayList<Time>();
		times.add(new Time());
		times.add(new Time(1,2,3));
		times.add(new Time(1));
		times.add(new Time(54,76,2));
		times.add(new Time(34,9));
		times.add(new Time(25));
		System.out.println(times);
		
		
		Collections.sort(times);
		System.out.println("Sorted");
		System.out.println(times);
		
	}
}

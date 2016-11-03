import java.util.ArrayList;
import java.util.List;

public class TestStuff 
{
	public static void main(String[] args)
	{
		
//		List snacks = new ArrayList();
//		snacks.add("raisins"); // raisins
//		snacks.add("bananas"); // raisins bananas
//		snacks.add("crackers"); // raisins bananas crackers
//		snacks.add(2, "grapes"); // raisins bananas grapes crackers
//		snacks.add("plums"); // raisins bananas grapes crackers plums
//		snacks.remove(0); // bananas grapes crackers plums
//		snacks.set(1, "figs"); // bananas figs crackers plums
//		snacks.remove(2); // bananas figs plums
//		System.out.println(snacks); // output here: ["bananas", "figs", "plums"]
		
		
		List snacks = new ArrayList();
		snacks.add("raisins");
		snacks.add("bananas"); 
		snacks.add("oreos");
		String mySnack = (String) snacks.get(1); 
		snacks.add(mySnack);
		snacks.set(4, "carrots");
		System.out.println(snacks.get(0));
		snacks.remove(0);
		System.out.println(snacks.remove(0)); 
		System.out.println(snacks.size());
		System.out.println(snacks.get(snacks.size() - 1));
		
		
		
	}
	
	
	
}

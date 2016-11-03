import java.util.ArrayList;

public class TESTSTS {

	public static void main(String[] args) 
	{
		ArrayList<String> temp = new ArrayList<String>();
		temp.add("ayy");
		temp.add("lmao");
		System.out.println(temp.toString());

		System.out.println(copy(temp, 4));

	}
	
	 public static ArrayList<String> copy(ArrayList<String> array, int n){
         ArrayList<String> returnArray = new ArrayList<String>();
         for(int i = 0; i < array.size(); i++){
                 for(int j = 0; j < n; j++){
                         returnArray.add(array.get(i));
                 }
         }
         return returnArray;
        
 }

}

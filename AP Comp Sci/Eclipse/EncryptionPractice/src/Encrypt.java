
public class Encrypt {

	public static void main(String[] args) 
	{
		System.out.println(numberEncrypt("blah"));
		System.out.println(numberEncrypt("color"));
		
		System.out.println(phoneEncrypt("1-800-SWT-FROG"));
	}
	
	public static String numberEncrypt(String msg)
	{
		//take word and convert to ascii like 1-1-1-1
		String phrase = "";
		for(int i = 0;i < msg.length(); i++)
		{
			if(i != msg.length() - 1)
			{
				phrase += (int)msg.charAt(i) + "-";
			}
			else
			{
				phrase +=(int) msg.charAt(i);
			}
		}
		return phrase;
	}
	
	
	public static String phoneEncrypt(String msg)
	{
		int ascii = 0;
		String lower = msg.toLowerCase();
		String phrase = "";
		int[] nums = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		for(int i = 0;i < msg.length(); i++)
		{
			ascii = lower.charAt(i);
			if(ascii >='a' && ascii <= 'z')
			{
				phrase += nums[ascii - 'a'];
			}
			else
			{
				phrase += msg.charAt(i);
			}
		}
		return phrase;
	}
	
}

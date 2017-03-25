
public class working_substring {
	
	/*public static void Main (String args[])
	{
		System.out.println("Inside Main");
	}*/
	
	
	/***
	 * Attach jre source to debug and understand it.
	 * 
	 * @param args
	 */
	public static void main (String args[])
	{
		System.out.println("Inside main");
		
		
		String abc ="ABCDEFGHIJ";
		
		System.out.println("length of abc=" + abc.length());
		String def = abc.substring(11, 10);
		
		System.out.println("value of def=" + def);
	}

}

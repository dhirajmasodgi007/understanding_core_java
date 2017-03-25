
public class String_Integer_conversion {
	
	private String str ="0.00";
	private String strNodec="0";

	public static void main(String[] args) {
		/**
		 *  When decimal values are there in string conversion to Integer throws number format exception but same is not the case when we use string without decimal values.
		 */
		/*String str = "50.00";
		int myInt = Integer.parseInt(str);
		System.out.println("vaue of myInt" + myInt);*/
		
		//Below code prints 50 without any error.
		String strNodec = "50";
		int myIntNodec = Integer.parseInt(strNodec);
		System.out.println("vaue of myInt" + myIntNodec);
		
		 
		
		
		
		
	}

}

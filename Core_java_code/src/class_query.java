
public class class_query {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class_query abc = new class_query();
		Class c = abc.getClass();
		
		try
		{
			System.out.println(c.getMethod("getMeth", null).toString());
			System.out.println(c.getDeclaredMethod("setMethod", null).toString());
		}catch (Exception e)
		{
			
		}
	}
	
		public void setMethod()
		{
			// return 2;
		}
		
		public Integer getMeth()
		{
			return 2;
		}
		
	

}

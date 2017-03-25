/**
 * 
 * static methods can only be declared in static block or top level type.
 * 
 * @author dhirajm
 *
 */
public class multiple_main {
	
	public static void  main(String []args)
	{
	
		 class abc {
			public static void  main(String []args)
			{
				System.out.println("inside abc");
			}
		}
		
		
		 class def {
			public static void  main(String []args)
			{
				System.out.println("inside def");
			}
		}
	
	}
}

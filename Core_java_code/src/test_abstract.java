
public abstract class test_abstract {
	
	/**
	 * 
	 * Non abstract methods can be defined in abstract class
	 * @return
	 */
	public int abc (){
		int x = 1;
		return x;
	};
	
	/**
	 *  Abstract methods declaration.
	 * 
	 * @return
	 */
	public abstract float  def();
	
	
	/**
	 * Variable of wrapper type can't be declared in abstract class
	 */
	// public final static String s;
	/**
	 *  non final, non static variable with primitive types can be declared in abstract class.
	 */
	public int x;
	//public final int b;
	public static int c;

}

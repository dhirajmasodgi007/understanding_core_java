import java.beans.ConstructorProperties;

public class constructor_queries {

	
	//BElow all constructor declaration are wrong.
	/**
	 *  with constructor only public, private or protected modifier are allowed.
	 */
	public final constructor_queries (){}
	
	@Override
	public constructor_queries (int a){}
	
	@Constructor
	public constructor_queries(String a){}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

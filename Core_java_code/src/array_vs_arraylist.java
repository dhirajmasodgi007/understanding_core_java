import java.util.ArrayList;
import java.util.List;

public class array_vs_arraylist {
	
	public static void Main (String args[])
	{
		int [] ar = new int [5];
		
		
		/***
		 * BElow  line confirms that we can't use ArrayLIst for storing primitive types. it
		 * gives compilation error.  instead we need to use the wrapper of primitive.
		 */
		ArrayList<float> al = new ArrayList<float>();
		List<int> list = new ArrayList<Integer>();
	}
	

}

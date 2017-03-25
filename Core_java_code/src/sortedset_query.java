import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset_query {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet<Integer> ss = new TreeSet<>();
		
		ss.add(new Integer("3"));
		ss.add(new Integer("2"));
		ss.add(new Integer("3"));
		ss.add(new Integer("1"));
		ss.add(new Integer("3"));
		ss.add(new Integer("2"));
		
		System.out.println("values in ss " + ss.toString());

	}

}

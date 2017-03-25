
public class child1 extends parent1 {

	public child1() {
		count++;
		}

	public static void main(String[] args) {
		System.out.println(getCount());
		child1 obj = new child1();
		System.out.println(getCount());
	//	System.out.println(obj.getCount());

	}

}

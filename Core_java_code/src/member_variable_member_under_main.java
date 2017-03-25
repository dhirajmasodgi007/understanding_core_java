
public class member_variable_member_under_main {

	int x = 5;
	
	public static void main(String[] args) {
		
		int x = 10;
		member_variable_member_under_main m = new member_variable_member_under_main();
		System.out.println(m.x);
		//System.out.println();
	//	System.out.println(member_variable_member_under_main.x);

	}

}

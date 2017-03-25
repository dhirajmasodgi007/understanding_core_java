
public class static_query {
	
	private static int count;
	
	static{
		count = 10;
		System.out.println("value of count inside static" + count);
	}
	
	public void method(){
		int count;
		count = 5;
		System.out.println("value of count inside method" + this.count);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static_query var = new static_query();
		var.method();
	}

}

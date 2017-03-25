
public class string_manipulation {

	public static void main(String[] args) {
		
		
		StringBuilder stringBuffer = new StringBuilder("BUFFERING");
		stringBuffer.replace(2, 7, "uffer");
		System.out.println(stringBuffer.toString());
		stringBuffer.delete(1, 3);
		
		System.out.println("value of left " + stringBuffer.toString());

	}

}

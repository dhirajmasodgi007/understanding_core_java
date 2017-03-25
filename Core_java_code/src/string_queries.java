
public class string_queries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String literal ="abc";
		
		String str = new String ("abc");
		
		
		System.out.println( str == literal);
		System.out.println("\n  value of literal.equals(str) " + literal.equals(str));
		System.out.println("\n value of new String (abc) == new String (abc) "  + new String("abc")  ==  new String("abc"));
	//	System.out.println("\n  value of literal.hashcode() == str.hashcode() "  + literal.hashCode() == str.hashCode());
		//System.out.println("\n  value of literal.equals(str) "  +  literal.equals(str));
		System.out.println("\n value of string.matches(str)  "   +  str.matches(literal) );
	
		

	}

}


public abstract class abstract_class {

	/**
	 * abstract class may or may not have abstract methods.
	 * 
	 * if a class have an abstract method then class must be declared abstract else compilation error.
	 * 
	 * along with abstract method abstract class can have other normal methods with body or definition.
	 * 
	 * abstract methods cant allowed to have body.
	 * 
	 * 
	 * abstract class can have main method which is static but not sure whether this is allowed due to java 8 need to chec in lower version.
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abstract_class a = new abstract_class() {
			
			@Override
			public void method1(int i) {
				// TODO Auto-generated method stub
				
			}
		};
		a.method1(2);
		
		a.method2("hello");

	}
	
	public  abstract void  method1(int i);
	
	/*public abstract void method3(float f) {
		//not allowed for abstract methods to have body
	}*/
	
	public void method2(String str){}
	
	public void method4(Double d){};

}

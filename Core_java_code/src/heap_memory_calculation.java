
public class heap_memory_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Runtime runtime = Runtime.getRuntime();
		
		System.out.println("free memory " +  runtime.freeMemory());
		System.out.println("max memory "  +  runtime.maxMemory());
		System.out.println("total memory"  + runtime.totalMemory());
	}

}


public class thread_example {
	
	
	
	public static void Main (String [] args)
	{
		thread_example thread = new thread_example();
		thread.mymethod(new Runnable()
		{
			public void run ()
			{
			}
		}
		);
	}

}

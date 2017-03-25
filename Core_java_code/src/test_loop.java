
public class test_loop {

	
	/*final test_loop()
	{
		
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =0, j = 0;
		int counter=0;
		outer:
			for(i =0 ; i < 4 ; i++ ){
				for (j =0; j<2; j++)
				{
					counter++;
					if (i==2)
						i++;
					continue outer;
				}		
				}
	System.out.println("i="+i + ", counter= " +counter);
	}

}

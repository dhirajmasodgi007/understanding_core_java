
public class static_block_query {
	
	//private int p =3 ;
	
	static class abc
	{
		// int p= 5;
		private int d =3;
		
		public void meth(int x)
		{
			x++;
			d = d + x;
		}
	}
	

	public static void main(String[] args) {
	abc a = new abc ();
	int d = 4;
	a.meth(d);
	
	System.out.println("value of a.d " + a.d);

	}

}

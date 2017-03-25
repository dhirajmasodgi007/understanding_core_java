import java.util.TimeZone;

public class understand_timezone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TimeZone zone = TimeZone.getTimeZone("US/Mountain");
		System.out.println("zone " + zone.toString());
		TimeZone zone1 = TimeZone.getTimeZone("America/Denver");
		System.out.println("zone1 " + zone1.toString());
	}

}

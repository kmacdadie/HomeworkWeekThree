
public class MethodPractice {

	public static void main(String[] args) {
		/*
		 * Write a vend method that takes double currency and String selection
		 * and returns a different String (candy) for different selections
		 * validate the currency is sufficient to purchase the candybar, 
		 * otherwise, return the money with a meaningful message.
		 */
		//vend(.50, "A1");
		//vend(.75, "A2");
		//vend(1, "A3");
		//vend(1.25, "A4");
		//vend(1.50, "A5");
		//String snickers = "A1";
		//String hersheys = "A2";
		//String twix = "A3";
		//String mars = "A4";
		//String mounds = "A5";
		
		
		System.out.println(vend(.50, "A1"));
		System.out.println(vend(.75, "A2"));
		System.out.println(vend(.50, "A3"));
		System.out.println(vend(1, "A3"));
		System.out.println(vend(1.25, "A4"));
		System.out.println(vend(1.50, "A5"));
		
		System.out.println(ford(25000, "1/4Ton"));
		System.out.println(ford(15000, "1/2Ton"));
		System.out.println(ford(35000, "1/2Ton"));
		System.out.println(ford(45000, "3/4Ton"));
	}
	public static String vend(double curr, String selection) {
			
		if (selection == "A1" && curr >= .50) {
			return "Snickers";
		} else if (selection == "A2" && curr >= .75) {
			return "Hersheys";
		} else if (selection == "A3" && curr >= 1)	{
			return "Twix";
		} else if (selection == "A4" && curr >= 1.25) {
			return "Mars";
		} else if (selection == "A5" && curr >= 1.50) {
			return "Mounds";}
		return "You're Broke, Get a Job Bro!";
	}
	public static String ford(double money, String truck) {
		
		if (truck == "1/4Ton" && money >= 25000) {
			return "F150";
		} else if (truck == "1/2Ton" && money >= 35000) {
			return "F250";
		} else if (truck == "3/4Ton" && money >= 45000) {
			return "f350";}
		return "Wake up you are dreaming! HA";
	
	
	String happy = "x";
	for (int i = 0; i > happy ; i++);
	
	
}
}


 
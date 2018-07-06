
public class EnhancedForLoop {

	public static void main(String[] args) {
		
		String[] students = new String[5];
		
		students[0] = "Leiland";
		students[1] = "Sam";
		students[2] = "Daniel";
		students[3] = "Kirsten";
		students[4] = "Keith";
		
		for (String student : students ) {
			System.out.println(student);
			System.out.println("Hello," + student);
		System.out.println();
		}
		int positionOfKeith = 0;
		
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals("Keith")) {
				positionOfKeith = i;
				
				
		System.out.println(students[positionOfKeith] + " was found at position " + positionOfKeith);		
				
				
			}
		
		}
	
	String[] fordTrucks = new String[5];
	
	fordTrucks[0] = "Raptor";
	fordTrucks[1] = "Ranger";
	fordTrucks[2] = "F150";
	fordTrucks[3] = "F250";
	fordTrucks[4] = "F350";
	
	for (String Truck : fordTrucks) {
		System.out.println(Truck);
		System.out.println(" Sweet " + Truck);
	}
	
	int positionOfF250 = 0;
	
	for (int i = 0; i < fordTrucks.length; i++) {
		if (fordTrucks[i].equals("F250")) {
			positionOfF250 = i;
			
		}
	}
	System.out.println(fordTrucks[positionOfF250] + " was found at position " + positionOfF250);
	
	
	
	}
	
}

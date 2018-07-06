
public class Methods {

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
		}
		
		int positionOfKeith = 0;
				
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals("Keith")) {
				positionOfKeith = i;
			}				
		}
		
		System.out.println(students[positionOfKeith] + " was found at position " + positionOfKeith);		
			
		sayHello(students[3]);
		sayHello("Keith");
	
		System.out.println(findStudentIndex(students , "Nick"));
	}
	
	public static void sayHello(String name) {
		System.out.println("Hello," + name);
	}
		
	public static int findStudentIndex(String[] array, String name) {
		int position = 1;
	
	 
		System.out.println(true || false);
		
		
		return position; 
	}
	}
	
	
	
	

	
import java.util.Scanner;

public class WeekThreeCode {
	static Scanner s = new Scanner(System.in);
	static int addingIndex = 0;
	
	public static void main(String[] args) {
		
		String[] dealorship = new String[5];
		int decision = 0;
		
		while (decision != -1) {
			showMenu();	
			decision = s.nextInt();
			
			if (decision <= -1 || decision >= 10) {
				System.out.println("Please choose a valid option!");
			} else if (decision == 1) {
				welcomeUser(dealorship);
			} else if (decision == 2) {
				showDealorshipList(dealorship);	
			} else if (decision == 3) {
				addDealorship(dealorship);
			} else if (decision == 4) {
				showDealorship(dealorship);
			} else if (decision == 5) {
				deleteDealorship(dealorship);
			} else if (decision == 6) {
				deleteAllDealorship(dealorship);
			} else if (decision == 7) {	
				pickTruckBrand(dealorship);
			} else if (decision == 8) {	
				pickSize(dealorship);
			} else {	
				pickColor(decision);
			}
		}
	}	
			
		public static void welcomeUser(String[] dealorship) {
				System.out.print("Enter User Name: ");
				String userName = s.next();
				System.out.println("Welcome, " + userName);
			}
		
		private static void showDealorshipList(String[] dealorship) {
			System.out.println("Dealorship List:");
			for (int i = 0; i < dealorship.length; i++) {
				System.out.println(i + ": " + dealorship[i]);
			}
		}
				
		private static void addDealorship(String[] dealorship) {
			System.out.println("Enter new dealorship name:");
			String newDealorship = s.next();
			if (isValid(addingIndex)) {
				dealorship[addingIndex++] = newDealorship;
			}
		}
		
		private static void showDealorship(String[] dealorship) {
			System.out.print("Which dealorship brand would you like to see?");
			int dealorNumber = s.nextInt();
			if (isValid(dealorNumber)) {
				System.out.println(dealorNumber + ": " + dealorship[dealorNumber]);
			}
		}
		
		public static boolean isValid(int input) {
			if (input >= 0 && input  < 10) {
				return true;
			} else {
				System.out.println("Invalid entry.");
				return false;
			}
		}
		
		private static void deleteDealorship(String[] dealorships) {
			System.out.print("Which dealorship would you like to delete?");
			int dealorshipToDelete = s.nextInt();
			if (isValid(dealorshipToDelete)) {
				dealorships[dealorshipToDelete] = null;
			}
		}
			
		private static void deleteAllDealorship(String[] dealorships) {
			for (int i = 0; i < dealorships.length; i++) {
				dealorships[i] = null;
			}
		}

		private static void pickTruckBrand(String[] dealorship) {
			System.out.print("Pick your favorite truck brand Ford, Chevy, Dodge");
			String favoriteTruckBrand = "Ford, Chevy, Dodge";
			favoriteTruckBrand = s.next();
			System.out.println("Favorite Brand:" + " " + favoriteTruckBrand);
		}

		private static void pickSize(String[] dealorship) {
			System.out.print("Pick size of truck 1500, 2500, 3500");
			String truckSize = "1500, 2500, 3500";
			truckSize = s.next();
			System.out.println("Truck Size:" + " " + truckSize);	
		}
		
	
		private static void pickColor(int decision) {
			System.out.print("Pick Color Red, Black, White");
			String color = "Red, Black, White";
			color = s.next();
			System.out.println("Truck Color:" + " " + color);
		}
		
		private static void showMenu() {
			System.out.println("Please choose a option or enter -1 to exit.");
			System.out.println("1) Enter User Name:");
			System.out.println("2) Show Dealorship list");
			System.out.println("3) Add a Dealorship");
			System.out.println("4) Show Dealorship");
			System.out.println("5) Delete Dealorship");
			System.out.println("6) Delete All Dealorships");
			System.out.println("7) Pick your favorite truck brand:");
			System.out.println("8) Pick size of truck:");
			System.out.println("9) Pick color:");
			
				
		}
		
	}



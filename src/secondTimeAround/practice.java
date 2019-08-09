package secondTimeAround;

public class practice {
	
	public static void main(String[] args) {
		 // 1.  
			  int[] ages = new int[] {12, 3, 9, 23, 64, 2, 8, 28, 93};
			  int first = ages[0];
			  int last = ages[ages.length-1];
			  int total = 0;		  
			  System.out.println(first - last);
			  for (int i = 0; i < ages.length; i++) {
			        total = total + ages[i];
			  }
			    int average = total / ages.length;
			    System.out.println(average);
			 // 2.
			  String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			   int totalCount = 0;
			   for(String s : names) {
			      totalCount += s.length();
			   }
			    System.out.println(totalCount);
			    int avg = totalCount / names.length;
			    System.out.println(avg);

			  for( int j = 0; j < names.length; j++){
			        System.out.print(" " + names[j] + " ");
			  }	  
			// 3.
			  //int[] numbers = new int[] {10, 2, 12, 23, 43, 16,};
			        //firstNum = numbers[0];
			// 4.
			  //int[] numbers = new int[] {10, 2, 12, 23, 43, 16,};
			        //lastNum = numbers[numbers.length -1];

		    //5.
			    int[] nameLengths = new int[6];
			      for (int k = 0; k < names.length; k++) {
			      System.out.println(names[k].length());
			      nameLengths[k] = names[k].length();
			      	}
			    for (Integer k : nameLengths) {
			        System.out.println(k);  
			//6.
			    int sums = 0;
			    for (int value2 : nameLengths) {
			      sums += value2;
			    }
			    System.out.println(sums);
			    } 

			    System.out.println(timesThree("Hello",3)); 
			    System.out.println(twoStrings("Keith","Macilroy"));
			    System.out.println(twoStrings("Keith","Macilroy"));
			    System.out.println(willBuyDrink(true, 15));
			    System.out.println(sweetTruck("Ford","F250"));
		} 

			//7.
			   	public static String timesThree(String str, int numbs) {
			      String result = "";
			      for (int i = 0; i < numbs; i++) {
			         result += str;
			       }
			       return result;
			    }  
			//8.
			    private static String twoStrings(String x, String y) {
			       String fullName = x + " " + y;
			       return fullName;

			      }
			//9.
			    public static boolean greaterHundo(int[] larger) {
		          for(int m = 0; m < larger.length; m++) {
		             if( larger[m] >= 101) {
			          return true;
			        }
			      }   
			      return false;
			    } 
			//10.
			     public double averageDub(String[] numbers) {
			       double sum = 0;
			       for (int n = 0; n < numbers.length; n++) {
			     	 sum += numbers[n].length();
			    	}
			    	 return sum / numbers.length;
				}
			//11.
			     public static boolean greaterAvg(double[] arrayOne, double[] arrayTwo) {
			        double total = 0;
			        double total2= 0;
			         for (int c = 0; c < arrayOne.length; c++) {
			            total += arrayOne.length;
			        }
			        double average = total / arrayOne.length;
			         for(int d = 0; d < arrayTwo.length; d++) {
			            total2 += arrayTwo.length;
			        }
			        double average2 = total2 / arrayTwo.length;
			         if(average > average2) {
			           return true;
			         }
			         return false;
			      }
			//12.
			     public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			       	if(isHotOutside == true && moneyInPocket >= 10.51) {
			       		return true;
			       }
			       	return false;
			     }   
			//13.
			     public static String sweetTruck(String brand, String truckSize) { 		    		    	 
			    	 String truckResults = brand + " " + truckSize;
			    	 return truckResults; // This method will print out your truck Brand and Size.
			     } 

}


public class Fase3 {

		
		
		public static void main(String[] args) {
			
			int birthYear = 1982;			
			boolean leapYear = true;
			boolean notLeapYear = false;
						
	
			for (int i = 1948; i <= birthYear; i++) {
				 
				  
			if ((i % 4 == 0) && i % 100 != 0)
			        {
			      System.out.println(i);
			        }	  
				}
			
			for (int a = birthYear; a <= birthYear; a++) {
				 	  
				if ((a % 4 == 0) && a % 100 != 0)
				        {
				      System.out.println("Is " + a + " a leap year? " + leapYear);
				        }	  
				else {
					System.out.println("Is " + a + " a leap year? " + notLeapYear);
				}
				
					}
		

		
			}
}


public class Fase1 {
	
	

	public static void main(String[] args) {

		String s1 = "Evandro ";
		String s2 = "Pereira ";
		String s3 = "Silva";
		String s4 = s2 + s3 +", " + s1;
		System.out.println(s4);
		
		/* using StringBuilder class
		 
		
		StringBuilder sb = new StringBuilder(s2)
				.append(s3)
				.append(", ")
				.append(s1);
		System.out.println(sb);
		
		*/
			
		
		int d = 31;
		int m = 12;
		int y = 1982;
		String str1 = Integer.toString(d); 
	    String str2 = Integer.toString(m);
	    String str3 = Integer.toString(y); 
	    String s5 = str1 + "/" + str2 + "/" + str3;
		System.out.println(s5);
		
		
		
		
		
	}

}

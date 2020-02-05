
import java.util.*;


public class Fase3 {
	

	public static void main(String[] args) {
		
		
		List<Character> list = new ArrayList<>(Arrays.asList('E', 'v', 'a', 'n', 'd', 'r', 'o'));
		       
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		for (char ch : list) {
			 
	            if (charCountMap.containsKey(ch)) { 
	  	             
	                charCountMap.put(ch, charCountMap.get(ch) + 1); 
	            } 
	            else { 
	  	                
	                charCountMap.put(ch, 1); 
	            } 
	        } 
	  	        
	        for (Map.Entry entry : charCountMap.entrySet()) { 
	            System.out.println(entry.getKey() + " " + entry.getValue()); 
	        } 
	    } 			
		       
			
}



 

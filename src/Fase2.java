
import java.util.*;

public class Fase2 {

	public static void main(String[] args) {
		
		/*List<Character> list = new ArrayList<>(Arrays.asList('E', 'v', 'a', 'n', 'd', 'r', 'o'));*/
		
		List<Character> list = new ArrayList<>();
		list.add('E');
		list.add('v');
		list.add('a');
		list.add('n');
		list.add('d');
		list.add('r');
		list.add('o');
		
		          
		
		for (char ch : list) {
					
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println(ch + " és una VOCAL");	         
			} 
			
			else if(ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9') {
	            System.out.println("Els noms de persones no contenen nombres!");
			} 
			
			else
	            System.out.println(ch + " és una CONSONANT");
			
		        
			}
		}

	}


 

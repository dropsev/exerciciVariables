import java.util.*;

public class Fase4 {

	public static void main(String[] args) {
		
		List<Character> listName = new ArrayList<>(Arrays.asList('E', 'v', 'a', 'n', 'd', 'r', 'o'));
		
		List<Character> listSurname = new ArrayList<>(Arrays.asList('P', 'e', 'r', 'e', 'i', 'r', 'a'));
		
		List<Character> listEmpty = new ArrayList<>(Arrays.asList(' '));
		
        listName.addAll(listEmpty);
        listName.addAll(listSurname);
		
        System.out.println(listName);
        
	}

}

import java.util.HashMap;

// Given a string, write a function to check if its is a permutation of a palindrome. 
public class PalidromePermutation {

	public static void main(String[] args) {
		
	}
	
	//check if the lenght of the string is even/odd and use a flag
	public static boolean checkPalidrome(String S) {
		boolean oddflag = false;
		HashMap<Character, Integer> map = frequencyTable(S);
		
		for(Character c: map.keySet()) {
			
			if(map.get(c)%2 != 0 )
				oddflag  = true;
			
		}		
		
		if(S.length() %2 == 0) {
			if(!oddflag)
				return true;
		}
		return false;	
	}
	
	// Generating a character frequency table
	public static HashMap<Character, Integer> frequencyTable(String S) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < S.length(); i++) {
			if(map.containsKey(S.charAt(i)))
				map.put(S.charAt(i), map.get(S.charAt(i))+1);
			else 
				map.put(S.charAt(i), 1);
		}
		
		return map;
	}
	
	
	
	

}

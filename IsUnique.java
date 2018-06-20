import java.util.Arrays;

/* Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additions data structures
cannot use additional data structures? */

public class IsUnique {

	public static void main(String[] args) {
		
		String string = "Manoj";
		System.out.println(arrayApproach(string));
		
	}
	
	// valid for string that contains only Ascii values	
	// return false if the string contains duplicates
	// return true if the string has all unique character
	public static boolean arrayApproach(String s) {
		boolean[] asciiArray = new boolean[128];
		Arrays.fill(asciiArray, false);
		
		for (int i = 0; i < s.length(); i++) {
			
			if(asciiArray[s.charAt(i)] == true)
				return false;
			else 
				asciiArray[s.charAt(i)] = true;
			
		}
		
		return true;
	}

}

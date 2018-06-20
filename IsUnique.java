/* Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additions data structures
cannot use additional data structures? */

import java.util.Arrays;

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
	
	// valid for string with a-z or A-Z
	// Use a checker to store ascii value of character 
	// by bit manipulation - Intereting Approach
	public static boolean logicalApproach(String s) {
		
		int checker = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			
			if((checker & (1<<index)) > 0)
				return false;
			
			checker = checker | (1<<index);
			
		}
		
		return true;
 
	}

}

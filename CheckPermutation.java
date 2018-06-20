/*Check Permutation: Given two strings, write a method to decide if one is a permutation of the other*/
import java.util.Arrays;
import java.util.Iterator;

public class CheckPermutation {

	public static void main(String[] args) {
		 String textOne = "Manoj";
		 String textTwo = "Kumar";
		 
		 System.out.println(checkPermutation(textOne, textTwo));

	}
	
	// Sort both the Strings and check if they are equal
	public static boolean checkPermutation(String string1, String string2) {
		
		if(string1.length() != string2.length())
			return false;
		
		return sortString(string1).equals(sortString(string2));
	}
	
	// Sort string and return the sorted string
	public static String sortString(String string) {
		char[] stringArray = string.toCharArray();
		Arrays.sort(stringArray);
		return new String(stringArray);
	}
	
	
	public static boolean checkUsingArrays(String stringOne, String stringTwo) {
		
		int[] asciiArray = new int[128];
		
		// Increment the array index associated with ascii 
		for (char c : stringOne.toCharArray()) {
			asciiArray[c]++;
		}
		
		// Decrement the array index associated with ascii for second string
		for (char c : stringTwo.toCharArray()) {
			asciiArray[c]--;
		}
		
		// Traverse through the array 
		// If the index value is not equal to 0, return false
		for (int i = 0; i < asciiArray.length; i++) {
			if(asciiArray[i] != 0)
				return false;
		}
		
		return true;
		
	}

}

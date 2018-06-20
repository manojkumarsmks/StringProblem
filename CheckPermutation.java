/*Check Permutation: Given two strings, write a method to decide if one is a permutation of the other*/
import java.util.Arrays;

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

}

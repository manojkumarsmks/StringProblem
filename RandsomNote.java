// https://leetcode.com/problems/ransom-note/description/
public class RandsomNote {

	public static void main(String[] args) {
		// Testing 
		System.out.println(canConstruct("a", "b"));
	}
	
	private static boolean canConstruct(String ransomNote, String magazine) {
		int[] alphabets = new int[26];
		
		// Each array represents characters from a-z
		// Increment the values at the corresponding index
		for (int i = 0; i < magazine.length(); i++) {
			alphabets[magazine.charAt(i)-'a']++;
		}
		
		// Decrement the value in index of the randsomenote
		for (int i = 0; i < ransomNote.length(); i++) {
			// If the characters are not present in the magazine, index value will be less than 0 
			if(--(alphabets[ransomNote.charAt(i)-'a']) < 0)
				return false;
		}
		
		return true;
	}

}

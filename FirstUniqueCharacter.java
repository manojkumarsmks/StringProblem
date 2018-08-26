// https://leetcode.com/problems/first-unique-character-in-a-string/description/
public class FirstUniqueCharacter {

	public static void main(String[] args) {
		String s = "aadadaad";
		FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
		System.out.println(firstUniqueCharacter.uniqueChar(s));

	}
	
	// Brute Force
	public int uniqueCharacter(String s) {
			for (int i = 0; i < s.length()-1; i++) {
				boolean uniqueFlag = true;
				for (int j = 0; j < s.length(); j++) {	
					if((s.charAt(i) == s.charAt(j)) &&(j != i)) {
						uniqueFlag = false;
						break;
					}
				}
				if(uniqueFlag)
					return i;
			}
		return -1;
	}
	
	// Get freqency of each character
	// Get the chracter that has frequency 1
	
	
	public int uniqueChar(String s) {
		
		int[] freq = new int[26];
		
		for (char c : s.toCharArray()) {
			freq[c-'a']++;
		}
		
		for (int i = 0; i < s.length(); i++) {
			if(freq[s.charAt(i)-'a'] == 1)
				return i;
		}
		
		return -1;
	}

}

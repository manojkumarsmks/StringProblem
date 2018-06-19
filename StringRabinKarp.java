// Rabin Karp algorithm and Hashing
public class StringRabinKarp {
	
	private int primeNumber = 3;
	int oldHash = 0, patternHash = 0;
	String string, pattern;
	
	// Constructor
	public StringRabinKarp(String string, String pattern) {
		this.string = string;
		this.pattern = pattern;
	}
	
	
	// Basics algorithm 
	public int patternMatching() {
		oldHash = Hashing(string, 3);
		patternHash =  Hashing(pattern, pattern.length());
		
		if(oldHash == patternHash) {
			System.out.println(checkEquals(string, pattern, 0));
		}
		
		for (int i = 1; i <= string.length()-3; i++) {
			oldHash = recalcuateHashing(string, oldHash, i, 3);
		
			if(oldHash == patternHash) {
				if(checkEquals(string, pattern, i))
					return i;
			}
		}
		
		return -1;
	}

	// Calculate the first Hashing
	public int Hashing(String S, int m) {
		int result = 0;
		S = S.substring(0, m);
		for (int i = 0; i < S.length(); i++) {	
			result += (S.charAt(i)*Math.pow(primeNumber, i));
		}
		return result;
	}
	
	// Recalculate the hashing
	public int recalcuateHashing(String S, int oldHash, int start, int m) {
		
		oldHash = (oldHash - S.charAt(start-1))/primeNumber;
		oldHash += S.charAt(start+m-1) * Math.pow(primeNumber, m-1);
		
		return oldHash;
		
	}
	
	// Check if the pattern and string with the length of pattern
	public boolean checkEquals(String string, String pattern, int start) {
		char[] stringArray = string.substring(start, start+pattern.length()).toCharArray();
		char[] patternArray = pattern.toCharArray();
		
		// Check the character of string and pattern
		for (int i = start; i < pattern.length(); i++) {
			if(stringArray[i] != patternArray[i])
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		
		String string = "ManojKumar ";
		String pattern = "Kum";
		
		StringRabinKarp stringRabinKarp = new StringRabinKarp(string, pattern);
		
		System.out.println(stringRabinKarp.patternMatching());
		
		
	}
}

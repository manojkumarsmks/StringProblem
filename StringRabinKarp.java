// Rabin Karp algorithm and Hashing
public class StringRabinKarp {
	
	private int primeNumber = 3;
	
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
		
		String subString = S.substring(start, start+m);
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
		
		int oldHash = 0, patternHash = 0;
		String string = "ABCDEF";
		String pattern = "CDE";
		
		StringRabinKarp stringRabinKarp = new StringRabinKarp();
		
		oldHash = stringRabinKarp.Hashing(string, 3);
		patternHash =  stringRabinKarp.Hashing(pattern, pattern.length());
		
		if(oldHash == patternHash) {
			System.out.println(stringRabinKarp.checkEquals(string, pattern, 0));
		}
		
		for (int i = 1; i <= string.length()-3; i++) {
			oldHash = stringRabinKarp.recalcuateHashing(string, oldHash, i, 3);
		
			if(oldHash == patternHash) {
				if(stringRabinKarp.checkEquals(string, pattern, i))
					System.out.println("Pattern starts at "+i);
				else 
					System.out.println("Pattern not found in the String");
					
					
			}
		}
	}
}

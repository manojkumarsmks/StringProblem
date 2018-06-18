// Check weather a pattern P is a substring in another string R
public class StringMatching {

	public static void main(String[] args) {
		String T = "AAAAAAAAAAAAAAAAAA";
		String P = "AAAAA";
		
		example(P.toCharArray(), T.toCharArray());
	}
	
	// Brute Force Method
	public static boolean bruteForcePatternCheck(char[] P, char[] T) {
		
		String p = new String(P);
		boolean flag = false;
		// Loop to consider the substring in T of length P
		// Slide this window till the end
		for (int i = 0; i <= T.length-P.length; i++) {
			String t = new String(T, i, P.length);
			
			// check if the T substring and p are equal
			if(t.equals(p)) {
				System.out.println("Pattern found at index "+i);
				flag = true;
			}
		}
		return flag;
	}
	// Brute Force method, using characters only
	public static void bruteForce(char[] P , char[] T) {
		
		// Sliding window of size P
		for (int i = 0; i <= (T.length-P.length); i++) {
			int pIndex = 0;
			boolean flag = false;
			while(pIndex != P.length) {
				if(T[i+pIndex] != P[pIndex]) {
					break;
				}
				// Keep track of found
				if(pIndex == P.length-1)
					flag = true;
				
				pIndex++;
			}
			
			if(flag)
				System.out.println("Patern was found at "+i+ " index");
			
		}		
	}
}

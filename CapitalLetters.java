// https://leetcode.com/problems/detect-capital/description/

public class CapitalLetters {

	public static void main(String[] args) {
		System.out.println(checkCorrectCapitals("ggg"));
	}
	
	private static boolean checkCorrectCapitals(String S) {
		int capitalCount = 0;
		if(S.length() == 1)
            return true;
		
		for(int i=0; i<S.length(); i++) {
			if(Character.isUpperCase(S.charAt(i)))
				capitalCount++;
		}
		
		if(capitalCount == S.length()) {
			return true;
		}
		else if(capitalCount == 1) {
			return Character.isAlphabetic(S.charAt(0));
		}
		
		return false;
	}
}

// https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome {

	public static void main(String[] args) {
		String str = ".,";
		
		System.out.println(isPalindrome(str));
	}
	
	private static boolean isPalindrome(String str) {
		if(str.length()<2)
			return true;
		
		str = str.replaceAll("[^A-Za-z0-9]", "");
		str = str.toLowerCase();
		
		int startPointer = 0;
		int endPointer = str.length()-1;
		
		while(startPointer < endPointer) {
			
			if(!Character.isLetterOrDigit(str.charAt(startPointer)))
				startPointer++;
			if(!Character.isLetterOrDigit(str.charAt(endPointer)))
				endPointer--;
			
			if(str.charAt(startPointer) != str.charAt(endPointer)) {
				System.out.println("Start "+startPointer + " End "+endPointer);
				System.out.println("Character "+str.charAt(startPointer)+ "  "+str.charAt(endPointer));
				return false;
			}
			
			startPointer++;
			endPointer--;
		}
		
		return true;
	}

}

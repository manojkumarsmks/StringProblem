// There are three types of edits that can be performed on string: insert a character, 
// remove a character, or replace a character

public class OneEditAway {

	public static void main(String[] args) {
		
		String strOne = "pale";
		String strTwo = "bale";
		
		System.out.println(checkForInsert(strOne, strTwo));
		
		
	}
	
	public static boolean checkForInsert(String strOne, String strTwo) {
		
		int numberOfDifference = 0;
		int counterOne = 0, counterTwo = 0;
		char firstChar = 0, secondChar = 0;
		
		while(true) {
			if(strOne.length() >= strTwo.length())
				if(counterOne == strOne.length()-1)
					break;
			if(strTwo.length() > strOne.length())
				if(counterTwo == strTwo.length()-1)
					break;
			
			if(counterOne <= strOne.length()-1) {
				firstChar = strOne.charAt(counterOne);
				counterOne++;
			}
			if(counterTwo<= strTwo.length()-1) {
				secondChar = strTwo.charAt(counterTwo);
				counterTwo++;
			}
			
			if(numberOfDifference <= 1) {
				if(firstChar != secondChar)
					numberOfDifference++;
			}else {
				return false;
			}
		}
		
		if(numberOfDifference <=1)
			return true;
		else
			return false;
		
	}
	
	public void replace(String strOne, String strTwo) {
		
	}
	
}

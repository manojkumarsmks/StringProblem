// https://leetcode.com/problems/length-of-last-word/description/
public class LastWordLength {

	public static void main(String[] args) {
		String str = "a";
		System.out.println(lastWordLength(str));
	}
	
	// Just count from the last 
	public static int lastWordLength(String str) {
		
		if(str == null)
			return 0;
		
		int lastPointer = str.length()-1;
		char[] strCharArray = str.toCharArray();
		
		while(strCharArray[lastPointer] != ' ' || strCharArray[lastPointer] != strCharArray[0]) {
			lastPointer--;
		}
		
		return str.length()-lastPointer-1;
		
	}

}

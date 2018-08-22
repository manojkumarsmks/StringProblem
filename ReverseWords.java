// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
public class ReverseWords {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		String temp = "Manoj";
		ReverseWords reverseWord = new ReverseWords();
		System.out.println(reverseWord.reverseWords(s));
	}

	public String reverseWords(String s) {
		
		String[] splitString = s.split(" ");
		
		for (int i = 0; i < splitString.length; i++) {
			
			char[] charArray = splitString[i].toCharArray();
			
			splitString[i] = reverseEachWord(charArray);
			
		}
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < splitString.length-1; i++) {
			stringBuilder.append(splitString[i]);
			stringBuilder.append(" ");
		}
		stringBuilder.append(splitString[splitString.length-1]);
		
		
		return stringBuilder.toString();
		
	}
	
	public String reverseEachWord(char[] charArray) {
		
		int start = 0; 
		int end = charArray.length-1;
		
		while(start <= end) {
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			
			start++;
			end--;
		}
		
		//System.out.println(charArray.toString());
		return new String(charArray);
	}

}

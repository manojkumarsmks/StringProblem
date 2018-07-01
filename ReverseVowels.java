import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/reverse-vowels-of-a-string/description/

public class ReverseVowels {

	public static void main(String[] args) {
		String str = ".,";
		
		System.out.println(reverseVowels(str));

	}

	private static String reverseVowels(String str) {
		Set<Character> vowels = new HashSet<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		char[] strArray = str.toCharArray();
		
		int startPointer = 0, endPointer = str.length()-1;
		
		while(startPointer < endPointer) {
			
			if(vowels.contains(strArray[startPointer]) 
					&& vowels.contains(strArray[endPointer])) {
				char temp = strArray[startPointer];
				strArray[startPointer] = strArray[endPointer];
				strArray[endPointer] = temp;
				startPointer++;
				endPointer--; 
			}
			else if(vowels.contains(strArray[startPointer]) 
					&& !(vowels.contains(strArray[endPointer]))) {
				endPointer--;
			}
			else if(!(vowels.contains(strArray[startPointer])) 
					&& vowels.contains(strArray[endPointer])) {
				startPointer++;
			}
			else {
				startPointer++;
				endPointer--;
			}
		}
		
		return new String(strArray);
	}
}

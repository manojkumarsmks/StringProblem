//
public class ReverseString {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		// Testing
		System.out.println(reverse(s));
	}


	// https://leetcode.com/problems/reverse-string/description/
	private static String reverse(String s) {
		char[] charArray = s.toCharArray();
		int start = 0;
		int end = charArray.length - 1;

		// Swap the char till the index hits the middle
		while (start < end) {
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;

			start++;
			end--;
		}

		return new String(charArray);
	}
	
}

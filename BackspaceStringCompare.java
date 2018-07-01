// https://leetcode.com/problems/backspace-string-compare/description/
import java.util.Stack;

public class BackspaceStringCompare {

	public static void main(String[] args) {
		String S = "y#fo##f";
		String T = "y#f#o##f";

		System.out.println(stringFilter(S).equals(stringFilter(T)));
	}
	
	private static String stringFilter(String str) {
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == '#' && !stack.isEmpty()) {
				stack.pop();
			}
			else if(str.charAt(i) != '#')
				stack.push(str.charAt(i));
		}
		System.out.println(String.valueOf(stack));
		return String.valueOf(stack);
	}

}

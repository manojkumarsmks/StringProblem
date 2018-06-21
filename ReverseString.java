//https://leetcode.com/problems/reverse-string/description/
public class ReverseString {

	public static void main(String[] args) {
		String s = "This is Manoj Kumar";

		
	}
	/*private static String reverse(String s) {
		char[] charArray = s.toCharArray();
		
		charArray = reverse(charArray);
		
		s =new String(charArray);
		
		StringBuilder stringBuilder = new StringBuilder();
		int start=0, end = 0; 

		while(end < s.length()) {
			
			if(charArray[end] != ' ') {
				System.out.println(" Charcter are "+charArray[end]);
				end++;
			}
			else {
				System.out.println("Start "+start + " End "+end);
				System.out.println(new String(charArray, start, end));
				end++;
				start = end;
			}
		}
		
		return s;
		
	}*/
	
	private static char[] reverse(char[] sArray) {
		
		int start = 0;
		int end = sArray.length-1;
		
		while(start < end) {
			char temp = sArray[start];
			sArray[start] = sArray[end];
			sArray[end] = temp;
			start++;
			end--;
		}
		
		return sArray;
	}
	
}

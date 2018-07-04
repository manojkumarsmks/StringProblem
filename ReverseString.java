//https://leetcode.com/problems/reverse-string/description/
public class ReverseString {

	public static void main(String[] args) {
		String s = "the sky is blue";
		System.out.println(reverse(s));
		
	}
	private static String reverse(String s) { 
		int startPointer = 0, endPointer = s.length()-1;
		char[] sArray = s.toCharArray();
		while(startPointer < endPointer) {
			char temp = sArray[startPointer];
			sArray[startPointer] = sArray[endPointer];
			sArray[endPointer] = temp;
			startPointer++;
			endPointer--;
 		}
		startPointer = 0; endPointer = 0;
		
		while(true) {
			
			if(sArray[endPointer] == ' ' || endPointer == sArray.length-1) {
				int tempEnd = endPointer;
				if(endPointer != sArray.length-1)
					endPointer--;
				
				while(startPointer < endPointer) {
					char temp = sArray[startPointer];
					sArray[startPointer] = sArray[endPointer];
					sArray[endPointer] = temp;
					startPointer++;
					endPointer--;
		 		}
				startPointer = tempEnd+1;
				endPointer = tempEnd;
			}

			if(endPointer == sArray.length-1)
				break;
			endPointer++;
			
		}
		return new String(sArray);
	}
	
}

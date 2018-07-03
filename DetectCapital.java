// https://leetcode.com/problems/detect-capital/description/
public class DetectCapital {

	public static void main(String[] args) {
		System.out.println(detectCaps("USA"));
	}
	
	private static boolean detectCaps(String str) {
		int capsCount = allCaps(str);
		
		if(capsCount == str.length() || capsCount == 0)
			return true;
		else if(capsCount == 1) {
			for (int i = 1; i < str.length(); i++) {
				if((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z'))
					return false;
			}
			return true;
		}
		
		return false;
		
		
		
	}
	
	private static int allCaps(String str) {
		int capsCount = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z'))
				capsCount++;
		}
		System.out.println(capsCount);
		return capsCount;
	}

}

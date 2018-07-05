// https://leetcode.com/problems/longest-common-prefix/description/
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] listOfString = {""};
		//listOfString.add("fl");
		System.out.println(longestCommonPrefix(listOfString));

	}
	
	public static String longestCommonPrefix(String[] listOfStrings) {
		if(listOfStrings.length == 0)
			return "";
		
		String shortStr = listOfStrings[0];
		// compute the shortest string
		for(String str: listOfStrings) {
			if(shortStr.length() > str.length())
				shortStr = str;
		}
		System.out.println(shortStr);
		boolean flag = false;
		int commonlength = 0;
		// check each character of shortest string with the  string in 
		// the array
		for (int i = 0; i < shortStr.length(); i++) {
			for (int j = 0; j < listOfStrings.length; j++) {
				if(shortStr.charAt(i) != listOfStrings[j].charAt(i))
					flag = true;
			}
			if(flag) {
				commonlength = i;
				break;
			}
		}
		char[] shortStrArray = shortStr.toCharArray();
		return new String();
	}

}

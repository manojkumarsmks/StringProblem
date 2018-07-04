// https://leetcode.com/problems/buddy-strings/description/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BuddyString {

	public static void main(String[] args) {
		String A = "aaaaaaabc";
		String B = "aaaaaaacb";
		
		System.out.println(buddyStrings(A, B));
	}
	
	public static boolean buddyStrings(String A, String B) {
		if(A.length() != B.length())
			return false;
		if(A.equals(B)) {
			// solution from https://leetcode.com/problems/buddy-strings/discuss/141780/Easy-Understood
			Set<Character> s = new HashSet<Character>();
			for (char c : A.toCharArray()) 
				s.add(c);
			return s.size() < A.length();
		}

		char[] aCharArray = A.toCharArray();
        char[] bCharArray = B.toCharArray();
        List<Integer> swapValues = new ArrayList<Integer>();
        
        for (int i = 0; i < A.length(); i++) {
        	  if(aCharArray[i] != bCharArray[i])
        		  swapValues.add(i);
		}
        if(swapValues.size() != 2)
        	return false;
        
        char temp = aCharArray[swapValues.get(0)];
        aCharArray[swapValues.get(0)] = aCharArray[swapValues.get(1)];
        aCharArray[swapValues.get(1)] = temp;
        
        return new String(aCharArray).equals(new String(bCharArray)); 
    }
}

import java.awt.Container;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/uncommon-words-from-two-sentences/description/
public class UncommonWords {

	public static void main(String[] args) {
		String A = "this apple is sweet";
		String B = "this apple is sour";
		
		uncommonFromSentences(A,B);
	}

	public static String[] uncommonFromSentences(String A, String B) {
		String C = A +" " + B;
		String[] aWords = C.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String string : aWords) {
			if(map.containsKey(string)) {
				map.put(string, map.get(string)+1);
			}
			else { 
				map.put(string, 1);
			}
		}
		Set<String> set = map.keySet();
		List<String> result = new ArrayList<>();
		for (String string : set) {
			
			if(map.get(string) == 1)
				result.add(string);
		}
		String[] str = new String[result.size()];
		
		return result.toArray(str);
	}
}

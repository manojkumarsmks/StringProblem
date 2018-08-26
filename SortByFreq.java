// https://leetcode.com/problems/sort-characters-by-frequency/description/
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortByFreq {

	public static void main(String[] args) {
		SortByFreq sort = new SortByFreq();
		System.out.println(sort.byFrequency("tree"));
		
	}
	
	public String byFrequency(String s) {
		Map<Character, Integer> map = new HashMap<>();
		StringBuilder string = new StringBuilder();
		for(int i =0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			else 
				map.put(s.charAt(i), 1);
		}
		map = sortByValue(map);
		
		Set<Character> set = map.keySet();
		
		for(Character c:map.keySet()) {
			
			for(int i = 0; i <map.get(c); i++) {
				string.append(c);
			}
			
		}
		
		return string.toString();
		
	}
	
	public Map<Character, Integer> sortByValue(Map<Character, Integer> unsorted) {
		
		List<Map.Entry<Character, Integer>> list = new LinkedList<>(unsorted.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
			
		});
		Map<Character, Integer> sortedMap = new LinkedHashMap<>();
		for(Map.Entry<Character, Integer> entry:list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		
		return sortedMap;
		
	}

}

// Trie Implementation 
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StringMatching {
	private  TrieNode root;
	
	public void insert(String str) {
		TrieNode current = root;
		
		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			Set<Character> charsCurrent = current.children.keySet();
			
			if(!charsCurrent.contains(ch)) {
				current.children.put(ch, new TrieNode());
			}
			current = current.children.get(ch);
		}
		current.isWord = true;
	}
	
	// https://leetcode.com/problems/longest-common-prefix/description/

	public int LongestCommonPrefix() {
		TrieNode current = root;
		int counter = 0;
		
		while(true) {
			Set <Character> keys = current.children.keySet();
			if(keys.size() != 1 )
				break;
			else {
				counter++;
				current = current.children.get(keys.iterator().next());
			}
		}
		
		return counter;

		
	}
	
	public boolean search(String word) {
		TrieNode current = root;
		
		for (int i = 0; i < word.length(); i++) {
			
			char ch = word.charAt(i);
			Set<Character> charsCurrent = current.children.keySet();
			if(charsCurrent.contains(ch)) {
				current = current.children.get(ch);
			}
			else {
				return false;
			}
		}
		
		return current.isWord;
	}

	public static void main(String[] args) {
		StringMatching stringMatching= new StringMatching();
		stringMatching.root = new TrieNode();
		
		String[] strs =  {"dog","racecar","car"};
		for(String s:strs) {
			stringMatching.insert(s);
		}
		System.out.println(strs[0].substring(0, stringMatching.LongestCommonPrefix()));
	}
}

class TrieNode {
	boolean isWord;
	Map<Character, TrieNode> children;
	
	public TrieNode() {
		children = new HashMap<>();
		isWord = false;
	}
}

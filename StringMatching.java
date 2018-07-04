// Trie Implementation 
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringMatching {
	private TrieNode root;
	
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
		stringMatching.insert("ManojKumar");
		stringMatching.insert("Kumar");
		
		System.out.println(stringMatching.search("ManojKu"));
		System.out.println(stringMatching.search("Divya"));
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

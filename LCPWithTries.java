//https://leetcode.com/problems/longest-common-prefix/description/
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LCPWithTries {

	private Trie root;
	public static void main(String[] args) {
		String[] listOfString = {"aa", "a"};
		LCPWithTries lcptWithTries = new LCPWithTries();
		lcptWithTries.root = new Trie();
		
		 if(listOfString == null || listOfString.length == 0 )
	            return;
		
		int shortestStringLength = listOfString[0].length();
		for (int i = 0; i < listOfString.length; i++) {
			
			if(shortestStringLength > listOfString[i].length())
				shortestStringLength = listOfString[i].length();
			
			lcptWithTries.Insert(listOfString[i]);
		}
		
		System.out.println(lcptWithTries.lcp(shortestStringLength));
	}
	
	public void Insert(String str) {
		Trie current = root;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			Set<Character> currentChars =current.children.keySet();
			if(!currentChars.contains(ch)){
				current.children.put(ch, new Trie());
			}
			current = current.children.get(ch);
		}
	}
	
	public String lcp(int shortestStringLength) {
		Trie current = root;
		StringBuilder stringBuilder = new StringBuilder();
		while(true) {
			Set<Character> currentChars = current.children.keySet();
			if(stringBuilder.length() == shortestStringLength)
				return stringBuilder.toString();

			if(currentChars.size() == 1) {
				char temp = currentChars.iterator().next();
				stringBuilder.append(temp);
				current = current.children.get(temp);
			}
			else
				return stringBuilder.toString();
				
		}		
	}
	
}
class Trie {
	boolean isWord;
	Map<Character, Trie> children;
	
	public Trie() {
		children = new HashMap<>();
		isWord = false;
	}
}



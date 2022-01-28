package DailyChallengeQuestions;

/*
211. Design Add and Search Words Data Structure

Link: https://leetcode.com/problems/design-add-and-search-words-data-structure/

Design a data structure that supports adding new words and finding if a string matches any previously added string.
Implement the WordDictionary class:
a)WordDictionary() Initializes the object.
b)void addWord(word) Adds word to the data structure, it can be matched later.
c)bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise. word may contain dots '.' where dots can be matched with any letter.
 

Example:

Input
["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
[[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]

Output
[null,null,null,null,false,true,true,true]

Explanation
WordDictionary wordDictionary = new WordDictionary();
wordDictionary.addWord("bad");
wordDictionary.addWord("dad");
wordDictionary.addWord("mad");
wordDictionary.search("pad"); // return False
wordDictionary.search("bad"); // return True
wordDictionary.search(".ad"); // return True
wordDictionary.search("b.."); // return True
 */

import java.util.*;

public class DesignAddAndSearchWordsDataStructure {
	class WordDictionary {
	    
	    HashMap<Integer,ArrayList<String>> map;

	    public WordDictionary() {
	        map = new HashMap<>();
	    }
	    
	    public void addWord(String word) {
	        int n = word.length();
	        if(map.containsKey(n)){
	            map.get(n).add(word);
	        }
	        else{
	            map.put(n,new ArrayList<String>());
	            map.get(n).add(word);
	        }
	    }
	    
	    public boolean search(String word) {
	        int n = word.length();
	        if(!map.containsKey(n))
	            return false;
	        for(String str : map.get(n)){
	            if(check(str,word,n))return true;
	        }
	        return false;
	    }
	    
	    public boolean check(String str1, String str2, int n){
	        for(int i=0; i<n; i++){
	            if(str2.charAt(i) == '.')
	                continue;
	            if(str1.charAt(i) != str2.charAt(i))
	                return false;
	        }
	        return true;
	    }
	}
}

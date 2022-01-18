package DailyChallengeQuestions;

import java.util.HashMap;
import java.util.HashSet;

/*
290. Word Pattern

Link: https://leetcode.com/problems/word-pattern/

Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 */

public class WordPattern {
	
	public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        for(String abc : arr)
            System.out.println(abc);
        if(arr.length != pattern.length())
            return false;
        HashSet<String> used = new HashSet<>();
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!(map.get(pattern.charAt(i)).equals(arr[i])))
                    return false;
            }
            else{
                if(used.contains(arr[i]))
                    return false;
                map.put(pattern.charAt(i),arr[i]);
                used.add(arr[i]);
            }
        }
        return true;
    }

}

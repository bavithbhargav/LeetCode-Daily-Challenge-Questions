package DailyChallengeQuestions;

/*
520. Detect Capital

Link: https://leetcode.com/problems/detect-capital/

We define the usage of capitals in a word to be right when one of the following cases holds:
All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

Example 1:
Input: word = "USA"
Output: true

Example 2:
Input: word = "FlaG"
Output: false
 */

public class DetectCapital {
	class Solution {
	    public boolean detectCapitalUse(String word) {
	        int n = word.length();
	        String dup = word.toLowerCase();
	        int cap = 0;
	        for(int i=0; i<n; i++){
	            if(word.charAt(i) != dup.charAt(i))
	                cap++;
	        }
	        if(cap == 0)
	            return true;
	        if(cap == 1 && word.charAt(0) != dup.charAt(0))
	            return true;
	        if(cap == n)
	            return true;
	        return false;
	    }
	}
}

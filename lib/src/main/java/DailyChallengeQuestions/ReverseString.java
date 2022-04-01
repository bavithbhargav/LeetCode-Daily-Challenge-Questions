package DailyChallengeQuestions;

/*
344. Reverse String

Link: https://leetcode.com/problems/reverse-string/

Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */

public class ReverseString {
	
	class Solution {
	    public void reverseString(char[] s) {
	        int low = 0;
	        int high = s.length-1;
	        while(low <= high){
	            char temp = s[low];
	            s[low] = s[high];
	            s[high] = temp;
	            low++;
	            high--;
	        }
	        // Stack<Character> stack = new Stack<>();
	        // int n = s.length;
	        // for(int i=0; i<n; i++)
	        //     stack.push(s[i]);
	        // for(int i=0; i<n; i++)
	        //     s[i] = stack.pop();
	    }
	}

}

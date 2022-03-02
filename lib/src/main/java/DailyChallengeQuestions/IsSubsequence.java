package DailyChallengeQuestions;
/*
392. Is Subsequence

Link: https://leetcode.com/problems/is-subsequence/

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
 */
public class IsSubsequence {
	class Solution {
	    int[][] dp;
	    public boolean isSubsequence(String s, String t) {
	        int n = s.length();
	        int m = t.length();
	        dp = new int[n+1][m+1];
	        for(int i=0; i<=n; i++){
	            for(int j=0; j<=m; j++)
	                dp[i][j] = -1;
	        }
	        int a = helper(s,t,n,m);    
	        if(a == n)
	            return true;
	        else
	            return false;
	    }
	    public int helper(String s, String t, int i, int j){
	        if(i == 0 || j == 0)
	            return 0;
	        if(dp[i][j] != -1)
	            return dp[i][j];
	        if(s.charAt(i-1) == t.charAt(j-1))
	            return dp[i][j] = 1+helper(s,t,i-1,j-1);
	        else
	            return dp[i][j] = Math.max(helper(s,t,i-1,j),helper(s,t,i,j-1));
	    }
	}
}

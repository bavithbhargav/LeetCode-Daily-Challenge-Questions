package DailyChallengeQuestions;
/*
338. Counting Bits

Link: https://leetcode.com/problems/counting-bits/

Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

Example 1:
Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10

Example 2:
Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
 */
public class CountingBits {
	class Solution {
	    public int[] countBits(int n) {
	        int[] ans = new int[n+1];
	        for(int i=1; i<ans.length; i++)
	            ans[i] = recur(i);
	        return ans;
	    }
	    public int recur(int n){
	        if(n == 0)
	            return 0;
	        if(n == 1)
	            return 1;
	        if(n%2 == 0)
	            return recur(n/2);
	        else
	            return 1+recur(n/2);
	    }
	}
}

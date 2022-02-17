package DailyChallengeQuestions;
/*
39. Combination Sum

Link: https://leetcode.com/problems/combination-sum/

Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.
It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

Example 1:
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.

Example 2:
Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]

Example 3:
Input: candidates = [2], target = 1
Output: []
 */
import java.util.*;
public class CombinationSum {
	class Solution {
	    public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<List<Integer>> ans = new ArrayList<List<Integer>>();
	        helper(candidates,target,0,new ArrayList<Integer>(),ans);
	        return ans;
	    }
	    public void helper(int[] candidates, int target, int i, ArrayList<Integer> curr, List<List<Integer>> ans){
	        if(i == candidates.length){
	            if(target ==  0){
	                ans.add(new ArrayList<Integer>(curr));
	            }
	            return;
	        }
	        if(target==0){
	            ans.add(new ArrayList<Integer>(curr));
	            return;
	        }
	        if(candidates[i] > target){
	            helper(candidates,target,i+1,curr,ans);
	        }
	        else{
	            curr.add(candidates[i]);
	            helper(candidates,target-candidates[i],i,curr,ans);
	            curr.remove(curr.size()-1);
	            helper(candidates,target,i+1,curr,ans);
	        }
	    }
	}
}

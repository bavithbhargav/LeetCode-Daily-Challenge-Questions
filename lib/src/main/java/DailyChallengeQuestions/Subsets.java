package DailyChallengeQuestions;
/*
78. Subsets

Link: https://leetcode.com/problems/subsets/

Given an integer array nums of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Example 2:
Input: nums = [0]
Output: [[],[0]]
 */
import java.util.*;
public class Subsets {
	class Solution {
	    public List<List<Integer>> subsets(int[] nums) {
	        List<List<Integer>> ans = new ArrayList<List<Integer>>();
	        helper(nums,0,new ArrayList<Integer>(), ans);
	        return ans;
	    }
	    public void helper(int[] nums, int i, ArrayList<Integer> arr, List<List<Integer>> ans){
	        if(i == nums.length){
	            ans.add(new ArrayList<>(arr));
	            return;
	        }
	        arr.add(nums[i]);
	        helper(nums,i+1,arr,ans);
	        arr.remove(arr.size()-1);
	        helper(nums,i+1,arr,ans);
	    }
	}
}

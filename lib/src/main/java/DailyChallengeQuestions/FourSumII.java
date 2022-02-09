package DailyChallengeQuestions;

import java.util.HashMap;

/*
454. 4Sum II

Link: https://leetcode.com/problems/4sum-ii/

Given four integer arrays nums1, nums2, nums3, and nums4 all of length n, return the number of tuples (i, j, k, l) such that:
a)0 <= i, j, k, l < n
b)nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
 
Example 1:
Input: nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
Output: 2
Explanation:
The two tuples are:
1. (0, 0, 0, 1) -> nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1) + 2 = 0
2. (1, 1, 0, 0) -> nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1) + 0 = 0

Example 2:
Input: nums1 = [0], nums2 = [0], nums3 = [0], nums4 = [0]
Output: 1
 */

public class FourSumII {
	class Solution {
	    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
	        HashMap<Integer,Integer> map = new HashMap<>();
	        for(int i=0; i<nums1.length; i++){
	            for(int j=0; j<nums2.length; j++){
	                if(map.containsKey(nums1[i]+nums2[j]))
	                    map.put(nums1[i]+nums2[j],map.get(nums1[i]+nums2[j])+1);
	                else
	                    map.put(nums1[i]+nums2[j],1);
	            }
	        }
	        
	        int ans = 0;
	        
	        for(int i=0; i<nums3.length; i++){
	            for(int j=0; j<nums4.length; j++){
	                if(map.containsKey(-(nums3[i]+nums4[j])))
	                    ans += map.get(-(nums3[i]+nums4[j]));
	            }
	        }
	        
	        return ans;
	    }
	}
}

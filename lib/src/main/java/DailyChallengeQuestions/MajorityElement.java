package DailyChallengeQuestions;

/*
169. Majority Element

Link: https://leetcode.com/problems/majority-element/

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */

import java.util.*;

public class MajorityElement {
	class Solution {
	    private Map<Integer, Integer> countNums(int[] nums) {
	        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
	        for (int num : nums) {
	            if (!counts.containsKey(num)) {
	                counts.put(num, 1);
	            }
	            else {
	                counts.put(num, counts.get(num)+1);
	            }
	        }
	        return counts;
	    }

	    public int majorityElement(int[] nums) {
	        Map<Integer, Integer> counts = countNums(nums);

	        Map.Entry<Integer, Integer> majorityEntry = null;
	        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
	            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
	                majorityEntry = entry;
	            }
	        }

	        return majorityEntry.getKey();
	    }
	}
}

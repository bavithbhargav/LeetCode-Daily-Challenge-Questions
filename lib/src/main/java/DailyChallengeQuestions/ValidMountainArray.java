package DailyChallengeQuestions;

/*
941. Valid Mountain Array

Link: https://leetcode.com/problems/valid-mountain-array/

Given an array of integers arr, return true if and only if it is a valid mountain array.
Recall that arr is a mountain array if and only if:
a)arr.length >= 3
b)There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

Example 1:
Input: arr = [2,1]
Output: false

Example 2:
Input: arr = [3,5,5]
Output: false

Example 3:
Input: arr = [0,3,2,1]
Output: true
 */

public class ValidMountainArray {
	class Solution {
	    public boolean validMountainArray(int[] A) {
	        int N = A.length;
	        int i = 0;

	        // walk up
	        while (i+1 < N && A[i] < A[i+1])
	            i++;

	        // peak can't be first or last
	        if (i == 0 || i == N-1)
	            return false;

	        // walk down
	        while (i+1 < N && A[i] > A[i+1])
	            i++;

	        return i == N-1;
	    }
	}
}

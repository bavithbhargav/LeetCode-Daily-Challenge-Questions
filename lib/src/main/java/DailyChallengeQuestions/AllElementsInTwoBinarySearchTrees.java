package DailyChallengeQuestions;

/*
1305. All Elements in Two Binary Search Trees

Link: https://leetcode.com/problems/all-elements-in-two-binary-search-trees/

Given two binary search trees root1 and root2, return a list containing all the integers from both trees sorted in ascending order.

Example 1:
Input: root1 = [2,1,4], root2 = [1,0,3]
Output: [0,1,1,2,3,4]

Example 2:
Input: root1 = [1,null,8], root2 = [8,1]
Output: [1,1,8,8]
 */

import java.util.*;

public class AllElementsInTwoBinarySearchTrees {

	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode() {}
	     TreeNode(int val) { this.val = val; }
	     TreeNode(int val, TreeNode left, TreeNode right) {
	         this.val = val;
	         this.left = left;
	         this.right = right;
	     }
	 }
	class Solution {
	    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
	        List<Integer> ans = new ArrayList<Integer>();
	        Queue<Integer> queue1 = new LinkedList<>();
	        Queue<Integer> queue2 = new LinkedList<>();
	        inorder(root1,queue1);
	        inorder(root2,queue2);
	        while(!queue1.isEmpty() && !queue2.isEmpty()){
	            if(queue1.peek() > queue2.peek())
	                ans.add(queue2.poll());
	            else if(queue1.peek() < queue2.peek())
	                ans.add(queue1.poll());
	            else{
	                ans.add(queue1.poll());
	                ans.add(queue2.poll());
	            }
	        }
	        while(!queue1.isEmpty()){
	            ans.add(queue1.poll());
	        }
	        while(!queue2.isEmpty()){
	            ans.add(queue2.poll());
	        }
	        return ans;
	    }
	    public void inorder(TreeNode root, Queue<Integer> ans){
	        if(root == null)
	            return;
	        inorder(root.left,ans);
	        ans.offer(root.val);
	        inorder(root.right,ans);
	    }
	}
}

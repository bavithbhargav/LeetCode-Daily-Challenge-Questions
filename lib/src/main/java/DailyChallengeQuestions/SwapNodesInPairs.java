package DailyChallengeQuestions;
/*
24. Swap Nodes in Pairs

Link: https://leetcode.com/problems/swap-nodes-in-pairs/

Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

Example 1:
Input: head = [1,2,3,4]
Output: [2,1,4,3]

Example 2:
Input: head = []
Output: []

Example 3:
Input: head = [1]
Output: [1]
 */
public class SwapNodesInPairs {
	public class Solution {
	    public ListNode swapPairs(ListNode head) {
	        if ((head == null)||(head.next == null))
	            return head;
	        ListNode n = head.next;
	        head.next = swapPairs(head.next.next);
	        n.next = head;
	        return n;
	    }
	}
}

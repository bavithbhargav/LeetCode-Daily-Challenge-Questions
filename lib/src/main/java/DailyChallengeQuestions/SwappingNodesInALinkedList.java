package DailyChallengeQuestions;
/*
1721. Swapping Nodes in a Linked List

Link: https://leetcode.com/problems/swapping-nodes-in-a-linked-list/

You are given the head of a linked list, and an integer k.
Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]

Example 2:
Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]
 */
public class SwappingNodesInALinkedList {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	class Solution {
	    public ListNode swapNodes(ListNode head, int k) {
	        if(head == null)
	            return null;
	        
	        ListNode curr = head;
	        
	        for(int i=0; i<k-1; i++)
	            curr = curr.next;
	        
	        ListNode first = curr;
	        
	        ListNode slow = head;
	        ListNode fast = first;
	        
	        while(slow != null && fast.next != null){
	            slow = slow.next;
	            fast = fast.next;
	        }
	        
	        int temp = slow.val;
	        slow.val = first.val;
	        first.val = temp;
	        
	        return head;
	    }
	}
}

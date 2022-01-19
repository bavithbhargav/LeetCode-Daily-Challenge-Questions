package DailyChallengeQuestions;

/*
142. Linked List Cycle II

Link: https://leetcode.com/problems/linked-list-cycle-ii/

Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
Do not modify the linked list.

Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.

Example 2:
Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.

Example 3:
Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.
 */

public class LinkedListCycleII {
	
	public class ListNode{
		int val;
		ListNode next;
		
		public ListNode() {
			
		}
		
		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	public class Solution {
	    public ListNode detectCycle(ListNode head) {
	        if(head == null)
	            return head;
	        ListNode fast = head;
	        ListNode slow = head;
	        ListNode temp = head;
	        while(fast.next != null && fast.next.next != null){
	             slow = slow.next;
	            fast = fast.next.next;
	            if(slow == fast){
	                while(temp != slow){
	                    temp = temp.next;
	                    slow = slow.next;
	                }
	                return temp;
	            }
	        }
	        return null;
	    }
	}

}

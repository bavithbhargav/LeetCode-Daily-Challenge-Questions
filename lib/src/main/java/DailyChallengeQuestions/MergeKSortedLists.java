package DailyChallengeQuestions;

/*
23. Merge k Sorted Lists

Link: https://leetcode.com/problems/merge-k-sorted-lists/

You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.

Example 1:
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6

Example 2:
Input: lists = []
Output: []

Example 3:
Input: lists = [[]]
Output: []
 */

import java.util.*;

public class MergeKSortedLists {
		public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		}
		class Solution {
		    
		    class myComparator implements Comparator<ListNode>{
		        @Override
		        public int compare(ListNode node1, ListNode node2){
		            return node1.val-node2.val;
		        }
		    }
		    
		    public ListNode mergeKLists(ListNode[] lists) {
		        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(new myComparator());
		        ListNode head = null;
		        ListNode temp = null;
		        for(int i=0; i<lists.length; i++){
		            if(lists[i] == null)
		                continue;
		            queue.add(lists[i]);
		        }
		        while(!queue.isEmpty()){
		            ListNode curr = queue.poll();
		            if(head == null){ 
		                ListNode newNode = new ListNode(curr.val);
		                head = newNode;
		                temp = head;
		            }
		            else{
		                ListNode abcNode = new ListNode(curr.val);
		                temp.next = abcNode;
		                temp = temp.next;
		            }
		            if(curr.next != null)
		                queue.offer(curr.next);
		        }
		        return head;
		    }
		}
}

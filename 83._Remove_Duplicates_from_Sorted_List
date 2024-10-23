/*You can find the problem description here: https://leetcode.com/problems/remove-duplicates-from-sorted-list/*/


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
    public ListNode deleteDuplicates(ListNode head) {
    ListNode c=head;

    while(c!=null && c.next!=null){
        
if (c.val==c.next.val){
    c.next=c.next.next;
}
else{
    c=c.next;
}
    }
    
return head;

    }
}

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
    public ListNode rll(ListNode head,ListNode prev,ListNode agla){
        if(head==null) return prev;
        agla=head.next;
        head.next=prev;
        return rll(agla,head,agla);
        
    }
    public ListNode reverseList(ListNode head) {
        return rll(head,null,null);
    }
}
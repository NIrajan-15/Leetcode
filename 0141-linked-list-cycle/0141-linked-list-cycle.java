/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        if(head.next==null) return false;
        if(head==head.next.next) return true;
        ListNode jump = head.next; //jump pointer which will skip a node
        ListNode walk = head; // walk pointer which will point to next node
        while(jump!=null||walk!=null) {
            if(jump==walk) return true;
            try {
                jump = jump.next.next; // skip a node 
                walk = walk.next; // point to next node
            }
            catch(Exception e) {
                return false; // if jump or walk point to null 
            }
        }
        return false;
    }
}
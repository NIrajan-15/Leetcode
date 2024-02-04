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
    public ListNode middleNode(ListNode head) {
        int count = -1;
        ListNode node = head;

        while(node != null)
        {
            node= node.next;
            count++;

        }
        int mid = (count+1)/2;
        count = 0;
        node = head;

        while(node != null)
        {
            if(count==mid)
            {
                return node;
            }
            count++;
            node = node.next;
        }
        return node;

    }
}
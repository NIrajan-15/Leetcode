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
    public ListNode rotateRight(ListNode head, int k) {
       List<ListNode> list = new ArrayList<>();
       ListNode original = head;
      if(head==null || head.next==null || k==0) return head;
       while(original!=null)
       {
        list.add(original);
        original = original.next;
        
       }
 

       k = k % list.size();
       if(k==0) return head;

       ListNode newhead = list.get(list.size()-k);
       ListNode lastHead = list.get(list.size()-k-1);
       ListNode ans = new ListNode();
       ListNode temp = ans;
       
       while(newhead != null)
       {
        temp.next = newhead;
        newhead = newhead.next;
        temp = temp.next;
        
       }
       
       while(head != list.get(list.size()-k))
       {
        temp.next = head;
        head = head.next;
        temp = temp.next;
        
       }
       
       temp.next = null;
       return ans.next;

    }
}
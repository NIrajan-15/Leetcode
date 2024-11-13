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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        while(head!=null)
        {
            nums.add(head.val);
            head = head.next;
        }
        int[] result = new int[nums.size()];
        
        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<nums.size();i++)
        {
            while(!stk.isEmpty() && (nums.get(stk.peek())<nums.get(i)))
            {
                result[stk.pop()] = nums.get(i);
            }
            stk.push(i);
        }
        return result;
    }
}
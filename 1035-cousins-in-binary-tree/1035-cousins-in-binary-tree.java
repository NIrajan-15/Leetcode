/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null||root.val==x||root.val==y) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode current = queue.poll();
                set.add(current.val);
                if((current.left!=null&&current.right!=null))
                {
                    if((current.left.val==x&&current.right.val==y)||(current.left.val==y&&current.right.val==x)) return false;
                }

                if(current.left!=null)
                {
                    queue.offer(current.left);
                }
                if(current.right!=null)
                {
                    queue.offer(current.right);
                }
            }
            if(set.contains(x)&&set.contains(y)) return true;
            set.clear();
        }
        return false;
    }
}
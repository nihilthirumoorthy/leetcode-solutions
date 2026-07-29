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
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> list=new ArrayList<>();
        InOrder(list,root);
        return list;
    }
        void InOrder(List<Integer>list,TreeNode root){
            if(root==null){
                return;
            }
            InOrder(list,root.left);
            InOrder(list,root.right);
            list.add(root.val);
        
    }
}
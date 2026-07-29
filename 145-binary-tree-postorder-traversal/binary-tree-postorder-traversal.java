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
        PostOrder(list,root);
        return list;
    }
        void PostOrder(List<Integer>list,TreeNode root){
            if(root==null){
                return;
            }
            PostOrder(list,root.left);
            PostOrder(list,root.right);
            list.add(root.val);
        
    }
}
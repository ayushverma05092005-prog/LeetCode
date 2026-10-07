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
    public int md(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(md(root.left),md(root.right));
    }
    public int maxDepth(TreeNode root) {
        return md(root);
    }
}
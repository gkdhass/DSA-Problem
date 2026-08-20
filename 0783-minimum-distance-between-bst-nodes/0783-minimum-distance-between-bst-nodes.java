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
    long max = Long.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        minBTS(root);
        return min;
    }
    int minBTS(TreeNode root){
        if(root == null){
            return 0;
        }
        minBTS(root.left);
        if(max != Long.MIN_VALUE){
            min = Math.min(min , root.val - (int) max);
        }
        max = root.val;
        minBTS(root.right);
        return min;
    }
}
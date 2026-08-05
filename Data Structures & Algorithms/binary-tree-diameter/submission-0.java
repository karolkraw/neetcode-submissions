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
    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null) return 0;
        
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        int diameterIncluded = leftHeight + rightHeight;

        int d1 = diameterOfBinaryTree(root.left);
        int d2 = diameterOfBinaryTree(root.right);

        return diameterIncluded > Math.max(d1, d2) ? diameterIncluded : Math.max(d1, d2);


    }

    int getHeight(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }





}

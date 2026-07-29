
 

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            TreeNode left = temp.left;
            temp.left = temp.right;
            temp.right = left;

            if (temp.left != null)
                queue.offer(temp.left);
            if (temp.right != null)
                queue.offer(temp.right);
        }
        return root;
    }
}

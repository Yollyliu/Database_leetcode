public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }
    public int maxDepth(TreeNode root, int depth){
        if (root==null)return depth;
        else return Math.max(maxDepth(root.left, depth+1), maxDepth(root.right, depth+1));
    }
}

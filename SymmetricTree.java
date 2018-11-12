public class SymmetricTree {
    public static void main(String[] args) {

    }
    public Boolean isSymmetric(TreeNode root) {
        //if root is null
        if (root == null) {
            return true;
        }

        return isSymmetricInternal(root.left, root.right);
    }

    private Boolean isSymmetricInternal(TreeNode leftNode, TreeNode rightNode) {

        boolean result = false;


        if (leftNode == null && rightNode == null) {
            result = true;
        }

        if (leftNode != null && rightNode != null) {
            result = (leftNode.val == rightNode.val) && isSymmetricInternal(leftNode.left, rightNode.right)
                    && isSymmetricInternal(leftNode.right, rightNode.left);
        }

        return result;
    }

}

// * Definition for a binary tree node.
//         * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode(int x) { val = x; }
// * }
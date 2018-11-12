public class SameTree {
    public static void main(String[] args) {


    }
    public static boolean isSameTreeOne(TreeNode p, TreeNode q) {


        if(p==null && q==null) return true;
        else if(p==null || q==null) return false;
        else if(p.val==q.val){
            return (isSameTreeOne(p.left,q.left)&&isSameTreeOne(p.right,q.right));
        }
        return false;
    }

    public static boolean isSameTreeTwo(TreeNode p, TreeNode q) {
        return ((p==null || q==null) ? (p==q) : (p.val==q.val &&
                isSameTreeTwo(p.left,q.left) && isSameTreeTwo(p.right,q.right)));
    }

}
class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
  }
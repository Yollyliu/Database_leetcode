public class ConvertSortedAtoBinaryST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return mybst(0, nums.length);

        function mybst(start, end){
            if(start>=end) return null;

            let mid = Math.floor((start+end)/2);

            let cur = new TreeNode(nums[mid]);
            let left = mybst(start, mid);
            let right = mybst(mid+1, end);

            cur.left = left;
            cur.right = right;
            return cur;
        }
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }


package java;

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
class SubtreeOfAnother {

    private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null ){
            return false;
        }    
        else if(isSameAsTree(s,t)){
            return true;
        }
        else{
            return isSubtree(s.left,t) || isSubtree(s.right,t);
        }
    }
    
    public boolean isSameAsTree(TreeNode s, TreeNode t){
        if (s == null || t == null){
            return (s == null && t == null);
        }
        else if(s.val == t.val){
            return isSameAsTree(s.left, t.left) && isSameAsTree(s.right ,t.right);
        }
        else
            return false;
    }
}

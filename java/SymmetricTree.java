package java;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SymmetricTree {

    private class TNode {
      int val;
        TNode left;
        TNode right;
        TNode(int x) { val = x; }
    }

    public boolean isSymmetric(TNode root) {
        if (root == null) return true;
        
        return isSymmetric(root.left,root.right);
    }
    
    public boolean isSymmetric(TNode left,TNode right){
        if (left == null || right == null) return left == right;
        
        if (left.val != right.val) return false;
        
        return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
    }
}

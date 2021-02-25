package java;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class BinaryTreePath {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> paths = new ArrayList<>();
        
        
        if (root == null)
            return paths;
        
        
        dfs(root,"",paths);
        
        return paths;
    }
    
    private void dfs(TreeNode root,String path,List<String> paths){
        path += root.val;
        
        if (root.left == null && root.right == null){
            paths.add(path);
            return;
        }
            
        
        if (root.left!=null){
            dfs(root.left,path +"->",paths);
        }
        
        if (root.right!=null){
            dfs(root.right,path +"->",paths);
        }
        
    }
}

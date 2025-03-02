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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        return justvalue(root,targetSum);
    }
    public static boolean justvalue(TreeNode root,int target){
        if(root==null) return false;
        if(root!=null && (root.left==null && root.right==null)){
            if(root.val==target) return true;
        }

        return justvalue(root.left,target-root.val) || justvalue(root.right,target-root.val);
    }
}
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        int total=1+level(root);
       
        List<List<Integer>> ans=new ArrayList<>();
      if(root==null) return ans;
        for(int i=1;i<=total;i++){
            List<Integer> st=new ArrayList<>();
            pre1(root,i,st);
              ans.add(st);
        }
      
        return ans;
    }
    public static int level(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;

        return 1+Math.max(level(root.left),level(root.right));

    }
    public static void pre1(TreeNode root,int n,List<Integer> st){
        if(root==null) return;

        if(n==1){
            st.add(root.val);
        }
        pre1(root.left,n-1,st);
        pre1(root.right,n-1,st);
    }
}
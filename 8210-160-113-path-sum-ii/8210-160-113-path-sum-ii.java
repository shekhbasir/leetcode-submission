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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> st = new ArrayList<>();
        printall(root, targetSum, st, ans);
        return ans;
    }

    public static void printall(TreeNode root, int target, List<Integer> st, List<List<Integer>> ans) {
        if (root == null) return;

        st.add(root.val);

        if (root.left == null && root.right == null && target == root.val) {
            ans.add(new ArrayList<>(st)); // 
        }

    
        printall(root.left, target - root.val, st, ans);
        printall(root.right, target - root.val, st, ans);

        st.remove(st.size() - 1); 
    }
}

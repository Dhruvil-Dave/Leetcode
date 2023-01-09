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
    
    public void pre(TreeNode root, List<Integer> arr){
        arr.add(root.val);
        if(root.left!=null){
            pre(root.left, arr);
        }
        if(root.right!=null){
            pre(root.right, arr);
        }
    }
    
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<Integer>(100);
        if(root==null){
            return arr;
        }
        else{
            pre(root,arr);
        }
        return arr;
    }
}
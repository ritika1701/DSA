import java.util.*;
public class TreeNode {

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

    public void traverse(List<Integer> value, TreeNode root){

        if(root==null)
            return;

        traverse(value,root.left);
        value.add(root.val);
        traverse(value,root.right);
    }


    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> value = new ArrayList();
        traverse(value,root);
        return value;

    }

    //https://leetcode.com/problems/binary-tree-inorder-traversal/

}
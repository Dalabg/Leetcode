package Coding_Caprice.bintree;

import Coding_Caprice.bintree.gettree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<>();
        List<Integer>res = new ArrayList<>();
        if(root==null){
            return res;
        }
        nodes.push(root);
        while(!nodes.isEmpty()){
            TreeNode temp = nodes.pop();
            res.add(temp.val);
            if(temp.right!=null){
                nodes.push(temp.right);
            }
            if(temp.left!=null){
                nodes.push(temp.left);
            }
        }
        return res;
    }
}

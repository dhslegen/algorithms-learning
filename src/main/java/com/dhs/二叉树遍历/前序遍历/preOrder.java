package com.dhs.二叉树遍历.前序遍历;

import com.dhs.二叉树遍历.TreeNode;

import java.util.Stack;

public class preOrder {
    public static void preOrderTraversal(TreeNode biTree) {
        System.out.printf(biTree.val + "");
        TreeNode leftTree = biTree.left;
        if (leftTree != null) {
            preOrderTraversal(leftTree);
        }
        TreeNode rightTree = biTree.right;
        if (rightTree != null) {
            preOrderTraversal(rightTree);
        }
    }

    public void preOrderTraversal2(TreeNode biTree) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (biTree != null || !stack.isEmpty()) {
            while (biTree != null) {
                System.out.print(biTree.val + ",");
                stack.push(biTree);
                biTree = biTree.left;
            }
            if (!stack.isEmpty()) {
                biTree = stack.pop();
                biTree = biTree.right;
            }
        }
    }
}

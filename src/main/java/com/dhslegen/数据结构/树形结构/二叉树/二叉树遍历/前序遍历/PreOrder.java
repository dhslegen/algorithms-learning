package com.dhslegen.数据结构.树形结构.二叉树.二叉树遍历.前序遍历;

import com.dhslegen.数据结构.树形结构.二叉树.二叉树遍历.TreeNode;

import java.util.Stack;

public class PreOrder {
    public static void preOrderTraversal(TreeNode biTree) {
        if (biTree == null) {
            return;
        }
        System.out.printf(biTree.val + ",");
        preOrderTraversal(biTree.left);
        preOrderTraversal(biTree.right);
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

package com.dhs.二叉树遍历.后序遍历;

import com.dhs.二叉树遍历.TreeNode;

public class postOrder {
    public static void postOrder(TreeNode biTree) {
        TreeNode leftTree = biTree.left;
        if (leftTree != null) {
            postOrder(leftTree);
        }
        TreeNode rightTree = biTree.right;
        if (rightTree != null) {
            postOrder(rightTree);
        }
        System.out.printf(biTree.val + "");
    }
}

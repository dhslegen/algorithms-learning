package com.dhs.二叉树遍历.中序遍历;

import com.dhs.二叉树遍历.TreeNode;

public class inOrder {
    public static void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        } else {
            inOrderTraversal(node.left);
            System.out.println(node.val);
            inOrderTraversal(node.right);
        }
    }
}

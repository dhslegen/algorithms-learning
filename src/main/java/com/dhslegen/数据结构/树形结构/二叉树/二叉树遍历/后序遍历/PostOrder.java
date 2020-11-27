package com.dhslegen.数据结构.树形结构.二叉树.二叉树遍历.后序遍历;

import com.dhslegen.数据结构.树形结构.二叉树.二叉树遍历.TreeNode;

public class PostOrder {
    public static void postOrder(TreeNode biTree) {
        if (biTree == null) {
            return;
        }
        postOrder(biTree.left);
        postOrder(biTree.right);
        System.out.printf(biTree.val + ",");
    }
}

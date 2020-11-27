package com.dhslegen.数据结构.树形结构.二叉树.二叉树遍历;

import com.dhslegen.数据结构.树形结构.二叉树.二叉树遍历.中序遍历.InOrder;
import com.dhslegen.数据结构.树形结构.二叉树.二叉树遍历.前序遍历.PreOrder;
import com.dhslegen.数据结构.树形结构.二叉树.二叉树遍历.后序遍历.PostOrder;

public class Main {
    public static void main(String[] args) {
        TreeNode A = new TreeNode("A");
        TreeNode B = new TreeNode("B");
        TreeNode C = new TreeNode("C");
        TreeNode D = new TreeNode("D");
        TreeNode E = new TreeNode("E");
        TreeNode F = new TreeNode("F");
        TreeNode G = new TreeNode("G");
        TreeNode H = new TreeNode("H");
        TreeNode K = new TreeNode("K");
        A.left = B;
        A.right = E;
        B.left = H;
        B.right = F;
        E.right = C;
        F.left = D;
        C.left = K;
        C.right = G;
        PreOrder.preOrderTraversal(A);
        InOrder.inOrderTraversal(A);
        PostOrder.postOrder(A);
    }

}

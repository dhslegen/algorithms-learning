package com.dhs.数据结构.单链表.查找.按序号查找;

import com.dhs.数据结构.单链表.定义.LNode;

public class LocateLNode {
    public static LNode locateLNode(LNode lNode, int x) {
        LNode node = lNode;
        while (node != null && node.data != x) {
            node = node.next;
        }
        return node;
    }
}

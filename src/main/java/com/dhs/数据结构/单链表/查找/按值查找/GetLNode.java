package com.dhs.数据结构.单链表.查找.按值查找;

import com.dhs.数据结构.单链表.定义.LNode;

/**
 * 获取制定序号的节点
 */
public class GetLNode {
    public static LNode getLNode(LNode lNode, int i) {
        //默认为1
        LNode node = lNode;
        int j = 1;
        //不断遍历，到i为止
        while (node!= null && j < i) {
            node = node.next;
            j++;
        }
        if (j == i) {
            return node;
        } else {
            return null;
        }
    }
}

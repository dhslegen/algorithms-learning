package com.dhslegen.数据结构.线性结构.链式存储.单链表.插入.前插;

import com.dhslegen.数据结构.线性结构.链式存储.单链表.定义.LNode;

public class InsertBefore {
    public static LNode insert(LNode lNode, int x, int p) {
        LNode node = lNode;
        //防止第一个就是满足条件的，导致没有直接前驱
        if (node.data == x) {
            LNode s = new LNode();
            s.data = p;
            //顺序不能反node的next必须先给别人，自己再重新被赋值
            s.next = node;
            lNode = s;
            return lNode;
        }
        //找到值为x的元素的前驱元素
        while (node.next != null && node.next.data != x) {
            node = node.next;
        }
        //如果为空，则返回头
        if (node.next == null) {
            return lNode;
        }
        LNode s = new LNode();
        s.data = p;
        //顺序不能反node的next必须先给别人，自己再重新被赋值
        s.next = node.next;
        node.next = s;
        return lNode;
    }
}

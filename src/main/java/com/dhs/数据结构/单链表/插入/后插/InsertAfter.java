package com.dhs.数据结构.单链表.插入.后插;

import com.dhs.数据结构.单链表.定义.LNode;

/**
 * 在指定值的元素后面插入插入指定元素
 */
public class InsertAfter {
    public static LNode insert(LNode lNode, int x, int p) {
        LNode node = lNode;
        while (node != null && node.data != x) {
            node = node.next;
        }
        //如果为空，则返回头
        if (node == null) {
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

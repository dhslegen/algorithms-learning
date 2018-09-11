package com.dhs.数据结构.单链表.删除;

import com.dhs.数据结构.单链表.定义.LNode;

public class Delete {
    public static LNode delete(LNode lNode, int x) {
        LNode node = lNode;
        //排除第一个就是目标
        if (node != null && node.data == x) {
            return node.next;
        }
        //遍历目标元素的上一个
        while (node.next != null && node.next.data != x) {
            node = node.next;
        }
        //没有等于x的
        if (node.next == null) {
            return lNode;
        }
        node.next = node.next.next;
        return lNode;
    }
}

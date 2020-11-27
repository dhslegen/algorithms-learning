package com.dhslegen.数据结构.线性结构.链式存储.单链表.表长;

import com.dhslegen.数据结构.线性结构.链式存储.单链表.定义.LNode;

public class ListLength {
    public static int listLength(LNode head) {
        LNode p = head;
        //默认为0
        int i = 0;
        //遍历直到节点的next为null
        while (p != null) {
            i++;
            p = p.next;
        }
        return i;
    }
}

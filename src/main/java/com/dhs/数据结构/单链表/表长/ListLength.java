package com.dhs.数据结构.单链表.表长;

import com.dhs.数据结构.单链表.定义.LNode;

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

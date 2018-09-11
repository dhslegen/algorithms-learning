package com.dhs.数据结构.单链表.原地翻转;

import com.dhs.数据结构.单链表.定义.LNode;

public class Reverse {
    public static LNode reverse(LNode lNode) {
        if (lNode == null || lNode.next == null) {
            System.out.println("元素个数为0或1，无法反转！");
            return lNode;
        }
        LNode h, p, q;
        h = lNode;
        p = lNode.next;
        q = lNode.next.next;
        //切断第一个元素的下一个指针
        h.next = null;
        while (q != null) {
            p.next = h;
            h = p;
            p = q;
            q = q.next;
        }
        p.next = h;
        return p;
    }

    public static LNode reverse1(LNode head) {
        LNode p, q, pr;
        p = head.next;
        q = null;
        head.next = null;
        while (p != null) {
            pr = p.next;
            p.next = q;
            q = p;
            p = pr;
        }
        head.next = q;
        return head;
    }

    public static LNode reverse2(LNode node) {
        LNode prev = null;
        LNode now = node;
        while (now != null) {
            LNode next = now.next;
            now.next = prev;
            prev = now;
            now = next;
        }

        return prev;
    }

    public static LNode reverse3(LNode node) {
        if (node.next == null) return node;
        LNode next = node.next;
        node.next = null;
        LNode re = reverse3(next);
        next.next = node;
        return re;
    }
}

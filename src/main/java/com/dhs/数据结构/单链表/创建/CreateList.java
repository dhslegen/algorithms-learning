package com.dhs.数据结构.单链表.创建;

import com.dhs.数据结构.单链表.定义.LNode;

import java.util.Scanner;

public class CreateList {
    public static LNode createList() {
        LNode lNode = null;
        LNode r = null;
        Scanner reader = new Scanner(System.in);
        if (reader.hasNextInt()) {
            LNode tmp = new LNode();
            r = lNode = tmp;
        }
        while (reader.hasNextInt()) {
            LNode tmp = new LNode();
            tmp.next = null;
            tmp.data = reader.nextInt();
            r.next = tmp;
            r = tmp;
        }
        return lNode;
    }

    public static LNode createList1() {
        LNode lNode = null;
        Scanner reader = new Scanner(System.in);
        while (reader.hasNextInt()) {
            LNode tmp = new LNode();
            tmp.next = lNode;
            tmp.data = reader.nextInt();
            lNode = tmp;
        }
        return lNode;
    }
}

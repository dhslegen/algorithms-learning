package com.dhslegen.数据结构.线性结构.链式存储.单链表.创建;

import com.dhslegen.数据结构.线性结构.链式存储.单链表.定义.LNode;

import java.util.Scanner;

public class CreateList {
    /**
     * 后插方式的创建链表
     *
     * @return
     */
    public static LNode createList() {
        LNode lNode = null;
        LNode r = null;
        Scanner reader = new Scanner(System.in);
        if (reader.hasNextInt()) {
            LNode tmp = new LNode();
            tmp.data = reader.nextInt();
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

    /**
     * 前插方式的创建链表
     *
     * @return
     */
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

package com.dhs.数据结构.单链表;

import com.dhs.数据结构.单链表.创建.CreateList;
import com.dhs.数据结构.单链表.删除.Delete;
import com.dhs.数据结构.单链表.原地翻转.Reverse;
import com.dhs.数据结构.单链表.定义.LNode;
import com.dhs.数据结构.单链表.插入.前插.InsertBefore;
import com.dhs.数据结构.单链表.插入.后插.InsertAfter;
import com.dhs.数据结构.单链表.查找.按值查找.GetLNode;
import com.dhs.数据结构.单链表.查找.按序号查找.LocateLNode;
import com.dhs.数据结构.单链表.表长.ListLength;

public class Main {
    public static void main(String[] args) {
        //测试创建
        LNode lNode = CreateList.createList();
        LNode lNode1 = CreateList.createList1();
        System.out.println("lnode 的长度为：" + ListLength.listLength(lNode));
        System.out.println("lnode1 的长度为：" + ListLength.listLength(lNode1));
        //测试插入
        lNode = InsertAfter.insert(lNode, 3, 100);
        lNode = InsertBefore.insert(lNode, 3, 100);
        //测试反转
        lNode = Reverse.reverse(lNode);
        //lNode = Reverse.reverse1(lNode);
        lNode = Reverse.reverse2(lNode);
        lNode = Reverse.reverse3(lNode);
        //测试删除
        lNode = Delete.delete(lNode, 1);
        lNode = Delete.delete(lNode, 3);
        lNode = Delete.delete(lNode, 8);
        lNode = Delete.delete(lNode, 100);
        //测试查找
        LNode node = GetLNode.getLNode(lNode, 5);
        node = LocateLNode.locateLNode(lNode, 4);

    }
}

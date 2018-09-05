package com.dhs.数据结构.顺序表;

import com.dhs.数据结构.顺序表.删除.Delete;
import com.dhs.数据结构.顺序表.插入.Insert;
import com.dhs.数据结构.顺序表.查找.Query;
import com.dhs.数据结构.顺序表.定义.SqList;

public class Main {
    public static void main(String[] args) {
        SqList sqList = new SqList();
        for (int i = 1; i <= 50; i++) {
            Insert.insert(sqList, i, i);
        }
        for (int d : sqList.data) {
            System.out.printf(d + ",");
        }
        System.out.println();
        Delete.delete(sqList, 3);
        for (int d : sqList.data) {
            System.out.printf(d + ",");

        }
        System.out.println();
        Query.query(sqList, 2);
        Query.query(sqList, 5);
        Query.query(sqList, 100);
    }
}

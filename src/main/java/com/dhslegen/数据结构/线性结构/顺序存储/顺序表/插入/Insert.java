package com.dhslegen.数据结构.线性结构.顺序存储.顺序表.插入;

import com.dhslegen.数据结构.线性结构.顺序存储.顺序表.定义.SqList;

public class Insert {
    public static SqList insert(SqList sqList, int i, int x) {
        System.out.println("顺序表的插入操作开始！");
        if (i < 1 || i > sqList.length + 1) {
            System.out.println("插入的目标位置非法！");
            return sqList;
        }
        if (sqList.length >= sqList.MAX_SIZE) {
            System.out.println("顺序表已满，无法插入！");
            return sqList;
        }
        //元素下标i-1（第i个元素）及后面的依次后移，具体实现要从最后一个开始，防止数据丢失。
        for (int m = sqList.length - 1; m >= i - 1; m--) {
            sqList.data[m + 1] = sqList.data[m];
        }
        sqList.data[i - 1] = x;
        sqList.length++;
        return sqList;
    }
}

package com.dhslegen.数据结构.线性结构.顺序存储.顺序表.查找;

import com.dhslegen.数据结构.线性结构.顺序存储.顺序表.定义.SqList;

public class Query {
    /**
     * 在顺序表中查找值为x的元素，查找成功则返回元素的存储位置，否则返回-1
     *
     * @param sqList 顺序表
     * @param x      目标元素
     * @return 存储的位置
     */
    public static int query(SqList sqList, int x) {
        //默认第一个就能找到
        int i = 1;
        while (i <= sqList.length && sqList.data[i - 1] != x) {
            i++;
        }
        if (i > sqList.length) {
            return -1;
        } else {
            System.out.println("目标元素的位置为：" + i);
            return i;
        }
    }
}

package com.dhs.数据结构.顺序表.删除;

import com.dhs.数据结构.顺序表.类型定义.SqList;

public class Delete {
    public static SqList delete(SqList sqList, int i) {
        System.out.println("顺序表的删除操作开始！");
        if (i < 1 || i > sqList.length + 1) {
            System.out.println("删除的目标位置非法！");
            return sqList;
        }
        //元素下标i-1（第i个元素）及后面的依次前移，具体实现要从第一个开始，防止数据丢失。
        for (int m = i - 1; m < sqList.length - 1; m++) {
            sqList.data[m] = sqList.data[m + 1];
        }
        sqList.length--;
        return sqList;
    }
}

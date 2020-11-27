package com.dhslegen.算法.排序.插入排序.直接插入排序;

public class StraightInsertionSort {
    public static void sort(int[] item) {
        int i;
        int j;
        int len = item.length;
        for (i = 1; i < len; i++) {
            if (item[i] < item[i - 1]) {
                int temp = item[i];
                for (j = i - 1; temp > item[j] & j >= 0; j--) {
                    item[j + 1] = item[j];
                    item[j + 1] = temp;
                }
            }
        }
        System.out.println("直接插入排序结果:");
        for (int it : item) {
            System.out.print(it + ",");
        }
    }
}

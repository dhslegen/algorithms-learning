package com.dhs.排序;

import com.dhs.排序.交换排序.冒泡排序.BubbleSort;
import com.dhs.排序.插入排序.直接插入排序.StraightInsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] item = {46, 52, 16, 45, 88, 20, 8, 72};
        StraightInsertionSort.sort(item);
        BubbleSort.bubbleSort(item);
    }
}

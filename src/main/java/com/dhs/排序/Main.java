package com.dhs.排序;

import com.dhs.排序.交换排序.快速排序.QuickSort;

public class Main {
    public static void main(String[] args) {
        int[] item = {46, 52, 16, 45, 88, 20, 8, 72};
        //StraightInsertionSort.sort(item);
        // BubbleSort.bubbleSort(item);
        int[] sortArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        QuickSort.quickSort(sortArray, 2, 6);
    }
}

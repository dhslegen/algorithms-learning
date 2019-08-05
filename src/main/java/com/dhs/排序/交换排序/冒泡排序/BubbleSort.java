package com.dhs.排序.交换排序.冒泡排序;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // -1为了防止溢出
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("冒泡排序结果:");
        for (int a : arr) {
            System.out.print(a + ",");
        }
    }
}

package com.dhs.排序.交换排序.快速排序;

public class QuickSort {
    public static void quickSort(int[] array, int start, int end) {
        int s = start;
        int e = end;
        int k = array[start];

        while (s < e) {
            while (s < e && array[e] >= k)
                e--;
            if (s < e) {
                int temp = array[e];
                array[e] = array[s];
                array[s] = temp;
                s++;
            }

            while (s < e && array[s] <= k)
                s++;

            if (s < e) {
                int temp = array[e];
                array[e] = array[s];
                array[s] = temp;
                e--;
            }
        }
        System.out.print("l=" + (s + 1) + "h=" + (e + 1) + "povit=" + k + "\n");
        if (s > start) quickSort(array, start, s - 1);
        if (e < end) quickSort(array, s + 1, end);
    }

    public <T extends Comparable<? super T>>
    void quickSort(T[] targetArr, int start, int end) {
        int i = start;
        int j = end;
        T key = targetArr[start];

        while (i < j) {
            /*按j--方向遍历目标数组，直到比key小的值为止*/
            while (j > i && targetArr[j].compareTo(key) >= 0) {
                j--;
            }
            if (i < j) {
                /*targetArr[i]已经保存在key中，可将后面的数填入*/
                targetArr[i] = targetArr[j];
                i++;
            }
            /*按i++方向遍历目标数组，直到比key大的值为止*/
            while (i < j && targetArr[i].compareTo(key) <= 0)
                /*此处一定要小于等于零，假设数组之内有一亿个1，0交替出现的话，而key的值又恰巧是1的话，那么这个小于等于的作用就会使下面的if语句少执行一亿次。*/ {
                i++;
            }
            if (i < j) {
                /*targetArr[j]已保存在targetArr[i]中，可将前面的值填入*/
                targetArr[j] = targetArr[i];
                j--;
            }
        }
        /*此时i==j*/
        targetArr[i] = key;

        /*递归调用，把key前面的完成排序*/
        this.quickSort(targetArr, start, i - 1);


        /*递归调用，把key后面的完成排序*/
        this.quickSort(targetArr, j + 1, end);

    }
}

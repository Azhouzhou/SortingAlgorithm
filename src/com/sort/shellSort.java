package com.sort;

import java.util.Arrays;

/**
 * 希尔排序：
 * 首先将数组进行分组，然后将较大值移到前面，较小值移到后面，最后将整个数组进行插入排序，这样比起一开始就用插入排序减少了数据交换和移动的次数，可以说希尔排序是加强版的插入排序
 */
public class shellSort {
    private static void shellSort(int[] a) {
        System.out.println(Arrays.toString(a));
        int j;
        int tmp;
        //每次将步长缩短为原来的一半
        for (int groupnum = a.length / 2; groupnum >0; groupnum /= 2) {
            for (int i = groupnum; i < a.length;i++) {
                tmp = a[i];
                for (j = i; j >= groupnum && tmp< a[j - groupnum]; j -= groupnum) {
                    a[j] = a[j - groupnum];
                }
                a[j] = tmp;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] a={3,4,1,2,6,5};
        shellSort(a);
    }
}

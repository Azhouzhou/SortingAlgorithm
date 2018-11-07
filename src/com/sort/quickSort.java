package com.sort;

import java.util.Arrays;

/**
 * 快速排序：不断寻找一个序列的中点，然后对中点左右的序列递归的进行排序，直至全部序列排序完成，使用了分治的思想。
 * 分治和递归
 */
public class quickSort {
    public static void main(String[] args) {
        int[] a={5,3,5,7,8,2};
        System.out.println(Arrays.toString(a));
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }
    private static void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }
    private static void quickSort(int[] a, int left, int right) {
        if (left < right) {
            int pivot = a[left];
            int lo = left;
            int hi = right;
            while (lo < hi) {
                while (lo < hi &&a[hi] >= pivot) {
                    hi--;
                }
                a[lo] = a[hi];
                while (lo < hi &&a[lo] <= pivot) {
                    lo++;
                }
                a[hi] = a[lo];
            }
            a[lo] = pivot;
            quickSort(a, left, lo - 1);
            quickSort(a, lo + 1, right);
        }
    }
}

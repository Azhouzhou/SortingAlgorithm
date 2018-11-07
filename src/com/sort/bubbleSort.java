package com.sort;

/**
 * 冒泡排序：
 * 将序列划分为无序和有序区，不断通过交换较大元素至无序区尾完成排序。
 */
public class bubbleSort {
    private static void bubbleSort(int[] a) {
        System.out.println(a);
        for (int i = 0; i < a.length - 1;i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
        System.out.println(a);
    }
    private static void swap(int[] a, int x, int y) {
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }

    public static void main(String[] args) {
        int[] a={3,4,1,2,6,5};
        bubbleSort(a);
    }
}

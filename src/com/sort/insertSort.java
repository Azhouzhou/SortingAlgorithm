package com.sort;

import java.util.Arrays;

/**
 * 插入排序
 * 原理：将数组分为无序区和有序区两个区，然后不断将无序区的第一个元素按大小顺序插入到有序区中去，最终将所有无序区元素都移动到有序区完成排序
 * 思路：设置哨兵，作为临时存储和判断数组边界的
 */

public class insertSort {
    public static void main(String[] args) {
        int[] a ={7,5,8,4,2};
        insertSort(a);
    }
    private static void insertSort(int[] a) {
        System.out.println(Arrays.toString(a));
        int preIndex;
        int tmp;
        for (int i = 1; i < a.length; i++) {
            //从数组第二项开始循环
            tmp = a[i];
            for (preIndex = i; preIndex > 0 && tmp < a[preIndex - 1]; preIndex--) {

                    //跟前一项对比，后一项比前一项小，交互位置。
                    a[preIndex] = a[preIndex - 1];

            }
            //把哨兵挪到第二项
            a[preIndex] = tmp;
        }
        System.out.println(Arrays.toString(a));
    }



}

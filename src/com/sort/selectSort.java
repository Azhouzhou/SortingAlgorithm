package com.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 简单选择排序：将序列划分为无序和有序区，寻找无序区中的最小值和无序区的首元素交换，有序区扩大一个，循环最终完成全部排序
 */
public class selectSort {
    private static void selectSort(int[] a){
        int index;
        for (int i=0;i<a.length;i++){
            index=i;
            for (int j=i+1;j<a.length;j++){
                if (a[index]>a[j]){
                    index=j;
                }
            }
            //选择出最小的，放在第一个
            swap(a,index,i);
        }
    }

    //交换
    private static void swap(int[] a,int x,int y){
        int tmp=a[x];
        a[x]=a[y];
        a[y]=tmp;
    }

    public static void main(String[] args) {
        int[] a={4,3,4,6,1,2};
        System.out.println(Arrays.toString(a));
        selectSort(a);
        System.out.println(Arrays.toString(a));
    }
}

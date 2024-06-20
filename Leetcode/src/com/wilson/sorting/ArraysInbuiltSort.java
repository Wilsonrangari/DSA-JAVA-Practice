package com.wilson.sorting;

import java.util.Arrays;

public class ArraysInbuiltSort {
    public static void main(String[] args) {
        int[] arr={5,9,7,6,1,3,8};
        Arrays.sort(arr);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}

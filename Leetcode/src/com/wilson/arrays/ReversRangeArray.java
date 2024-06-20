package com.wilson.arrays;

import java.util.Scanner;

public class ReversRangeArray {

    public static void main(String[] args) {
        int [] arr = {10,20,30,40, 50, 60, 70};
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
        int j = scn.nextInt();
        reverse_RangeArray(arr, i , j);
        for (int k = 0; k < arr.length ; k++) {
            System.out.print(arr[k]+" ");

        }
    }

    private static void reverse_RangeArray(int[] arr, int i , int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

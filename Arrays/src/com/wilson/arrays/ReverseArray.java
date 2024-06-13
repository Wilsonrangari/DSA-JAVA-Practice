package com.wilson.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40};
        reverseArray(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }

    private static void reverseArray(int[] arr) {

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

package com.wilson.sorting;

//Brute force Approach

public class BubbleSort {

    public static void main(String[] args) {


        int[] arr={5,4,3,2,1};
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length-1-j; i++) { // 0 to 4
                if (arr[i] > arr[i + 1]) {
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i + 1] = temp;
                }

            }
        }



//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i] > arr[i+1]) {
//                //swap
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }
//        for(int i=0;i<arr.length-2;i++){
//            if(arr[i] > arr[i+1]) {
//                //swap
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }
//        for(int i=0;i<arr.length-3;i++){
//            if(arr[i] > arr[i+1]) {
//                //swap
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }
//        for(int i=0;i<arr.length-4;i++){
//            if(arr[i] > arr[i+1]) {
//                //swap
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}

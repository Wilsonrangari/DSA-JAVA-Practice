package com.wilson.arrays;

public class ArraySum {

    public static void main(String[] args) {
        int[]arr = {1,5,6,7,9};
        int sum = 16;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                int result = arr[i] + arr[j];
                if(sum == result){
                    System.out.println(i+" "+ j);
                }
            }
        }



        }
    }

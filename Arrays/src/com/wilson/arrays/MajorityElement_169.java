package com.wilson.arrays;

public class MajorityElement_169 {

    public static void main(String[] args) {
        int[] arr={2,2, 1, 1, 2, 3, 3,3, 3};
        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int[] arr) {
        int majority= arr[0];
        int value = 1;

        for (int i = 1; i <arr.length ; i++) {
            if( majority == arr[i] ){
                value++;
            }
                
             else {
                value--;
            }

        }
        return majority;
    }
}

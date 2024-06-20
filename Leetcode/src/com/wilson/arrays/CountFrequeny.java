package com.wilson.arrays;


//v. imp
public class CountFrequeny {
    public static void main(String[] args) {
        int[] nums ={2,2,3,3,3,4};
        int[] frequencyArray = new int[nums.length];

        //Count the frequencies
        for (int num : nums) {
            frequencyArray[num]++;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(frequencyArray[i]+" ");
        }
    }
}

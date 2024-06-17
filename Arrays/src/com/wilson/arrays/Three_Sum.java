package com.wilson.arrays;

public class Three_Sum {

    public static void main(String[] args) {
        int[]arr= {4,1,5,7,9};
        int given_sum = 15;
        int right =arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            int num1 = arr[i];
            int sumToFind= given_sum - num1; //14
            int left = 1;
            while(left < right){

                int current_sum = arr[left] + arr[right];
                if(sumToFind == current_sum){
                    System.out.println(i +" " +left +" "+right+""+" "+(arr[i]+arr[left]+arr[right]));
                    break;
                }
                else if (current_sum < sumToFind){
                    left++;
                }
                else {
                    right--;
                }

            }



        }


    }
}

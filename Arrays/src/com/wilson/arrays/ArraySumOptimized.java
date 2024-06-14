package com.wilson.arrays;

public class ArraySumOptimized {
    public static void main(String[] args) {

        int[] arr={1,4 , 7 , 9, 10}; //5
        int given_sum = 16;
        int low= 0;  //0
        int high= arr.length-1;  //4

        while(low<=high){
            int current_sum = arr[low] + arr[high];
            if(current_sum == given_sum){
                System.out.println(low+" "+high+" "+current_sum);
                break;
            }
            else if(current_sum > given_sum){
                high--;
            }
            else {
                low++;
            }
        }



        }
    }

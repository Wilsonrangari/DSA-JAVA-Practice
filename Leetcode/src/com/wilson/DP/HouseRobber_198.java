package com.wilson.DP;

import java.util.HashMap;

public class HouseRobber_198 {
    public static void main(String[] args) {
        int [] nums={2,7,9,3,1};
        System.out.println(maxMoney(0, nums, new HashMap<Integer, Integer>()));
    }

    private static int maxMoney(int currentHouse, int[] nums, HashMap<Integer, Integer> memo) {

        if(currentHouse >= nums.length){ 
            return 0;
        }
        int currentKey = currentHouse;
        if(memo.containsKey(currentKey)){
            return memo.get(currentKey);
        }
        int rob = nums[currentHouse] + maxMoney(currentHouse+2, nums, memo);
        int noRob = maxMoney(currentHouse+1, nums, memo);

        memo.put(currentKey, Math.max(rob, noRob));
        return memo.get(currentKey);
    }
}

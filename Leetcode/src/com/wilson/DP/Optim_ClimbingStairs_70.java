package com.wilson.DP;

import java.util.HashMap;
import java.util.Scanner;

public class Optim_ClimbingStairs_70 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Total ways to climb stair is "+totalWays(0, n, new HashMap<Integer, Integer>()));
    }
    private static int totalWays(int currentStair, int targetStair, HashMap<Integer, Integer> memo) {
        System.out.println(memo);
            if (targetStair == currentStair)
                return 1;
            if (targetStair < currentStair)
                return 0;

            int currentKey = currentStair;
            if(memo.containsKey(currentKey)){
                return memo.get(currentKey);
            }

            int oneJump = totalWays(currentStair + 1, targetStair, memo);
            int twoJump = totalWays(currentStair + 2, targetStair, memo);

            memo.put(currentKey, oneJump + twoJump);
            System.out.println(memo);

            //return memo.get(currentKey);
              return oneJump + twoJump;
        }
}

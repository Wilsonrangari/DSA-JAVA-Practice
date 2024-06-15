package com.wilson.DP;

import java.util.Scanner;

public class ClimbingStairs_70 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Total ways to climb stair is "+totalWays(0, n)); ;
    }
    private static int totalWays(int currentStair, int targetStair ) {
            if (targetStair == currentStair)
                return 1;
            if (targetStair < currentStair)
                return 0;

            int oneJump = totalWays(currentStair + 1, targetStair);
            int twoJump = totalWays(currentStair + 2, targetStair);

            return oneJump + twoJump;
        }
}

package com.wilson.arrays;

import java.util.HashMap;

public class HashMap_Demo {

    public static void main(String[] args) {


        HashMap<Integer, Integer>  memo  = new HashMap<>();


        memo.put(1, 10);
        memo.put(2, 20);
        memo.put(3, 30);

        System.out.println("The value of key 3 is "+ memo.get(3));

        System.out.println("Contains Key "+memo.containsKey(3));
        System.out.println(memo);



    }
}

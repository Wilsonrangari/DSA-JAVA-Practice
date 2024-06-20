package com.wilson.String;

import java.util.HashSet;
import java.util.Set;

public class OptimalPartitionOfString_2405 {

    public static void main(String[] args) {
        String s =  "abacaba";

        Set currentSubString=new HashSet();
        int partitionCount = 0;

        for (char ch :s.toCharArray()){
            if(currentSubString.contains(ch)){
                partitionCount++;
                currentSubString.clear();
            }
                currentSubString.add(ch);
        }
        if (!currentSubString.isEmpty()) {
            partitionCount++;
        }
        System.out.println(partitionCount);

        }
    }

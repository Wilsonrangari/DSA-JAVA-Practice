package com.wilson.arrays;

public class LenghtOfLastWord_58 {

    public static void main(String[] args) {
        String s = "Hello World";
       /* String[] words = s.split(" ");
        System.out.println(words[words.length-1].length());*/

        //Another Approach
        s.trim();
        int length = 0;
      //  System.out.println(s.length()-1);
        for (int i = s.length()-1; i>=0; i--){
            if(s.charAt(i)   != ' '){
                length++;
            }
            else if (length > 0) {
                break;
        }
        }
        System.out.println(length);
    }
}

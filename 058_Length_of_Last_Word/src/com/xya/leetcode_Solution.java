package com.xya;

public class leetcode_Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int i=s.length();
        for(;i>=1;){
            if(s.charAt(i-1) == ' '){
                if(len == 0) {
                    i--;
                }else{
                    break;
                }
            }else{
                len++;
                i--;
            }
        }
        return len;
    }
}

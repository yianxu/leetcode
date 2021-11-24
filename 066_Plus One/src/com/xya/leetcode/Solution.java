package com.xya.leetcode;

public class Solution {
    public static void main(String[] args) {
        new Solution().plusOne(new int[]{0});
    }

    public int[] plusOne(int[] digits) {

        int plus_flag = 0;
        for(int i=digits.length-1;i>=0;i--){
            int temp;
            if(i == digits.length - 1){
                temp = digits[i] + 1;
            }else{
                temp = digits[i] + plus_flag;
            }

            if(temp > 9){
                temp = 10-temp;
                plus_flag = 1;
            }else{
                plus_flag = 0;
            }
            digits[i] = temp;
        }
        return  digits[0] == 0 ? addPlus(digits):digits;
    }

    private static int[] addPlus(int[] digits){
        int len = digits.length;
        int[] result = new int[len+1];

        result[0] = 1;
        for(int i=1;i<result.length;i++){
            result[i] = digits[i-1];
        }
        return result;
    }
}

package com.xya.leetcode;

import java.math.BigDecimal;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *  
 * 示例 1：
 *
 * 输入：x = 123
 * 输出：321
 * 示例 2：
 *
 * 输入：x = -123
 * 输出：-321
 * 示例 3：
 *
 * 输入：x = 120
 * 输出：21
 * 示例 4：
 *
 * 输入：x = 0
 * 输出：0
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    public static int reverse(int x) {
        String s = String.valueOf(x);

        String s1 = x<0?s.substring(1,s.length()):s;

        String reverseStr = new StringBuilder(s1).reverse().toString();

        if (new BigDecimal(reverseStr).compareTo(new BigDecimal(Integer.MAX_VALUE)) > 0) {
            return 0;
        }

        int i = 0;
        if (reverseStr.length() > 1) {
            for (; i < reverseStr.length(); i++) {
                if (reverseStr.charAt(i) == '0') {
                    continue;
                } else {
                    break;
                }
            }
        }
        String resultstr = i==reverseStr.length()-1 ? reverseStr:reverseStr.substring(i);
        if (x < 0) {
            return -Integer.valueOf(resultstr);
        } else {
            return Integer.valueOf(resultstr);
        }
    }

}

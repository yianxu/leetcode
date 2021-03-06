package com.xya.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 示例 4:
 *
 * 输入: s = ""
 * 输出: 0
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (null == s || s.length() == 0) {
            return 0;
        }

        int maxlen = 1;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> characterSet = new HashSet<>();
            characterSet.add(s.charAt(i));
            int j=i+1;
            int len = 1;
            while (j < s.length()) {
                Character c = s.charAt(j);
                if (characterSet.contains(c)) {
                    break;
                } else {
                    characterSet.add(c);
                    j++;
                    len++;
                }
            }
            if (len > maxlen) {
                maxlen = len;
            }
        }

        return maxlen;
    }
}

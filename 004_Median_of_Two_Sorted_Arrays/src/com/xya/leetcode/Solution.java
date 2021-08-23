package com.xya.leetcode;

public class Solution {
    public static void main(String[] args) {
//        java.text.DecimalFormat df = new java.text.DecimalFormat("#.00000");
//        System.out.println(new BigDecimal(1.5).setScale(4));
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result;
        int len = nums1.length + nums2.length;
        int[] num = new int[len];
        int nums1_index = 0;
        int nums2_index = 0;
        int i = 0;
        while (i < len) {
            if (nums1_index < nums1.length && nums2_index < nums2.length) {
                if (nums1[nums1_index] <= nums2[nums2_index]) {
                    num[i] = nums1[nums1_index];
                    nums1_index++;
                } else {
                    num[i] = nums2[nums2_index];
                    nums2_index++;
                }
            } else if (nums1_index < nums1.length) {
                num[i] = nums1[nums1_index];
                nums1_index++;
            } else if (nums2_index < nums2.length) {
                num[i] = nums2[nums2_index];
                nums2_index++;
            }
            i++;
        }
        if (len % 2 == 0) {
            //偶数
            result =  ((double)(num[len / 2 - 1] + num[len / 2]) / 2);
        } else {
            //奇数
            result = num[(len + 1) / 2 - 1];
        }
        return result;
    }
}

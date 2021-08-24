package com.xya.leetcode;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        isValid("]");
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            if(c == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    return  false;
                }
            }
            if(c == '}'){
                if(stack.isEmpty() || stack.pop() != '{'){
                    return  false;
                }
            }
            if(c == ']'){
                if(stack.isEmpty() || stack.pop() != '['){
                    return  false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }


}

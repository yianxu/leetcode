package com.xya.meituan;
import java.util.Scanner;

public class Main {
    private static final String wrong = "Wrong";
    private static final String accept = "Accept";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }
        for (String s : names) {
            System.out.println(check(s));
        }
    }

    public static String check(String name) {
        if (name.isEmpty()) {
            return wrong;
        }
        //用户名的首字符必须是大写或者小写字母
        if (!isCharacter(name.charAt(0))) {
            return wrong;
        }
        //用户名只能包含大小写字母，数字
        //用户名需要包含至少一个字母和一个数字
        boolean hasCharacterFlag = false;
        boolean hasDigitNum = false;

        for (char c : name.toCharArray()) {
            if(isCharacter(c)){
                hasCharacterFlag = true;
            }else if(isDigitNum(c)){
                hasDigitNum = true;
            }else{
                return wrong;
            }
        }
        if(hasCharacterFlag && hasDigitNum){
            return accept;
        }

        return wrong;
    }

    private static boolean isCharacter(char c) {
        int firstCharacter = c;
        return (firstCharacter >= 65 && firstCharacter <= 90) || (firstCharacter >= 97 && firstCharacter <= 122);
    }

    private static boolean isDigitNum(char c) {
        int digitNum = c;
        return digitNum >= 48 && digitNum <= 57;
    }
}

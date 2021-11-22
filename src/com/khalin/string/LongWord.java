package com.khalin.string;

import java.util.Scanner;

public class LongWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();

        System.out.println("solution : " + solution(input1));
        System.out.println("solution2 : " + solution2(input1));
        System.out.println("solution3 : " + solution3(input1));
    }

    private static String solution(String input1) {
        String answer;
        String[] s = input1.split(" ");
        answer = s[0];

        for (String value : s) {
            if (answer.length() < value.length()) {
                answer = value;
            }
        }

        return answer;
    }

    private static String solution2(String input1){
        String answer = "";
        String[] sArr = input1.split(" ");
        int min = Integer.MIN_VALUE;

        for(String s : sArr){
            if(s.length() > min){
                min = s.length();
                answer = s;
            }
        }

        return answer;
    }

    private static String solution3(String input1){
        String answer = "";
        int min = Integer.MIN_VALUE;
        int pos;

        while((pos = input1.indexOf(' ')) != -1){
            String tmp = input1.substring(0, pos);
            int len = tmp.length();
            if(min < len){
                min = len;
                answer = tmp;
            }
            input1 = input1.substring(pos+1);
        }
        if(input1.length() > min){
            answer = input1;
        }

        return answer;
    }
}

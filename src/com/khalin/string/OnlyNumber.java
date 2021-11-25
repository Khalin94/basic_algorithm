package com.khalin.string;

import java.util.Scanner;

public class OnlyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("solution : " + solution(sc.nextLine()));
        System.out.println("solution1 : " + solution1(sc.nextLine()));
    }

    private static int solution(String str){
        String match = str.replaceAll("[^\\d]", "");


        return Integer.parseInt(match);
    }
    private static int solution1(String str){
        int answer;
        char[] chs = str.toCharArray();

        String tmp = "";
        for(char ch : chs){
           /* char 문자의 번호를 이용한 방법
            if(ch >=48 && ch <=57){
               answer = answer * 10 + (ch - 48);
            }
            */
            if(Character.isDigit(ch)){
                tmp += ch;
            }
        }
        answer = Integer.parseInt(tmp);
        return answer;
    }
}

package com.khalin.string;

import java.util.Scanner;

public class OnlyLetterReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        /* av#b!GE*T@!S */
        System.out.println("1 : " + solution(str));
        System.out.println("2 : " + solution1(str));
    }

    private static String solution(String str){
        String answer = "";
        int lt = 0;
        int rt = str.length() -1;
        char[] chs = str.toCharArray();

        while (lt < rt){
            /*if(Character.isLetter(chs[lt]) && Character.isLetter(chs[rt])){
                char temp = chs[lt];
                chs[lt] = chs[rt];
                chs[rt] = temp;
            }*/
            if(!(Character.isLetter(chs[lt]))){
                lt++;
            }else if(!(Character.isLetter(chs[rt]))){
                rt--;
            }else{
                char temp = chs[lt];
                chs[lt] = chs[rt];
                chs[rt] = temp;
                lt++;
                rt--;
            }

//            lt++;
//            rt--;
        }
        for(char ch : chs){
            answer += Character.toString(ch);
        }

        return answer;
    }

    private static String solution1(String str){
        String answer;
        int lt = 0;
        int rt = str.length() -1;
        char[] chs = str.toCharArray();

        while (lt < rt){
            if(Character.isLetter(chs[lt]) && Character.isLetter(chs[rt])){
                char temp = chs[lt];
                chs[lt] = chs[rt];
                chs[rt] = temp;
            }

            lt++;
            rt--;
        }

        answer = String.valueOf(chs);
        return answer;
    }
}

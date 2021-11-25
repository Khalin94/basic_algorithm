package com.khalin.string;

import java.util.Scanner;

public class CircularWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(solution(sc.next()));
    }

    private static String solution(String str){
        String answer = "NO";
        if(str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) answer="YES";

       /* second
        StringBuilder sb = new StringBuilder(str).reverse();
        if(str.equalsIgnoreCase(sb.toString())){
            answer = "YES";
        }
        */
        /* first
        StringBuilder sb = new StringBuilder(str);
        String reverseWord = sb.reverse().toString();
        if(str.equalsIgnoreCase(reverseWord)){
            answer = "YES";
        }
        */

        return answer;
    }

    private static String solution1(String str){
        String answer = "YES";
        char[] chs = str.toLowerCase().toCharArray();
        int lt=0;
        int rt=chs.length-1;
       /* for(int i=0; i<str.length()/2; i++){
            if(chs[lt] != chs[rt]){
                answer = "NO";
            }
            lt++;
            rt--;
        }*/
       for(int i=0; i<str.length()/2;i++){
           if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(str.length() - i - 1)) {
               answer = "NO";
               break;
           }
       }


        return answer;
    }
}

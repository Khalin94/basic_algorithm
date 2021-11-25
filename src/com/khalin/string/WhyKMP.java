package com.khalin.string;

import java.util.Scanner;

public class WhyKMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input  = sc.next().split("-");
        String result = "";

        for(String str : input) {
            result += str.charAt(0);
        }
        System.out.println(result);
        //Scanner sc = new Scanner(System.in);
        //String input  = sc.next();


       // System.out.println(solution(input));

    }
    /*
    * input 1 : Knuth-Morris-Pratt -> KMP
    * input 2 : Mirko-Slavko -> MS
    * input 3 : Pasko-Patak -> PP
    * */
    private static String solution(String str){
        String[] spStr = str.split("-");
        StringBuilder sb = new StringBuilder();

        for(String s : spStr){
            sb.append(s.charAt(0));
        }

        return sb.toString();
    }
}

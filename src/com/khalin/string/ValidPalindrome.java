package com.khalin.string;

import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextLine()));
    }
    private static String solution(String str){
        String answer = "NO";
//        String planeWord = str.replaceAll("[0-9\\,\\;\\:\\#\\%\\*\\$\\!\\@\\&\\s]", "");
        String planeWord = str.replaceAll("[^a-zA-Z]", "");

        if(planeWord.equalsIgnoreCase(new StringBuilder(planeWord).reverse().toString())){
            answer = "YES";
        }

        return answer;
    }
}

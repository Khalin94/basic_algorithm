package com.khalin.string;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wordCnt = sc.nextInt();
        String pw = sc.next();

        System.out.println(solution1(wordCnt, pw));
    }

    private static String solution(int wordCnt, String pw){
       String toBinary = "";
       String word = "";

       for(int i=0; i<pw.length(); i++){
           if(pw.charAt(i) == '#'){
               toBinary += 1;
           }else{
               toBinary += 0;
           }
       }

       int limit = 0;
       for(int i=0; i<wordCnt; i++){
          String a = toBinary.substring(limit, limit+7);
           word += (char)Integer.parseInt(a, 2);
           limit += 7;
       }

       return word;
    }

    private static String solution1(int wordCnt, String pw) {
        String answer = "";

        for(int i=0; i<wordCnt; i++){
            String temp = pw.substring(0, 7).replace("#", "1").replace("*", "0");
            int num = (char)Integer.parseInt(temp, 2);
            answer += (char) num;
            pw = pw.substring(7);
        }

        return answer;
    }

}

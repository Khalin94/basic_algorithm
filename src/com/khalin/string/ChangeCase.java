package com.khalin.string;

import java.util.Scanner;

public class ChangeCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 =  sc.nextLine();

        System.out.println(solution(input1));
        System.out.println("solution2 :: " + solution2(input1));
    }

    private static String solution(String input1) {
        String answer;
        StringBuilder sb = new StringBuilder();
        for(char ch : input1.toCharArray()){
            if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }else{
                sb.append(Character.toLowerCase(ch));
            }
        }
        answer = sb.toString();

        return answer;
    }

    private static String solution2(String input1){
        /*String answer = "";
        for(char ch : input1.toCharArray()){
            if(ch>=65 && ch <= 90){
                answer += (char)(ch+32);
            }else{
                answer += (char)(ch-32);
            }
        }

        return answer;*/
        StringBuilder answer = new StringBuilder();
        for(char ch : input1.toCharArray()){
            if(ch>=65 && ch <= 90){
                answer.append((char) (ch + 32));
            }else{
                answer.append((char) (ch - 32));
            }
        }

        return answer.toString();
    }
}

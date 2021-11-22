package com.khalin.string;

import java.util.Locale;
import java.util.Scanner;

public class FindLetter {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String input1 = in.nextLine();
        char input2 = in.next().charAt(0);

        System.out.print("solution2 :: " + solution2(input1, input2));
    }

    private static int solution(String input1, char input2){
        String lowCaseStr = input1.toLowerCase();
        char target = Character.toLowerCase(input2);
        int count = 0;
        for(int i=0; i<lowCaseStr.length(); i++){
            char ch = lowCaseStr.charAt(i);
            if(ch == target){
                count++;
            }
        }
        return count;
    }

    private static int solution2(String input1, char input2){
        int answer = 0;
        String lowCaseStr = input1.toLowerCase();
        char target = Character.toLowerCase(input2);

        for(char ch : lowCaseStr.toCharArray()){
            if(ch == target){
                answer++;
            }
        }

        return answer;
    }
}

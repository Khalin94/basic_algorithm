package com.khalin.string;

import java.util.Scanner;

public class WordReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        String[] inputs = new String[input1];
        for(int i=0; i<inputs.length; i++){
            inputs[i] = sc.next();
        }

        String[] result = solution(input1, inputs);

        for(String str : result){
            System.out.println(str);
        }

        String[] result2 = solution1(input1, inputs);

        for(String str : result2){
            System.out.println(str);
        }

        String[] result3 = solution2(input1, inputs);

        for(String str : result3){
            System.out.println(str);
        }
    }

    private static String[] solution(int input1, String[] inputs) {
        String[] answer = new String[input1];

        for(int i=0; i<inputs.length; i++){
            StringBuilder sb = new StringBuilder(inputs[i]);
            answer[i] = sb.reverse().toString();
        }

        return answer;
    }

    private static String[] solution1(int input1, String[] inputs){
        String[] answer = new String[input1];

        for(int i=0; i<input1; i++){
            String tmp = inputs[i];
            answer[i] = "";
            for(int j=tmp.length()-1; j>=0; j--){
                char ch = tmp.charAt(j);
                answer[i] += ch;
            }
        }


        return answer;
    }

    private static String[] solution2(int input1, String[] inputs){
        String[] answer = new String[input1];
        int cnt = 0;
        for(String input : inputs){
            char[] chs = input.toCharArray();
            int lt = 0;
            int rt = input.length()-1;
            while(lt < rt){
                char tmp = chs[lt];
                chs[lt] = chs[rt];
                chs[rt] = tmp;
                lt++;
                rt--;
            }
            String result = String.valueOf(chs);
            answer[cnt] = result;
            cnt++;
        }

        return answer;
    }

}

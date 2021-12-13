package com.khalin.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OXScore {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        String[] probStr = bf.readLine().split(" ");
        int[] prob = new int[n];
        for(int i=0; i<n; i++){
            prob[i] = Integer.parseInt(probStr[i]);
        }

        System.out.println("solution : " + solution(n, prob));

        System.out.println("solution1 : " + solution1(n, prob));

    }

    private static int solution(int n, int[] prob){
        int sum = 0;

        if(prob[0] == 1){
            sum += 1;
        }

        int cnt = 0;
        for(int i=1; i<n; i++){
            if(prob[i] != 0 && prob[i-1] == 1){
                cnt++;
            }else{
                cnt = 0;
            }
            if(prob[i] == 1){
                sum += 1;
            }
            sum += cnt;

        }

        return sum;
    }

    private static int solution1(int n, int[] prob){
        int answer = 0;
        int cnt = 0;

        for(int i=0; i<n; i++){
            if(prob[i] == 1){
                cnt++;
                answer = answer + cnt;
            }else{
                cnt = 0;
            }
        }

        return answer;
    }
}

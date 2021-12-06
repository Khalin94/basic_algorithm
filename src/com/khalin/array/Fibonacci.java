package com.khalin.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] answer = solution(n);
        for(int i : answer){
            System.out.print(i + " ");
        }

        System.out.println();
        solution1(n);
    }

    private static int[] solution(int n){
        int[] answer = new int[n];

        answer[0] = 1;
        answer[1] = 1;
        for(int i=2; i<n; i++){
            answer[i] = answer[i-2] + answer[i-1];
        }

        return  answer;
    }

    private static void solution1(int n){
        int a = 1;
        int b = 1;
        int c;
        if(n == 1){
            System.out.print(a+ " ");
        }else if(n == 2){
            System.out.print(b+ " ");
        }else{
            System.out.print(a+" " + b+ " ");
            for(int i=2; i<n; i++){
                c = a + b;
                System.out.print(c+ " ");
                a = b;
                b = c;
            }
        }
    }
}

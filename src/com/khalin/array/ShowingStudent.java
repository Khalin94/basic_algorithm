package com.khalin.array;

import java.util.Scanner;

public class ShowingStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] student = new int[n];

        for(int i=0; i<n; i++){
            student[i] = sc.nextInt();
        }

        System.out.println("solution : " + solution(n, student));

    }

    private static int solution(int n, int[] student){
        int answer = 1;
        int max = student[0];

        for(int i=1; i<n; i++){
           if(student[i] > max){
               answer++;
               max = student[i];
           }
        }

        return answer;
    }
}

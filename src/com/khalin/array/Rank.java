package com.khalin.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 등수 구하기
* 입력되는 학생의 순서에 맞게 등수를 구하라.
* 같은 점수면 높은 등수로 처리된다.
* 92 92 80 이면
*  1  1  3  등으로 처리된다.
* 입력 예제
* 5
* 87 89 92 100 76
* 출력
* 4 3 2 1 5
*
* */
public class Rank {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] str = bf.readLine().split(" ");
        int[] score = new int[n];
        for(int i=0; i<n; i++){
            score[i] = Integer.parseInt(str[i]);
        }

        solution(n, score);
    }

    private static int[] solution(int n, int[] score){
        int[] answer = new int[n];

        for(int i=0; i<n; i++){
            int cnt = 1;
            for(int j=0; j<n; j++){
                if(score[i] < score[j]){
                    cnt++;
                }
            }
            answer[i] = cnt;
//            cnt = 1;
        }

        for(int i : answer){
            System.out.print(i + " ");
        }

        return answer;
    }
}

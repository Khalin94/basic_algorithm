package com.khalin.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TempCap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] student = new int[n][5];
        for(int i=0; i<n; i++){
            String[] tempStr = br.readLine().split(" ");
            for(int j=0; j<5; j++){
                student[i][j] = Integer.parseInt(tempStr[j]);
            }
        }

        System.out.println(solution(n, student)+1);

    }

    private static int solution(int n, int[][] student){
        int answer = 0;
        int min = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){ // 현재 카운트하고자 하는 학생
            int count = 0;
            for(int j=0; j<n; j++){ // 학생들을 한번씩 돌면서 카운트한다...
                if(i != j){
                    for(int k=0; k<5; k++) { // 학년
                        if (student[i][k] == student[j][k]) {
                            count++;
                            break;
                        }
                    }
                }
            }
            if(count > min){
                min = count;
                answer = i;
            }
        }

        return answer;
    }
}

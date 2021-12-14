package com.khalin.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
* 격자판의 합을 구해라
* 각 행의 합, 각 열의 합, 대각선의 합 중 가장 큰 수를 출력해라.
*
* 입력 예제
* 5
* 10 13 10 12 15
* 12 39 30 23 11
* 11 25 50 53 15
* 19 27 29 37 27
* 19 13 30 13 19
* 출력 예제
* 155
* */
public class GridCrossSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[][] grid = new int[n][n];
        for(int i=0; i<n; i++){
            String[] temp = bf.readLine().split(" ");
            int[] line = new int[n];
            for(int j=0; j<n; j++){
                line[j] = Integer.parseInt(temp[j]);
                grid[i][j] = line[j];
            }
        }

        System.out.println(solution(n, grid));
        System.out.println(solution1(n, grid));
    }

    private static int solution(int n, int[][] grid){
        int answer = 0;
        int[] rowSum = new int[n];
        int[] colSum = new int[n];
        int leftCrossSum = 0;
        int rightCrossSum = 0;
        for(int i=0; i<n; i++){
            int rowTmp = 0;
            int colTmp = 0;
            for(int j=0; j<n; j++){
                rowTmp += grid[i][j];
                colTmp += grid[j][i];
            }
            rowSum[i] = rowTmp;
            colSum[i] = colTmp;
        }
        for(int i=0; i<n; i++){
            leftCrossSum += grid[i][i];
        }

        int cnt = n-1;
        for(int i=0; i<n; i++){
            rightCrossSum += grid[i][cnt];
            cnt--;
        }

        List<Integer> list = new ArrayList<>();
        for(int i : rowSum){
            list.add(i);
        }
        for(int i: colSum){
            list.add(i);
        }
        list.add(rightCrossSum);
        list.add(leftCrossSum);

        for (Integer integer : list) {
            if (integer > answer) {
                answer = integer;
            }
        }
        /*for(int i=0; i< list.size(); i++){
            if(list.get(i) > answer){
                answer = list.get(i);
            }
        }*/

        return answer;
    }

    private static int solution1(int n, int[][] grid){
        int answer = Integer.MIN_VALUE;
        int rowSum;
        int colSum;
        for(int i=0; i<n; i++){
            rowSum = 0;
            colSum = 0;
            for(int j=0; j<n; j++){
                rowSum += grid[i][j];
                colSum += grid[j][i];
            }
            answer = Math.max(rowSum, answer);
            answer = Math.max(colSum, answer);
        }
        rowSum = 0;
        colSum = 0;
        for(int i=0; i<n; i++){
            rowSum += grid[i][i];
            colSum += grid[i][n-i-1];
        }
        answer = Math.max(rowSum, answer);
        answer = Math.max(colSum, answer);

        return answer;
    }
}

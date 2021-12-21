package com.khalin.array;

import java.util.Scanner;

public class Mountaintop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] grid = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                grid[i][j] = scan.nextInt();
            }
        }

        System.out.println(solution(n, grid));
    }

    private static int solution(int n, int[][] grid){
        int[][] newGrid = new int[n+2][n+2];

        for(int i=0; i<n+2; i++){
            newGrid[0][i] = 0;
            newGrid[n+1][i]=0;
            newGrid[i][0] = 0;
            newGrid[i][n+1] =0;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                newGrid[i][j] = grid[i-1][j-1];
            }
        }
       /* arraycopy를 사용해도 됨.
        for(int i=1; i<n+1; i++){
            System.arraycopy(grid[i - 1], 0, newGrid[i], 1, n + 1 - 1);
        }
        */

        int count = 0;

        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                if(newGrid[i-1][j] < newGrid[i][j] && newGrid[i][j-1] < newGrid[i][j] && newGrid[i+1][j] < newGrid[i][j] && newGrid[i][j+1] < newGrid[i][j]){
                    count++;
                }
            }
        }
/*
        System.out.println(count);


        for(int i=0; i<n+2; i++){
            for(int j=0; j<n+2;j++){
                System.out.print(newGrid[i][j] + " ");
            }
            System.out.println();
        }*/
        return count;
    }
}

package com.khalin.array;

import java.util.Scanner;

public class RockScissorPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }

        String[] answer =solution(n, a, b);

        for(String str : answer){
            System.out.println(str);
        }

        String[] answer2 = solution1(n, a, b);
        for(String str : answer2){
            System.out.println(str);
        }
    }

    private static String[] solution(int n, int[] a, int[] b){
        String[] answer = new String[n];

        for(int i=0; i<n; i++){
            if(a[i] == b[i]){
                answer[i] = "D";
            }else if(a[i] > b[i]){
                if(a[i] == 3 && b[i] == 1){
                    answer[i] = "B";
                }else {
                    answer[i] = "A";
                }
            }else if(a[i] < b[i]){
                if(a[i] == 1 && b[i] == 3){
                    answer[i] = "A";
                }else{
                    answer[i] = "B";
                }
            }

        }

        return answer;
    }

    private static String[] solution1(int n, int[] a, int[] b) {
       String[] answer = new String[n];
       for(int i=0; i<n; i++){
           if(a[i] == b[i]){
               answer[i] = "D";
           }else if(a[i] == 1 && b[i] == 3){
               answer[i] = "A";
           }else if(a[i] ==2 && b[i] == 1){
               answer[i] = "A";
           }else if(a[i] == 3 && b[i] == 2){
               answer[i] = "A";
           }else{
               answer[i] = "B";
           }
       }

       return answer;
    }
}

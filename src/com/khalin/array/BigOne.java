package com.khalin.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BigOne {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        String[] str;
        int[] arr = new int[n];

        str = bf.readLine().split(" ");

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        int[] answer = solution(n, arr);
        System.out.println("solution : ");
        for(int i : answer){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("solution1 : ");
        int[] answer1 = solution1(n, arr);

        for(int i : answer1){
            System.out.print(i + " ");
        }

    }

    private static int[] solution(int n, int[] arr){
        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);
        for(int i=0; i<n-1; i++){
            if(arr[i] < arr[i+1]){
               list.add(arr[i+1]);
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
    private static int[] solution1(int n, int[] arr){
        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]){
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}

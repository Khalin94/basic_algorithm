package com.khalin.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AddTwoArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] nArr = new int[n];
        String[] nArrStr = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            nArr[i] = Integer.parseInt(nArrStr[i]);
        }

        int m = Integer.parseInt(br.readLine());
        int[] mArr = new int[m];
        String[] mArrStr = br.readLine().split(" ");
        for(int i=0; i<m; i++){
            mArr[i] = Integer.parseInt(mArrStr[i]);
        }

//        int[] answer = solution(n, nArr, m, mArr);
        List<Integer> answer = solution(n, nArr, m, mArr);
        for(int i : answer){
            System.out.print(i + " ");
        }
    }

    private static List<Integer> solution(int n, int[] nArr, int m, int[] mArr){
        /*
        int[] answer = new int[n+m];
        for(int i=0 ; i<n; i++){
            answer[i] = nArr[i];
        }
        for(int i=0; i<m; i++){
            answer[i+n] = mArr[i];
        }
        Arrays.sort(answer);

        return answer;
        */

        /* two pointer */
        List<Integer> answer = new ArrayList<>();
        int p1=0;
        int p2=0;

        while(p1<n && p2<m){
            if(nArr[p1] < mArr[p2]){
                answer.add(nArr[p1]);
                p1++;
            }else{
                answer.add(mArr[p2]);
                p2++;
            }
        }

        while(p1<n){
            answer.add(nArr[p1]);
            p1++;
        }
        while(p2<m){
            answer.add(mArr[p2]);
            p2++;
        }


        return answer;
    }
}

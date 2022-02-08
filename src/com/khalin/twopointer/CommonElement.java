package com.khalin.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CommonElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] nStrArr = br.readLine().split(" ");
        int[] nArr = new int[n];
        for(int i=0; i<n; i++){
            nArr[i] = Integer.parseInt(nStrArr[i]);
        }

        int m = Integer.parseInt(br.readLine());
        String[] mStrArr = br.readLine().split(" ");
        int[] mArr = new int[m];
        for(int i=0; i<m; i++){
            mArr[i] = Integer.parseInt(mStrArr[i]);
        }


        List<Integer> answer = solution(n, nArr, m, mArr);
        for(int i : answer){
            System.out.print(i + " ");
        }

    }
    private static List<Integer> solution(int n, int[] nArr, int m, int[] mArr){
        List<Integer> answer = new ArrayList<>();

        /*
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(nArr[i] == mArr[j]){
                    answer.add(nArr[i]);
                    break;
                }
            }
        }

        Collections.sort(answer);
        */

        /* two pointer의 경우 오름차순 정렬이 되어 있어야 한다.*/
        Arrays.sort(nArr);
        Arrays.sort(mArr);
        int p1=0;
        int p2=0;

        while(p1<n && p2<m){
            if(nArr[p1] == mArr[p2]){
                answer.add(nArr[p1]);
                p1++;
                p2++;
            }else if(nArr[p1] < mArr[p2]){
                p1++;
            }else{
                p2++;
            }
        }

        return answer;
    }
}

package com.khalin.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReversePrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        String[] spN = bf.readLine().split(" ");

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(spN[i]);
        }

        int[] answer =solution(n, arr);

        for(int i : answer){
            System.out.print(i + " ");
        }

        System.out.println();
        int[] answer1 = solution1(n, arr);

        for(int i : answer1){
            System.out.print(i + " ");
        }

    }

    private static int[] solution(int n, int[] arr){
        int[] reverseArr = new int[n];
        String[] reverse = new String[n];

        for(int i=0; i<n; i++){
            reverse[i] = String.valueOf(arr[i]);
            reverseArr[i] = Integer.parseInt(new StringBuilder(reverse[i]).reverse().toString());
        }


        List<Integer> tmp = new ArrayList<>();
        for (int k : reverseArr) {
            if (k == 1) {
                continue;
            }

            // if(reverseArr[i] == 2){
            //     tmp.add(reverseArr[i]);
            // }

            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(k); j++) {
                if ((k % j) == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                //  System.out.print(reverseArr[i] + " ");
                tmp.add(k);
            }
        }

        int[] answer = new int[tmp.size()];
        for(int i=0 ; i<tmp.size(); i++){
            answer[i] = tmp.get(i);
        }

        return answer;
    }


    private static int[] solution1(int n, int[] arr){
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            int tmp = arr[i];
            int res = 0;
            // ????????? ????????? ????????? ???.
            // t = tmp%10 : ???????????? ??? ?????? ??? ???????????? ????????? ??????.
            // res += res*10+t : ????????? ????????? ?????? res??? ????????????. ?????? ?????? ??? ?????? ????????? res??? ?????????.
            // tmp = tmp / 10 : res??? ????????? ?????? ?????? tmp??? ???????????? ?????? ?????? ??? ?????? ????????? ??????.
            while(tmp > 0){
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }

            if(isPrime(res)){
                list.add(res);
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    private static boolean isPrime(int num){
        if(num == 1) {
            return false;
        }
//        for(int i=2; i<num; i++){
          for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}

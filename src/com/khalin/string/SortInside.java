package com.khalin.string;

import java.util.Arrays;
import java.util.Scanner;

public class SortInside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(solution(num));
    }

    private static int solution(int num){
        String str = String.valueOf(num);
        char[] chs = str.toCharArray();

        Arrays.sort(chs);
        StringBuilder sb = new StringBuilder(String.valueOf(chs));
        sb.reverse();

        String result = sb.toString();

        return Integer.parseInt(result);
    }
}

package com.khalin.string;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FileClean {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

//        int n = sc.nextInt();
        int n = Integer.parseInt(bf.readLine());
        String[] files = new String[n];
        for(int i=0; i<n; i++){
//           files[i] = sc.next();
           files[i] = bf.readLine();
        }
        String[] answer = solution(n, files);

        for(String str : answer) {
            System.out.println(str);
        }

    }

    private static String[] solution(int n, String[] files){
        String[] ext = new String[n];

        for(int i=0;i<n; i++){
            String[] temp = files[i].split("\\.");
            ext[i] = temp[1];
        }

        Set<String> set = new LinkedHashSet<>(Arrays.asList(ext));
        Object[] setToArr = set.toArray();
        Arrays.sort(setToArr);

        String[] answer = new String[set.size()];

        int count = 0;
        for(int i=0; i<setToArr.length; i++){
            for (String s : ext) {
                if (setToArr[i].equals(s)) {
                    count++;
                }
            }
            answer[i] = setToArr[i] + " " + count;
            count = 0;
        }

        return answer;
    }
}

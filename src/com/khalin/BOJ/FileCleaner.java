package com.khalin.BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FileCleaner {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] ext = new String[n];

        for(int i=0; i<n; i++){
            ext[i] = br.readLine().split("\\.")[1];
        }

        solution(n, ext);

    }

    private static void solution(int n, String[] ext){
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(!map.containsKey(ext[i])){
                map.put(ext[i], 1);
            }else{
                map.put(ext[i], map.get(ext[i]) + 1);
            }
        }
        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }
    }
}

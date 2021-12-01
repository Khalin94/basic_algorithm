package com.khalin.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StackImpl {
    static int n;
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc2 = new Scanner(System.in);

        n = Integer.parseInt(bf.readLine());
        for(int i=0; i<n; i++){
//            String oper = sc.nextLine();
            String oper = bf.readLine();

            solution(oper);
        }
    }

    private static void solution(String oper) {
        String[] operArr = oper.split(" ");
        String op = operArr[0];

        if (op.equals("push")) {
           list.add(Integer.valueOf(operArr[1]));
        }else if (op.equals("pop")) {
            if(list.isEmpty()){
                System.out.println("-1");
            }else{
                System.out.println(list.get(list.size()-1));
                list.remove(list.size()-1);
            }
        }else if (op.equals("size")) {
            System.out.println(list.size());
        }else if (op.equals("empty")) {
           if(list.isEmpty()){
               System.out.println("1");
           }else{
               System.out.println("0");
           }
        }else if(op.equals("top")){
           if(list.isEmpty()){
               System.out.println("-1");
           }else {
               System.out.println(list.get(list.size() -1));
           }
        }

    }
}

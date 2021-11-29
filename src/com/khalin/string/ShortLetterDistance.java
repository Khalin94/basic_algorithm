package com.khalin.string;

import java.util.Scanner;

public class ShortLetterDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String c = sc.next();

        int[] answer = solution(str, c.charAt(0));
        for(int i : answer){
            System.out.print(i + " ");
        }
    }
    private static int[] solution(String str, char c){
       int[] answer = new int[str.length()];
       int p = 100;

       for(int i=0; i<str.length(); i++){
           if(str.charAt(i) == c){
               p=0;
               answer[i] = p;
           }else{
               p++;
               answer[i] = p;
           }
       }
       p=100;
       for(int i=str.length()-1; i>=0; i--){
          if(str.charAt(i) == c){
              p=0;
          }else{
              if(answer[i] > p) {
                  p++;
                  answer[i] = p;
              }
          }
       }

       return answer;
    }

    private static int[] solution1(String str, char c){
        int[] answer = new int[str.length()];
        char[] chs = str.toCharArray();
        int tmp = 100;

        for(int i=0; i<chs.length; i++){
            if(chs[i]==c){
                answer[i] = 0;
                tmp = answer[i]+1;
            }else{
                answer[i] = tmp;
                tmp++;
            }
        }

        tmp = 100;
        for(int i=chs.length-1; i>=0; i--){
           if(chs[i]==c){
               answer[i] = 0;
               tmp = answer[i]+1;
           }else{
               if(answer[i] > tmp) {
                   answer[i] = tmp;
                   tmp++;
               }
           }
        }

        return answer;
    }
}

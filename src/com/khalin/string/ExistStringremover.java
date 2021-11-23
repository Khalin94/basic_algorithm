package com.khalin.string;

import java.util.*;

public class ExistStringremover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
        System.out.println(solution1(str));
    }

    private static String solution(String str){
        String answer="";
        Set<Character> set = new LinkedHashSet<>();
        char[] chs = str.toCharArray();

        for(char ch : chs) {
            set.add(ch);
        }

        /*Iterator<Character> iter = set.iterator();
        while(iter.hasNext()){
            answer += iter.next();
        }*/
        for (Character character : set) {
            answer += character;
        }

        return answer;
    }

    private static String solution1(String str){
        String answer="";
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i) + " index:" + i + " strIndex:" + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i){
                answer += str.charAt(i);
            }
        }

        return answer;
    }
}

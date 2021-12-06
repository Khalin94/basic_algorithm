package com.khalin.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eratos {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        /*System.out.println(solution(Integer.parseInt(bf.readLine())));
        System.out.println(solution1(Integer.parseInt(bf.readLine())));
        System.out.println(solution2(Integer.parseInt(bf.readLine())));*/
        System.out.println(solution3(Integer.parseInt(bf.readLine())));
    }
/* for문을 돌려서 다음 검색 때 해당 값을 체크하지 않도록 해야한다.

    private static int solution(int n){
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for(int i=2; i<=n; i++){
            if((i % 2) == 0){
                if(i == 2){
                    list.add(i);
                }
               continue;
            }else if((i%3) == 0){
                if(i == 3){
                    list.add(i);
                }
                continue;
            }else if((i%5) ==0 ){
                if(i == 5){
                    list.add(i);
                }
                continue;
            }else if((i%7)==0){
                if(i == 7){
                    list.add(i);
                }
                continue;
            }

            list.add(i);
        }

        answer = list.size();

        return answer;
    }
    private static int solution1(int n){
        int answer;
        List<Integer> list = new ArrayList<>();

        for(int i=2; i<=n; i++){
            if(i == 2 || i == 3 || i == 5 || i == 7){
                list.add(i);
            }else if(!((i%2==0) || (i%3==0) || (i%5==0) || (i%7==0))){
                list.add(i);
            }
        }
        answer = list.size();

        return answer;
    }
    */
    private static int solution2(int n){
        boolean[] b = new boolean[n+1];

        b[0] = true;
        b[1] = true;

        for(int i=2; i<=n; i++){
           if(b[i]){
               continue;
           }

           for(int j= i*2; j<=n; j=j+i){
               b[j] = true;
           }
        }

        int answer=0;
        for(int i=0; i<n; i++){
            if(!b[i]){
                answer++;
            }
        }

        return answer;
    }

    private static int solution3(int n){
        int answer = 0;
        int[] ch = new int[n+1];

        for(int i=2; i<=n; i++){
            System.out.print("ch["+i+"] : " + ch[i] + ", ");
            if(ch[i] == 0){
                answer++;
                for(int j=i; j<=n; j+=i){
                    ch[j] = 1;
                }
            }
        }

        return answer;
    }
}

package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class B9506 {

    public static void main(String[] args) {
        /**
         * https://www.acmicpc.net/problem/9506 약수들의 합
         */

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while( (n = sc.nextInt()) > -1 ){
            int sum = 0;
            for(int i=1; i<n; i++){

                if(n%i == 0){
                    sum += i;
                    list.add(i);
                }
            }

            if( sum == n ) {
                sb.append(n + " = ");
                for(int o : list){
                    sb.append(o + " + ");
                }
                sb.delete(sb.length() -2, sb.length());
                sb.append("\n");
            } else {
                sb.append(n + " is NOT perfect.\n");
            }

            list.clear();
        }

        System.out.println(sb.toString());
    }
}

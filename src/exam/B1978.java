package exam;

import java.io.IOException;
import java.util.Scanner;

public class B1978 {

    public static void main(String[] args) throws IOException {
        /**
         * https://www.acmicpc.net/problem/1978 소수찾기
         */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = 0;
        for(int i=0; i<N; i++){
            int input = sc.nextInt();

            if(input == 1) continue;

            for(int j=2; j<=input; j++){
                if(j == input) result++;

                if(input%j == 0) break;

            }
        }

        System.out.println(result);
    }
}

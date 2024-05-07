package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5086 {
    public static void main(String[] args) throws IOException {
        /**
         * https://www.acmicpc.net/problem/5086 배수와 약수
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while( !"0 0".equals(s = br.readLine()) ){
            StringTokenizer st = new StringTokenizer(s, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            /**
             * 각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의
             * 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.
             */
            if(b%a == 0) System.out.println("factor");
            else if(a%b == 0) System.out.println("multiple");
            else System.out.println("neither");
        }

    }
}

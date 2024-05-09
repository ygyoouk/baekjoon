package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B2501 {
    public static void main(String[] agrs) throws IOException {
        /*
         * https://www.acmicpc.net/problem/2501 약수구하기
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=N; i++){
            if(N%i == 0) list.add(i);
        }

        if(list.size() < K){
            System.out.println(0);
        } else {
            System.out.println(list.get(K-1));
        }

    }
}

package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken()); // 낮에 올라갈수 있는 M
        int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 M
        int V = Integer.parseInt(st.nextToken()); // 총 올라갈 거리

        if( V-A == 1) V++;
        System.out.print( (V - B - 1) / (A - B) + 1 );
    }
}

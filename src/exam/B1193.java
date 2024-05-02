package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1193 {
    public static void main(String[] args) throws IOException {
        /**
         * https://www.acmicpc.net/problem/1193 분수찾기
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int line = 1;

        while(X > line){
            X -= line;
            line++;
        }

        if(line % 2 == 1)
            System.out.print( (line+1-X) + "/" + X );
        else
            System.out.print( X + "/" + (line+1-X) );
    }
}

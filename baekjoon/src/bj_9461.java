import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_9461 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] cache = new long[101];
        cache[1] = 1;
        cache[2] = 1;
        cache[3] = 1;
        cache[4] = 2;
        cache[5] = 2;

        for (int i = 6; i < 101; i++) {
            cache[i] = cache[i-1] + cache[i-5];
        }

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            System.out.println(cache[a]);
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[][] f = new int[41][2];
        f[0][0] = 1;
        f[1][1]= 1;
        for (int i = 2; i < 41; i++) {
            for (int j = 0; j < 2; j++) {
                f[i][j] = f[i-1][j] + f[i -2][j];
            }
        }
        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(br.readLine());
            System.out.println(f[b][0]+ " " + f[b][1]);
        }
    }
}

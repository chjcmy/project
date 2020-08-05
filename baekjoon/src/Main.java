import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[][] dp = new int[n][n];

        StringTokenizer tokenizer;
        for(int i=0 ; i<n ; i++){
            tokenizer = new StringTokenizer(bf.readLine());
            for(int j=0 ; j<i+1 ; j++){
                dp[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        for(int i=1 ; i<n ; i++){
            for(int j=0 ; j<i+1 ; j++){
                dp[i][j] += Math.max((j==0) ? 0 : dp[i-1][j-1], dp[i-1][j]);
            }
        }

        Arrays.sort(dp[n-1]);
        System.out.println(dp[n-1][n-1]);
    }

}

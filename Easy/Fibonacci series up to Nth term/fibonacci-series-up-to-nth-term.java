//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int ans[] = obj.Series(n);
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

    int[] Series(int n) {
        // code here
        final int MOD = 1_000_000_007;
        if(n==0) return new int[]{0};
        int[] fibSeries = new int[n + 1];

        // Set the first two Fibonacci numbers
        fibSeries[0] = 0;
        fibSeries[1] = 1;

        // Calculate the Fibonacci series up to the nth term
        for (int i = 2; i <= n; i++) {
            fibSeries[i] = (int)((fibSeries[i - 1] + (long)fibSeries[i - 2])% MOD);
        }

        return fibSeries;
    }
}
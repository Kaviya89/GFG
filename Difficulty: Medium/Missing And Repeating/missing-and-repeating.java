//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int hash[] = new int[n+1];
        
        for(int i=0; i<n; i++){
            hash[arr[i]]++;
        }
        int repeat = -1, miss = -1;
        for(int i=1; i<=n; i++){
            if(hash[i]==2) repeat = i;
            else if(hash[i]==0) miss = i;
            
            if(repeat !=-1 && miss!=-1) break;
        }
        int ans[] = {repeat, miss};
        return ans;
    }
}
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            obj.print_divisors(n);
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static void print_divisors(int n) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        // code here
        if(n<0){
            return;
        }
        for (int i = 1; i*i <=n; i++) {
            if(n%i==0){ 
               ans.add(i);
               if(i!=n/i){
                   ans.add(n/i);
               }
            }
        }
        Collections.sort(ans);
        for(int b:ans){
            System.out.print(b+" ");
        }
    }
}

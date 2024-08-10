//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}

// } Driver Code Ends




// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int floor = -1;
        int ceil = -1; 
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] <= x && floor <= arr[i]){
                floor = arr[i];
            }
            if(arr[i] >= x ){
                if(ceil == -1)ceil = arr[i];
                else if(ceil >= arr[i])ceil = arr[i];
            }
        } 
        return new int[]{floor,ceil};
    }
}

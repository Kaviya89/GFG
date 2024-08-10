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
        // code here
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        int f = -1;
        int c = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] < x){
                f = arr[mid];
                start = mid+1;
            }
            else if(arr[mid] > x){
                c = arr[mid];
                end = mid-1;
                }
            else{
                return new int[] {x , x};
            }
            }
            
    return new int[] {f , c};
    }
}

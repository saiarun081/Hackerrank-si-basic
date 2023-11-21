import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        Solution sol = new Solution();
        b=sol.leftAndRightSum(a);
        
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
        }
    }
    
    public int[] leftAndRightSum(int[] arr){
        int left=0;
        int right= Arrays.stream(arr).sum();
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            right-=arr[i];
            ans[i]=Math.abs(left-right);
            left+=arr[i];
        }
        return ans;
    }
}
        

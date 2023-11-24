import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        Solution sol = new Solution();
        sol.matrixSum(a);
    }
    
    public void matrixSum(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;

        // Calculate and print row-wise sum
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < m; j++) {
                rowSum += arr[i][j];
            }
            System.out.println(rowSum);
        }
    }
}

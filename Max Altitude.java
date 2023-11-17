import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int altitude = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            altitude=altitude+arr[i];
            max=Math.max(max,altitude);
            }
        System.out.println(max);
    }
}

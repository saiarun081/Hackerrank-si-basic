import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[]=new long[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextLong();
        }
        for(int j=n-1; j>=0 ;j--){
            System.out.print(arr[j]+" ");
        }
    }
}

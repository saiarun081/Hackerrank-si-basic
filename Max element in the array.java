import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int arrSize = Integer.parseInt(sc.nextLine());
        int arr[] = new int [arrSize];
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arrSize; i++){
            arr[i]=Integer.parseInt(sc.nextLine());
            if (arr[i] > max){
                max=arr[i];    
            }
                    }
        System.out.println(max);
       
        
    }
}

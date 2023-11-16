import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[]=new int[n];
        for (int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int count = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                uniqueList.add(array[i]);
            }
        }
        for (int element : uniqueList) {
            System.out.print(element + " ");
        }

    }
}

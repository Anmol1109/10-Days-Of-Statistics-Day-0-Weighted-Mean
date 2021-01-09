import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int i;
        int n = scan.nextInt();
        int array1[] = new int[n];
        int array2[] = new int[n];
        for(i = 0;i < n;i++)
            array1[i] = scan.nextInt();
        for(i = 0;i < n;i++)
            array2[i] = scan.nextInt();
        double sum1 = 0,sum2 = 0;
        for(i = 0;i < n;i++)
            {
            sum1 += array1[i]*array2[i];
            sum2 += array2[i];
            }
            System.out.println(String.format("%.1f",sum1 / sum2));
    }
}
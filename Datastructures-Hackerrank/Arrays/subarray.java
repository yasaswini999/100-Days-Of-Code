//https://www.hackerrank.com/challenges/java-negative-subarray/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         long [] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int c=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                // for(int k=i;k<=j;k++){
                    sum+=arr[j];
                // }
                 if( sum<0){
                c++;
                }
            }
           
            
        }
        System.out.println(c);
          
           
       
        
    }
}

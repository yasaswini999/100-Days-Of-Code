//https://www.hackerrank.com/challenges/java-strings-introduction/problem


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int m = A.length();
        int n = B.length();
        System.out.println(m+n);
        if(A.compareTo(B) >0) System.out.println("Yes");
        else System.out.println("No");
        String newA = A.substring(0,1).toUpperCase();
        String newB = B.substring(0,1).toUpperCase();
        System.out.println(newA+A.substring(1)+" "+newB+B.substring(1) );
        
        
        
    }
}

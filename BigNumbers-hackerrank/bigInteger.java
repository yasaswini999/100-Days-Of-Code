//https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
      
        
            
            BigInteger a =  sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger add = a.add(b);
        BigInteger pro = a.multiply(b);
        System.out.println(add+"\n"+pro);
        
         
        
    }
}

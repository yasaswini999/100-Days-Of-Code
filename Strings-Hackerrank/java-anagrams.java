//https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=false

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        char [] A = a.toCharArray();
        char[] B = b.toCharArray();
        java.util.Arrays.sort(A);
        java.util.Arrays.sort(B);
        boolean res = false;
        if(java.util.Arrays.equals(A, B)) res = true;
        return res;
        
    }


  
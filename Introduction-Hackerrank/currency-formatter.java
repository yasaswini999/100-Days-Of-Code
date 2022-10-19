//https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        NumberFormat nF1 = NumberFormat.getCurrencyInstance(Locale.US);
     Locale IND = new Locale("en","in");
     NumberFormat nF2 = NumberFormat.getCurrencyInstance(IND);
     NumberFormat nF3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
     NumberFormat nF4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);

    scanner.close();

    System.out.println("US: " + nF1.format(payment));
    System.out.println("India: " + nF2.format(payment));
    System.out.println("China: " + nF3.format(payment));
    System.out.println("France: " + nF4.format(payment));
    }
}


//https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
       BigInteger num = new BigInteger(n);
       if(n.length()<=100&& num.isProbablePrime(1)){
           System.out.println("prime");
       }
       else{
           System.out.println("not prime");
       }
       

        bufferedReader.close();
    }
}


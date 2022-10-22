//https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
     // sorting
     for(int i=1;i<n;i++){
         for(int j=i;j>=1;j--){
             if(new BigDecimal(s[j]).compareTo(new BigDecimal(s[j-1]))>0){
                  String temp = s[j];
                    s[j] = s[j-1];
                    s[j-1] = temp;
             }
         }
     }
        

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}

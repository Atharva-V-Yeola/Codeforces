import java.io.*;
import java.util.*;

public class GCDsum {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-->0){
            long n = sc.nextLong();
            long sum = digitSum(n);
            if(isPrime(n) || isPrime(sum)){
                n++;
                sum++;
            }
        }
        sc.close();
    }
    static long digitSum(long n){
        long temp=n;
        long sum = 0;
        while(temp>0){
            sum=temp%10;
            temp/=10;
        }
        return sum;
    }
    static boolean isPrime(long n){
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
}



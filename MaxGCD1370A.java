import java.io.*;
import java.util.*;
public class MaxGCD1370A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int val = sc.nextInt();
            if(val%2==0) System.out.println(val/2);
            else System.out.println((val-1)/2);
        }
    }
}

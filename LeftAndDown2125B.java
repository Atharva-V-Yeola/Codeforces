import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class LeftAndDown2125B {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (n-->0) {
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            //System.out.println(a+" "+b+" "+k);
            if(a<=k && b<=k) sb.append(1).append('\n');
            else{
                long hcf = gcd(a, b); 
                long qa = a/hcf;
                long qb = b/hcf;
                if(qa<=k && qb<=k) sb.append(1).append('\n');
                else sb.append(2).append('\n');
            }
        }
        System.out.println(sb);
    }
    public static long gcd(long a, long b){
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

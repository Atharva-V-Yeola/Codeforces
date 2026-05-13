import java.util.*;
import java.io.*;

public class MarvoloGauntsRing855B {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        //StringBuilder sb = new StringBuilder();
        long ans = 0;    
            long p = Long.parseLong(st.nextToken());
            long q = Long.parseLong(st.nextToken());
            long r = Long.parseLong(st.nextToken());
            st = new StringTokenizer(br.readLine());
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = Long.parseLong(st.nextToken());
            }
            Arrays.sort(arr);
            long[] temp = {p, q, r};

            for(int i = 0;i<3;i++){
                if(temp[i]>0) ans+=temp[i]*arr[n-1];
                else ans+=temp[i]*arr[0];
            }
        System.out.println(ans);
    }
}
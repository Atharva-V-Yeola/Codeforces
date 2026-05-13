import java.io.*;
import java.util.*;

public class NoCasinointheMountains2126B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(st.nextToken());
        while (tc-->0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int count = 1;
            int pt = 0;
            for(int i=0;i<k;i++){
                if(arr[i] == 1){
                    count = 0;
                    pt = i;
                    break;
                }
                
            }
            if(k+pt<n){
                for(int i=pt;i<k+pt;i++){
                    if(arr[i] == 1) count += 0;
                    break;
                }
            }
        }
        System.out.println(sb);
        
    }
}

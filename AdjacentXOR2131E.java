import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AdjacentXOR2131E {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long[] a = new long[n];
            long[] b = new long[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) a[i] = Long.parseLong(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) b[i] = Long.parseLong(st.nextToken());
            
            boolean possible = true;
            if(a[n-1]!=b[n-1]) possible = false;
            else{
                for(int i=n-2;i>=0;i--){
                    if(a[i]!=b[i]){
                        if((a[i]^b[i+1])!=b[i] && (a[i]^a[i+1])!=b[i]){
                            possible = false;
                            break;
                        }
                    }
                }
            }
            sb.append(possible ? "YES\n":"NO\n");
        }
        System.out.print(sb);
    }
}

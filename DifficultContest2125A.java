import java.io.*;
//import java.util.*;

public class DifficultContest2125A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            String s = br.readLine();
            StringBuilder nonT = new StringBuilder();
            int Tcnt = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == 'T') {
                    Tcnt++;
                } else {
                    nonT.append(ch);
                }
            }
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < Tcnt; i++) {
                ans.append('T');
            }
            ans.append(nonT);
            sb.append(ans).append('\n');
            n--;
        }
        System.out.print(sb);
    }
}

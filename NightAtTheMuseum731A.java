import java.util.Scanner;

public class NightAtTheMuseum731A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int ans = 0;
        char cur = 'a';
        for(int i=0;i<n;i++){            
            char nxt = s.charAt(i);
            int dif1 = Math.abs(cur-nxt);
            int dif2 = Math.abs(dif1-26);
            ans+=Math.min(dif1, dif2);
            cur = s.charAt(i);
        }
        System.out.println(ans);
    }
}

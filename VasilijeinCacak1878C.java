import java.util.Scanner;

public class VasilijeinCacak1878C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();

            long min = k * (k + 1) / 2;
           
            long max = (n * (n + 1) / 2) - ((n - k) * (n - k + 1) / 2);

            if (x >= min && x <= max) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.print(sb);
        sc.close();
    }
}

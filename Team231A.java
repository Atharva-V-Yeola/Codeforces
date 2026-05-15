import java.util.Scanner;

public class Team231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while (n>0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if(a+b+c > 1) ans++;
            n--;
        }
        System.out.println(ans);
    }
}

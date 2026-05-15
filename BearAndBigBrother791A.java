import java.util.Scanner;

public class BearAndBigBrother791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b= sc.nextInt();
        int ans = 0;
        while (b>=a) {
            ans++;
            b*=2;
            a*=3;
        }
        System.out.println(ans);
        sc.close();
    }
}

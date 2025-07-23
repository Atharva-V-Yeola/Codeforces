import java.util.Scanner;

public class Sakurako {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            long l = sc.nextLong();
            long r = sc.nextLong();
            System.out.println(goodArrayLength(l,r));
            t--;
        }
        sc.close();
    }
    public static long goodArrayLength(long l,long r){
        long ans = 1;
        long diff = r-l;
        long i = 1;
        while (diff!=0 && diff>=i) {
            diff-=i;
            i++;
            ans++;
        }
        return ans;
    }
}

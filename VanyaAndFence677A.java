import java.util.Scanner;

public class VanyaAndFence677A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int ans = 0;
        //int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int chk = sc.nextInt();
            if(chk>h) ans+=2;
            else ans+=1;
        }
        System.out.println(ans);
        sc.close();
    }
}

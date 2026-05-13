import java.util.Scanner;

public class Bulbs615A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] arr = new boolean[m];
        while(n>0){
            n--;
            int a = sc.nextInt();
            while(a>0){
                int u = sc.nextInt();
                arr[u%m]=true;
                a--;
            }
        }
        boolean flg = true;
        for(int i=0;i<m;i++){
            if(!arr[i]){
                flg = false;
                break;
            }
        }
        if(flg) System.out.println("YES");
        else System.out.println("NO");
        sc.close();;
    }
}

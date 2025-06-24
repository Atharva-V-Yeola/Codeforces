import java.util.Scanner;

public class kefa580A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(ans(n,arr));
        sc.close();
    }
    public static int ans(int n,int[] arr){
        int max = Integer.MIN_VALUE;
        int l = 0;
        int r=0;
        while (r<n-1) {
            if(arr[r]<=arr[r+1]) r++;
            else{
                max = Math.max(max,r-l+1);
                r++;
                l=r;
            }
        }
        max = Math.max(max,r-l+1);
        return max;
    }
}

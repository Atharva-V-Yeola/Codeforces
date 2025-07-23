import java.util.Scanner;

public class AliceSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            int[] arr = new int[n*2];
            int one = 0;
            int zero = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i]==0) zero++;
                else one++;
            }
            int[] ans = MinMax(n,arr,one,zero);
            for(int i = 0;i<2;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();   
            t--;
        }
        sc.close();
    }
    public static int[] MinMax(int n,int[] arr,int one,int zero){
        int[] ans = new int[2];
        if(zero==0 || one==0){
            ans[0] = 0;
            ans[1] = 0;
            return ans;
        }
        if(one == zero){
            ans[0] = 1;
            ans[1] = one;
            return ans;
        }
        else{
            ans[0] = 0;
            ans[1] = one;
            return ans;
        }
        //return ans;
    }
}

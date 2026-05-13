import java.util.Scanner;

public class EasterEggs78B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = {'G','B','I','V'};
        StringBuilder sb = new StringBuilder();
        sb.append("ROYGBIV");
        int temp = 8;
        while(temp<=n){
            sb.append(arr[temp%4]);
            temp++;
        }
        System.out.println(sb);
        sc.close();
    }
}

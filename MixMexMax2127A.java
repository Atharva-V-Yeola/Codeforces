import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class MixMexMax2127A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (tc-->0) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            int temp = n;
            while (temp-->0) {
                list.add(sc.nextInt());
            }
            if(list.contains(0)) sb.append("NO\n");
            else{
                HashSet<Integer> set = new HashSet<>();
                for(int i=0;i<n;i++){
                    int a = list.get(i);
                    if(a!=-1){
                        set.add(a);
                    }
                }
                if(set.size()>1) sb.append("NO\n");
                else sb.append("YES\n");    
            }
        }
        System.out.println(sb);
        sc.close();
    }
}

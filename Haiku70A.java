import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Haiku70A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o = 0;
        int se = 0;
        int th = 0;
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        Collections.addAll(set,'a','e','i','o','u');
        for(int i=0;i<s1.length();i++){
            if(set.contains(s1.charAt(i))) o++;
        }
        for(int i=0;i<s2.length();i++){
            if(set.contains(s2.charAt(i))) se++;
        }
        for(int i=0;i<s3.length();i++){
            if(set.contains(s3.charAt(i))) th++;
        }
        if(o==5 && se == 7 && th==5) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}

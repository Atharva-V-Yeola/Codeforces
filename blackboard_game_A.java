import java.util.Scanner;

public class blackboard_game_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int input = sc.nextInt();
            if(input%4==0) System.out.println("Bob");
            else System.out.println("Alice");
        }
        sc.close();
    }
}

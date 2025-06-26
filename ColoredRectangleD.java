import java.util.*;

public class ColoredRectangleD {
    public static void main(String[] args) {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int[] red = new int[r];
        int[] green = new int[g];
        int[] blue = new int[b];
        for(int i = 0;i<r;i++){
            red[i] = sc.nextInt();
        }
        for(int i = 0;i<g;i++){
            green[i] = sc.nextInt();
        }
        for(int i = 0;i<b;i++){
            blue[i] = sc.nextInt();
        }
        Arrays.sort(red);
        Arrays.sort(green);
        Arrays.sort(blue);
        System.out.println(maxSum(r-1, g-1, b-1, red, green, blue));
        sc.close();
    }
    public static int maxSum(int r,int g,int b,int[] red, int[] green, int[] blue){
        if((r<0 && g<0)||(r<0 && b<0)||(g<0 && b<0)) return 0;
         int m1 = 0, m2 = 0, m3 = 0;

        if (r >= 0 && g >= 0) {
            m1 = red[r] * green[g] + maxSum(r - 1, g - 1, b, red, green, blue);
        }
        if (r >= 0 && b >= 0) {
            m2 = red[r] * blue[b] + maxSum(r - 1, g, b - 1, red, green, blue);
        }
        if (g >= 0 && b >= 0) {
            m3 = green[g] * blue[b] + maxSum(r, g - 1, b - 1, red, green, blue);
        }

        return Math.max(m1, Math.max(m2, m3));
        
    }
}

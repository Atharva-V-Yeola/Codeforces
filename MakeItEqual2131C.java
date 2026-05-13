import java.util.*;

public class MakeItEqual2131C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] s = new long[n];
            long[] t = new long[n];
            for (int i = 0; i < n; i++) s[i] = sc.nextLong();
            for (int i = 0; i < n; i++) t[i] = sc.nextLong();

            Map<Long, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long key = t[i] % k;
                map.put(key, map.getOrDefault(key, 0) + 1);
            }

            boolean possible = true;
            for (int i = 0; i < n; i++) {
                long key = s[i] % k;
                Long foundKey = null;
                if (map.containsKey(key)) foundKey = key;
                else if (map.containsKey(key + k)) foundKey = key + k;
                else if (map.containsKey(Math.abs(key - k))) foundKey = Math.abs(key - k);

                if (foundKey != null) {
                    int count = map.get(foundKey) - 1;
                    if (count == 0) map.remove(foundKey);
                    else map.put(foundKey, count);
                } else {
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
        sc.close();
    }
}

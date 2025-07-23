import java.io.*;
import java.util.*;

public class Domino_1702E{

    public static boolean isBipartite(List<List<Integer>> graph, int maxNode) {
        int[] color = new int[maxNode + 1]; 

        for (int i = 1; i <= maxNode; i++) {
            if (color[i] != 0) continue;

            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            color[i] = 1;

            while (!queue.isEmpty()) {
                int u = queue.poll();
                for (int v : graph.get(u)) {
                    if (color[v] == 0) {
                        color[v] = -color[u];
                        queue.offer(v);
                    } else if (color[v] == color[u]) {
                        return false; 
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); 

            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }

            boolean valid = true;
            int[] freq = new int[n + 1];

            for (int i = 0; i < n; i++) {
                String[] parts = br.readLine().split(" ");
                int a = Integer.parseInt(parts[0]);
                int b = Integer.parseInt(parts[1]);

                if (a == b) valid = false;

                freq[a]++;
                freq[b]++;

                if (freq[a] > 2 || freq[b] > 2) {
                    valid = false; 
                }

                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            if (!valid) {
                output.append("NO\n");
                continue;
            }

            if (isBipartite(graph, n)) {
                output.append("YES\n");
            } else {
                output.append("NO\n");
            }
        }

        System.out.print(output);
    }
}

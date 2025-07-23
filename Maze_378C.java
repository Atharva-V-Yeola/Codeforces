import java.io.*;
import java.util.*;

public class Maze_378C{
    static int n, m, k;
    static char[][] grid;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        // Fast input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // Read n, m, k
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        
        grid = new char[n][m];
        visited = new boolean[n][m];

        // Reading the grid
        int totalEmpty = 0;
        for (int i = 0; i < n; i++) {
            grid[i] = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '.') {
                    totalEmpty++;
                }
            }
        }

        // We need to visit totalEmpty - k cells
        int cellsToKeep = totalEmpty - k;

        // Start BFS from the first empty cell found
        outer:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '.') {
                    bfs(i, j, cellsToKeep);
                    break outer;
                }
            }
        }

        // Now mark unvisited empty cells as X
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '.' && !visited[i][j]) {
                    grid[i][j] = 'X';
                }
            }
        }

        // Print the resulting grid
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write(grid[i]);
            bw.newLine();
        }
        bw.flush();
    }

    static void bfs(int startX, int startY, int cellsToKeep) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        int count = 1;

        while (!queue.isEmpty() && count < cellsToKeep) {
            int[] cur = queue.poll();
            int x = cur[0], y = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (isValid(nx, ny) && !visited[nx][ny] && grid[nx][ny] == '.') {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                    count++;
                    if (count >= cellsToKeep) break;
                }
            }
        }
    }

    static boolean isValid(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }
}

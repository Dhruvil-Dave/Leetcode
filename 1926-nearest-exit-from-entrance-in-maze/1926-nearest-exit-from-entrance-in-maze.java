class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        int[] dirs = {0, 1, 0, -1, 0};
        int ans = 0;
        Queue<int[]> q = new ArrayDeque<>(Arrays.asList(new int[] {entrance[0], entrance[1]}));
        boolean[][] seen = new boolean[m][n];
        seen[entrance[0]][entrance[1]] = true;

        while (!q.isEmpty()) {
          ans++;
          for (int sz = q.size(); sz > 0; --sz) {
            int i = q.peek()[0];
            int j = q.poll()[1];
            for (int k = 0; k < 4; ++k) {
              final int x = i + dirs[k];
              final int y = j + dirs[k + 1];
              if (x < 0 || x == m || y < 0 || y == n)
                continue;
              if (seen[x][y] || maze[x][y] == '+')
                continue;
              if (x == 0 || x == m - 1 || y == 0 || y == n - 1)
                return ans;
              q.offer(new int[] {x, y});
              seen[x][y] = true;
            }
          }
        }

        return -1;
    }
}
class Solution {
    public int shortestPath(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        boolean[][][] v = new boolean[m][n][k+1];
        Queue<int[]> q = new LinkedList<>();
        int steps = 0;
        q.offer(new int[]{0,0,k});
        
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                int[] curr = q.poll();
                if(curr[0]==m-1 && curr[1]==n-1) return steps;
                for(int[] d : dir){
                    int i = curr[0]+d[0];
                    int j = curr[1]+d[1];
                    int obs = curr[2];
                    
                    if(i>=0 && i<m && j>=0 && j<n){
                        if(grid[i][j]==0 && !v[i][j][obs]){
                            q.offer(new int[]{i,j,obs});
                            v[i][j][obs]=true;
                        }
                        else if(grid[i][j]==1 && obs>0 && !v[i][j][obs-1]){
                            q.offer(new int[]{i,j,obs-1});
                            v[i][j][obs-1]=true;
                        }
                    }
                }
                
            }
            ++steps;
        }
        return -1;
    }
}
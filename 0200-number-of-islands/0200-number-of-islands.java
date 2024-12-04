class Solution {

    private int count;
    private int[][] visited;
    
    public int numIslands(char[][] grid) {
        visited = new int[grid.length][grid[0].length];
        count = 0;
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1'&&visited[i][j]==0)
                {
                    count++;
                    findIsland(grid, i, j);
                }
            }
        }

        return count;
    }

    private void findIsland(char[][] grid, int i, int j)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j]==1 || grid[i][j]=='0') return;
        visited[i][j] = 1;
        findIsland(grid, i+1, j);
        findIsland(grid, i-1, j);
        findIsland(grid, i, j+1);
        findIsland(grid, i, j-1);
    }
}
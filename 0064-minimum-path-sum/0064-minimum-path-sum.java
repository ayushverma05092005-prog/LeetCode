class Solution {
    public int minPathSum(int[][] grid) {
        int [][] memo=new int[grid.length+1][grid[0].length+1];
        for(int[] row:memo) Arrays.fill(row,-1);
        return minPathSum(0,0,grid,memo);
    }
    public int minPathSum(int i,int j,int[][] grid,int[][] memo){
        if(i==grid.length-1 && j==grid[0].length-1) return grid[i][j];
        if(i>=grid.length || j>= grid[0].length) return Integer.MAX_VALUE;
        if(memo[i][j]!=-1) return memo[i][j];
        int mini=Integer.MAX_VALUE;
        mini=Math.min(minPathSum(i+1,j,grid,memo),minPathSum(i,j+1,grid,memo));
        if(mini!=Integer.MAX_VALUE) mini=mini+grid[i][j];
        memo[i][j]=mini;
        return mini;
    }
}
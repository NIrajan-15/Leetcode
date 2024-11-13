class Solution {

    private int[][] result;
    public int[][] generateMatrix(int n) {
        result = new int[n][n];
        generate(0, 0, 1, false);
        return result;
    }

    private void generate(int i, int j, int currentNum, boolean isUp)
    {
        if(i<0 || j<0 || i>=result.length || j>=result.length || result[i][j]!=0) return;
        result[i][j] = currentNum;

        if(isUp)
        {
            generate(i-1, j, currentNum+1, true);
        }

        generate(i, j+1, currentNum+1, false);
        generate(i+1, j, currentNum+1, false);
        generate(i, j-1, currentNum+1, false);
        generate(i-1, j, currentNum+1, true);

    }
}
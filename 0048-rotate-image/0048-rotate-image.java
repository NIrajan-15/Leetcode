class Solution {
    public void rotate(int[][] matrix) {
        int left = 0;
        int right = matrix.length-1;

        while(left<right)
        {
            for (int i = left; i < right; i++) 
            {
            int top = matrix[left][i];
            matrix[left][i] = matrix[right - (i - left)][left];
            matrix[right - (i - left)][left] = matrix[right][right - (i - left)];
            matrix[right][right - (i - left)] = matrix[i][right];
            matrix[i][right] = top;
            }
            left++;
            right--;
        }
    }

    

}
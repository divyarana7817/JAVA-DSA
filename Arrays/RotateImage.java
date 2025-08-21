package Arrays;

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //transpose T.C:O(N/2 * N/2)
        for(int i=0; i<n;i++){
            for(int j=i;j<n;j++){
                int temp =matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse T.C O(N*N/2)
        for(int i=0;i<n;i++){
            int left =0, right = n-1;
            while(left<right){
            int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
        }
    }
}}
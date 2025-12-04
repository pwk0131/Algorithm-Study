class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int r1 = arr1.length;       // arr1의 열
        int c1 = arr1[0].length;    // arr1의 행
        int r2 = arr2.length;       // arr2의 열
        int c2 = arr2[0].length;    // arr2의 행

        int[][] result = new int[r1][c2];

        // arr1[0][0] * arr2[0][0] + arr1[0][1] * arr2[1][0]  = result[0][0]시나리오 1
        // arr1[0][0] * arr2[0][1] + arr1[0][1] * arr2[1][1]  = result[0][1]시나리오 2
        // arr1[0][0] * arr2[0][1] + arr1[0][1] * arr2[1][1]  = result[1][0]시나리오 3
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                for(int k = 0; k < c1; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return result;
    }
}
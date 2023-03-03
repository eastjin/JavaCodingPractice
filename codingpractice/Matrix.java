package codingpractice;

import java.util.Arrays;

class Solution10 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int a = 0; a < answer.length; a++) {
            for (int b = 0; b < arr1[0].length; b++) {
                answer[a][b] = arr1[a][b] + arr2[a][b];
            }
        }
        return answer;
    }
}

public class Matrix {
    public static void main(String[] args) {
        Solution10 sol1 = new Solution10();
        int[][] Mat1= new int[][]{{1,2,3},{3,4,5}};
        int[][] Mat2= new int[][]{{3,4,1},{5,6,7}};
        sol1.solution(Mat1,Mat2);

        System.out.println(Arrays.toString(sol1.solution(Mat1,Mat2)));
    }
}

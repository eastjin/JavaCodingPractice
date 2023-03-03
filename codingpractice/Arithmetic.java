package codingpractice;

import java.util.Arrays;

class Solution11 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum=0;
        for (int i = 0; i < n; i++) {
            sum+=x;
            answer[i]=sum;
        }
        return answer;
    }
}

public class Arithmetic {
    public static void main(String[] args) {
        Solution11 sol1 = new Solution11();
        long[] result=sol1.solution(-4,10);
        System.out.println(Arrays.toString(result));
    }
}

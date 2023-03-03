package codingpractice;

import java.util.Arrays;
import java.util.Collections;

class Solution23 {
    public int[] solution(long n) {
        String testString = String.valueOf(n);
        String[] testToArray = testString.split("");
        //Arrays.sort(testToArray,Collections.reverseOrder());
        int[] answer = new int[testToArray.length];
        int sum=0;
        for (int i = answer.length-1; i >= 0; i--) {
            answer[i] = Integer.valueOf(testToArray[sum]);
            sum++;
        }
        return answer;
    }
}
public class Test23 {
    public static void main(String[] args) {
        Solution23 sol = new Solution23();
        //System.out.println(sol.solution(12345));
        System.out.println(Arrays.toString(sol.solution(123456789)));
    }
}

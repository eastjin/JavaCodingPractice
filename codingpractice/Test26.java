package codingpractice;

import java.util.Arrays;
import java.util.Collections;

class Solution26 {
    public int[] solution(int[] arr) {

        if(arr.length<=1){
            int[] answer2 = {-1};
            return answer2;
        }

        int min = arr[0];

        for (int an : arr) {
            if(an <= min){
                min = an;
            }
        }
        int[] answer = new int[arr.length-1];
        int num = 0;

        for (int i : arr) {
            if(i!=min) {
                answer[num++]=i;
            }
        }
        return answer;
    }
}

public class Test26 {
    public static void main(String[] args) {
        Solution26 sol = new Solution26();
        int arr[] = new int[]{1,4,0,2};
        System.out.println(Arrays.toString(sol.solution(arr)));
    }
}

package codingpractice;

class Solution8 {
    public double solution(int[] arr) {
        double answer = 0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            int num=arr[i];
            sum+=num;
        }
        answer = (double) sum/arr.length;
        return answer;
    }
}

public class Average {
    public static void main(String[] args) {
        Solution8 sol1 = new Solution8();
        int[] num = new int[]{1,2,3,4};
        System.out.println(sol1.solution(num));
    }
}

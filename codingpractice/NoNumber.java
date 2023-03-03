package codingpractice;

class Solution6 {
    public int solution(int[] numbers) {
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            int num=numbers[i];
            sum+=num;
        }
        int sum2=0;
        for (int i=0; i<10; i++){
            int num=i;
            sum2+=num;
        }
        int answer = sum2-sum;
        return answer;
    }
}

public class NoNumber {
        public static void main(String[] args) {
        Solution6 sol1 = new Solution6();
        int[] num = new int[]{1,2,3,4,6,7,8,0};
        System.out.println(sol1.solution(num));
    }
}

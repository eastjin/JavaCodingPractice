package codingpractice;

class Solution27 {
    public int solution(int num) {
        int answer = 0;
        if(answer==1)
            return 0;
        int sum=0;
        long num1 = num;
        while(true){
            if(num1==1){
                break;
            }
            if(num1%2==0){
                num1=num1/2;
                sum++;
            }
            else if(num1%2!=0){
                num1=num1*3+1;
                sum++;
            }

        }
//        1-1. 입력된 수가 짝수라면 2로 나눕니다.
//        1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//        2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
        if(sum>=500){
            return -1;
        }
        return sum;
    }
}

public class Test27 {
    public static void main(String[] args) {
        Solution27 sol = new Solution27();
        System.out.println(sol.solution(626331));
        System.out.println("test");

    }
}

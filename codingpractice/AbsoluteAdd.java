package codingpractice;

class Solution7 {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum=0;
        for (int i = 0; i < absolutes.length; i++) {
            int num=absolutes[i];
            boolean sign=signs[i];
            if(sign==true){
                sum+=num;
            }
            else sum-=num;
        }
        return sum;
    }
}

public class AbsoluteAdd {
    public static void main(String[] args) {
        Solution7 sol1 = new Solution7();
        int[] num = new int[]{1,2,3,4,6};
        boolean[] signs = new boolean[]{true,false,true,true,true};
        System.out.println(sol1.solution(num,signs));
    }
}

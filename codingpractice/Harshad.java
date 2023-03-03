package codingpractice;

public class Harshad {
    public static void main(String[] args) {
        boolean answer = true;
        int test = 12345;
        String s = Integer.toString(test);
        int count = s.length();
        int sum=0;
//        String sub = s.substring(1,2);
//        System.out.println(sub);
        for (int i = 0; i < count; i++) {
            String sub = s.substring(i,i+1);
            int change = Integer.parseInt(sub);
            sum+=change;
        }
        //자릿수의 합.
        System.out.println("자릿수의 합 : "+sum);


        if(test%sum==0){
            System.out.println(answer);
        }else System.out.println(answer==false);

        //나누는 자리
    }
}

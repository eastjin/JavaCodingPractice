package codingpractice;

public class Test25 {
    public static void main(String[] args) {
        long num = 3;
        long result = (long)Math.sqrt(num);
        System.out.println(result*result);

        if(result*result==num){
            System.out.println((result+1)*(result+1));
        }
        else System.out.println(-1);
    }
}

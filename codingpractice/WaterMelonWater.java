package codingpractice;

class SolutionWater {
    public String solution(int n) {
        String answer = "수박";
        String answer1 = "";
        for (int i = 0; i < n; i++) {
            answer1 = answer1+answer;
        }
        String tmp = answer.substring(0,n);
        return tmp;
    }
}

public class WaterMelonWater {
    public static void main(String[] args) {
        SolutionWater sol = new SolutionWater();
        System.out.println("test : "+sol.solution(2));
        int n = 2;
        String test = "수박";
        String test1= "";
        for (int i = 0; i < n; i++) {
            System.out.print(test);
            test1 = test1+test;
        }
        System.out.println();
        System.out.println("final :"+test1.substring(0,n));
    }
}

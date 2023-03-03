package codingpractice;

class SolutionKim {
    public String solution(String[] seoul) {
        int cnt =0;
        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")){
                break;
            } else cnt++;
        }
        return "김서방은 "+cnt+"에 있다";
    }
}


public class WhereisKim {
    public static void main(String[] args) {
        SolutionKim sol = new SolutionKim();
        String[] test = new String[]{"Jane","Kim","Hahm"};
        System.out.println(sol.solution(test));
    }
}

package codingpractice;

import java.util.Arrays;


class Solution20 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i=0; i<completion.length; i++){

            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }
}
public class Test20 {
    public static void main(String[] args) {
        Solution20 sol = new Solution20();
        String[] participant = {"vinko","leo", "kiki","nikola", "eden",};
        String[] completion = {"eden", "kiki","leo","nikola"};
        System.out.println(sol.solution(participant,completion));



    }
}

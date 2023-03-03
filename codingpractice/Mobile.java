package codingpractice;

class Solution9 {
    public String solution(String phone_number) {
        String answer = phone_number.substring(0,phone_number.length()-4);
        String answer2="";
        for (int i = 0; i < answer.length(); i++) {
            String answer1= phone_number.substring(0,phone_number.length()-i);
            answer2+=answer1.replace(answer1,"*");
        }
        //String answer1 = answer.replaceAll(answer,"*");
        String answer_End = phone_number.substring(phone_number.length()-4);
        return answer2+answer_End;
    }
}


public class Mobile {
    public static void main(String[] args) {
        Solution9 sol1 = new Solution9();
        String PhoneNum = "1212412434";
        System.out.println(sol1.solution(PhoneNum));
    }
}

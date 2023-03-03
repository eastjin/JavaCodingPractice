package codingpractice;

import java.util.Arrays;

public class MessWord {
    public static void main(String[] args) {
        String test = "aBc dEf ghI  ";
        test.toUpperCase();
        //대문자로 변환
        //System.out.println(test);
        //소문자로 변환
        //System.out.println(test.toLowerCase());

        //append를 쓰거나, Join() 쓰거나. 337페이지.
        //test를 스플릿 해서
        //각각 형변환해서 answer에 붙여넣고, 각각 끝날 때 마다 띄어쓰기 붙...인다?

        String[] splitTest = test.split(" ");
        String sp1 = splitTest[0];
        String sp2 = splitTest[1];
        String sp3 = splitTest[2];
        System.out.println("sp1test : "+sp1);
        System.out.println("sp1test : "+sp2);
        System.out.println("sp1test : "+sp3);
        System.out.println("------------------");
        char[] CharSeparate = new char[test.length()];
        System.out.println(test.toCharArray()[4]);

        CharSeparate[0] = test.toCharArray()[4];
        System.out.println(Arrays.toString(CharSeparate));

        int count=0;
        for (int i = 0; i < CharSeparate.length; i++) {
//            if(count%2==0){
//                System.out.println(CharSeparate[0]);
//            }
        }

        for (int i = 0; i < test.length(); i++) {


        }
    }
}

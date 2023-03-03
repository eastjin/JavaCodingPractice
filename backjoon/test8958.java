package backjoon;

public class test8958 {
    public static void main(String[] args) {
        String OXtest = "OOOOXOOOOXOOOOX";
        //System.out.println(OXtest.substring(0,1));
        String[] OXtest_split = OXtest.split("X");
        int sum=0;
        //System.out.println(OXtest_split[1].length());
        //O의 카운트를 돌려 점수를 반환 1점+2점+1점+6점
        //배열의 등차수열 + 등차수열 + 등차수열

        for (int i = 0; i < OXtest_split.length; i++) {
            int sumi=0;
            for (int j = 0; j < OXtest_split[i].length(); j++) {
                sumi+=(j+1);
            }
            sum+=sumi;
        }

        System.out.println(sum);
    }
}

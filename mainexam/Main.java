package mainexam;
// 1번 문제
//public class Main {
//    public int solution(int num) {
//        int payed = 1000;
//
//        int get = payed - num;
//
//        int money[] = new int[]{500,100,50,10};
//
//        int totalCount = 0;
//
//        while(true){
//            if(get==0){
//                break;
//            }
//            for (int i = 0; i<money.length; i++) {
//                for (int j = 0; get >= money[i]; j++) {
//                    get=get-money[i];
//                    totalCount++;
//                }
//            }
//        }
//
//        return totalCount;
//    }
//
//    public static void main(String[] args) {
//        Main method = new Main();
//        int num1 = 160;
//
//        System.out.println(method.solution(num1));
//    }
//}

//-------------------------

// 2번
//public class Main {
//    public int solution(String s) {
//        String[] OXtest_split = s.split("X");
//        int sum=0;
//        for (int i = 0; i < OXtest_split.length; i++) {
//            int sumi=0;
//            for (int j = 0; j < OXtest_split[i].length(); j++) {
//                sumi+=(j+1);
//            }
//            sum+=sumi;
//        }
//        return sum;
//    }
////return sum=배열의 합 + 배열의 합(sumi)
//    public static void main(String[] args) {
//        Main method = new Main();
//        String s = "OXOOOXXXOXOOXOOOOOXO";
//        System.out.println(method.solution(s));
//    }
//}


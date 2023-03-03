package mocktest;

public class PrimeNum {
    public String solution(String s) {
        String answer = "";
        return answer;
    }

    public static void main(String[] args) {
        PrimeNum method = new PrimeNum();
        String s = "97 75 88 99 95 92 73";
        System.out.println(method.solution(s));
        String[] ForPrime = s.split(" ");

        //String형을 정수형으로
        int[] intArr = new int[ForPrime.length];
        for (int i = 0; i < ForPrime.length; i++) {
            intArr[i] = Integer.parseInt(ForPrime[i]);
        }

        //max int 초기화
        int max = intArr[0];
        int min = intArr[0];

        //max, int 구하기.
        for (int i = 0; i < intArr.length; i++) {
            if(intArr[i]>max){
                max=intArr[i];
            } else if(intArr[i]<min){
                min=intArr[i];
            }
        }
        System.out.println("최대값 : "+max+"최소값 : "+min);

        //parseInt로 해당 스트링을 인트 값으로 바꾼 다음에 비교를 한다.
        //소수는 1과 나 자신만 가능이니까 1 가능, 특정숫자 i 가능, 나머지는 안되니까 2 이하이면 소수 그 이상이면 아닌거임.
        StringBuffer appendStringPrime = new StringBuffer("");
        StringBuffer appendStringNormal = new StringBuffer("");

        //String s = "97 75 88 99 95 92 73";
        //int sum=0;
        for (int i = 0; i < intArr.length; i++) {
            int sum=0;
            for (int j = 1; j < intArr[i]; j++) {
                if(intArr[i]%j==0){
                    sum++;
                }
            }
            if(sum>2){
                String str1=intArr[i]+"";
                appendStringNormal.append(str1);
                appendStringNormal.append(" ");
            }

            else{
                String str1=intArr[i]+"";
                appendStringPrime.append(str1);
                appendStringPrime.append(" ");
            }
        }
        System.out.println("appendStringPrime : "+appendStringPrime);
        System.out.println("appendStringNormal : "+appendStringNormal);

        String PrimechangetoString = appendStringPrime.toString();
        String NormalchangetoString = appendStringNormal.toString();

        String[] ForPrime2 = PrimechangetoString.split(" ");
        String[] ForNormal = NormalchangetoString.split(" ");

        System.out.println("-----test : Prime and Normal------");
        System.out.println(ForPrime2[0]);
        System.out.println(ForNormal[0]);



        //소수의 String형을 정수형으로
        int[] intArrPrime = new int[ForPrime2.length];
        for (int i = 0; i < ForPrime2.length; i++) {
            intArrPrime[i] = Integer.parseInt(ForPrime2[i]);
        }

        //소수의 max int 초기화
        int maxforPrime = intArrPrime[0];

        //그냥수의 String형을 정수형으로
        int[] intArrNormal = new int[ForNormal.length];
        for (int i = 0; i < ForNormal.length; i++) {
            intArrNormal[i] = Integer.parseInt(ForNormal[i]);
        }
        //그냥수의 Min int 초기화
        int minForNormal = intArrNormal[0];

        //소수의 max, int 구하기.
        for (int i = 0; i < intArrPrime.length; i++) {
            if(intArrPrime[i]>max){
                maxforPrime=intArrPrime[i];
            }
        }
        //그냥수의 max, int 구하기.
        for (int i = 0; i < intArrNormal.length; i++) {
            if(intArrNormal[i]<minForNormal){
                minForNormal=intArrNormal[i];
            }
        }
        System.out.println("소수의 최댓값 : "+maxforPrime);
        System.out.println("그냥수의 최솟값 : "+minForNormal);

        String Prime = maxforPrime+"";
        String Normal = minForNormal+"";
        System.out.println(Prime+" "+Normal);
    }
}
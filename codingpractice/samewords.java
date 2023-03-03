package codingpractice;

public class samewords {
    public static void main(String[] args) {
        String test = "pabc";
        char transCh = test.charAt(0);
        //test출력
        //System.out.println(transCh);
        //String 길이 측정 : test.length 출력.
        System.out.println("test.length() : " + test.length());

        if(transCh=='P'||transCh=='p'){
            System.out.println(true);
        }
        int sumP=0;
        for (int i = 0; i < test.length(); i++) {
            transCh=test.charAt(i);
            if(transCh=='P'||transCh=='p'){
                sumP++;
            }
        }
        System.out.println("P의 총합 : " + sumP);
        int sumY=0;
        for (int i = 0; i < test.length(); i++) {
            transCh=test.charAt(i);
            if(transCh=='Y'||transCh=='y'){
                sumY++;
            }
        }
        System.out.println("Y의 총합 : "+ sumY);
        if(sumY==sumP){
            System.out.println(true);
        } else if (sumY==0&&sumP==0) {
            System.out.println(true);
        }
        else System.out.println(false);

    }
}

package backjoon;


public class test5585 {
    public static void main(String[] args) {

        int price = 1;
        int payed = 1000;

        int get = payed - price;

        int money[] = new int[]{500,100,50,10,5,1};

        int sum=0;

        int totalCount = 0;

        while(true){
            if(get==0){
                break;
            }
            for (int i = 0; i<money.length; i++) {
                for (int j = 0; get >= money[i]; j++) {
                    get=get-money[i];
                    totalCount++;
                }
            }
        }

        System.out.println(totalCount);
    }
}

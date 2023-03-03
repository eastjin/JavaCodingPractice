package codingpractice;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;

        return answer;
    }
}

//처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
//놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성
public class NeedMoney {
    public static void main(String[] args) {
        int count=0;
        long moneyStart = 20;
        long price = moneyStart *count;
        System.out.println("1번째 타면 : "+price);
        count=5;
        price = moneyStart*count;
        System.out.println("5번째 타면 : "+price);

        long sum=0;
        int totalCount=3;
        //n번 탄것을 전부 더했을 때 count
        for (int i = 0; i <= totalCount; i++) {
            price=moneyStart*i;
            sum+=price;
        }
        System.out.println("5번 ㅈ까지 탔을 때 총합 : "+sum);
    }
}

public class Ex6_3 {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Calc calc2 = new Calc();
        int result1= calc.add(1,2);
        System.out.println(result1);
        int result2 = calc.minus(3,2);
        System.out.println(result2);
        System.out.println(calc.add(1,2));
    }


}


class Calc{
    int add(int x, int y){
        int result = x+y;
        return result;
    }

    int minus(int x, int y){
        int result = x-y;
        return result;
    }
}

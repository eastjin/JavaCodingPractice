public class MyMath2 {
    long a,b;

    long add(){return a+b;}
    long subtract(){return a-b;}
    long multiply(){return a*b;}
    long divide(){return a/b;}

    static long add(long a, long b) {return a+b;}
    static long subtract(long a, long b) {return a-b;}
    static long multiply(long a, long b) {return a*b;}
    static double divdie(long a, long b) {return a/(double)b;}

}

class Ex6_9{
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200L,200L));
        System.out.println(MyMath2.subtract(200L,200L));
        System.out.println(MyMath2.multiply(200L,200L));

        MyMath2 mm= new MyMath2();
        mm.a= 200L;
        mm.b=100L;
        System.out.println(mm.add());
    }
}

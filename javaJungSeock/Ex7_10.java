package javaJungSeock;

public class Ex7_10 {
    public static void main(String[] args) {
        Unit[] group={new Marine(),new Tank()};

        for (int i = 0; i < group.length; i++) {
            group[i].move(100,200);
            group[i].stop();
        }
    }
}

abstract class Unit{
    int x, y;
    //추상 메소드 선언
    abstract void move(int x, int y);
    void stop(){
        System.out.println("멈춤.");
    }
}

class Marine extends Unit{
    void move(int x, int y){
        System.out.println("javaJungSeock.Marine moving [x="+x+",y="+y+"]");
    }
    void stimPack(){}
}
class Tank extends Unit{
    void move(int x, int y){
        System.out.println("javaJungSeock.Tank moving [x="+x+",y="+y+"]");
    }
    void stimPack(){}
}
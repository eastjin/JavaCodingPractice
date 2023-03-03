package testPack;


import lombok.Getter;

@Getter
public class Time{
    static int reserv=500;
    private int hour;

    public int getHour(){
        return hour;
    }

    public void setHour(int h){
        if(h<0 || h>23) return;
            this.hour=h;
    }


}


class Time2{
    public static void main(String[] args) {
        Time time= new Time();
        time.setHour(25);
        System.out.println(time.getHour());
        int res= time.reserv;
    }
}
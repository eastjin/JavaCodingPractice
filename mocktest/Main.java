package mocktest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2023,Calendar.JANUARY,1);

        cal.add(Calendar.DATE,1);
        System.out.println((cal.get(Calendar.MONTH)+1)+"월 "+(cal.get(Calendar.DATE))+"일");


    }
}

//public class Main {
//    public String solution(int month, int day) {
//        LocalDate DateStartHanghae = LocalDate.of(2018, month, day);
//        LocalDate hanghaesooryo = DateStartHanghae.plusDays(98);
////        System.out.println(hanghaesooryo);
////        String Dateformat = hanghaesooryo.format(DateTimeFormatter.ofPattern("M"+"월 "+"dd"+"일"));
//        String Dateformat = hanghaesooryo.format(DateTimeFormatter.ofPattern("M월 dd일"));
////        System.out.println(Dateformat);
//        String answer = Dateformat;
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main method = new Main();
//        System.out.println(method.solution(1, 18));
//    }
//}
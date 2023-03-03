import java.util.*;



class ExCal{
    public static void main(String[] args) {

        final String[] DAY_OF_WEEK={"","SUN","MON","TUE","WED","THU","FRI","SAT"};

        Calendar date1=Calendar.getInstance();
        Calendar date2=Calendar.getInstance();

        date1.set(2016,5,24);
        System.out.println(DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"DAY");
    }

    public static String toString(Calendar date){

        return (date.get(Calendar.MONTH)+1)+"월";
    }
}

//
//class ExCal {
//    public static void main(String[] args) {
//        codingpractice.Solution sol1 = new codingpractice.Solution();
//        System.out.println(sol1.solution("ABCDEFGH"));
//    }
//}


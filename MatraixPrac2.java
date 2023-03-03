public class MatraixPrac2 {
    public static void main(String[] args) {
        int[][] score={{100,100},{200,200}};
        int[][] score2={{200,50},{20,30}};

        int[][] sum={{score[0][0]+score2[0][0]}};
        int[][] sum1={{score[0][1]+score2[0][1]}};
        int[][] sum2={{score[0][1]+score2[0][1]}};
        System.out.println(sum[0][0]);
        System.out.println(sum[0][1]);
    }
}

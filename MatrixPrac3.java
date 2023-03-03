public class MatrixPrac3 {
    public static void main(String[] args) {
        int[][] array = {{10,30,40}, {30,30,50},{1,2,3}};
        int[][] array2 = {{50,60,30}, {70,20,20},{3,4,5}};
        int[][] result = new int[array.length][array[0].length];

        //행렬갯수확인
        //System.out.println(array.length);
        //System.out.println(array[0].length);


        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                result[i][j] = array[i][j] + array2[i][j];
                System.out.println(result[i][j]);
            }
        }
    }
}

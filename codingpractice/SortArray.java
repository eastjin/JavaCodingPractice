package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArray {
    public static void main(String[] args) {
        int[] test = new int[]{5,9,7,10};

        System.out.println("first start : "+Arrays.toString(test));

        List<Integer> notfixedArray = new ArrayList<>();
        //int[] arr = new int[test.length];
        int divisor = 5;
        int stackForarr=0;
        for (int i = 0; i < test.length; i++) {
            if(test[i]%divisor==0){
                //arr[stackForarr]=test[i];
                stackForarr++;
            }
        }
        System.out.println(stackForarr);

        int[] arr = new int[stackForarr];
        int stackForarr2=0;
        for (int i = 0; i < test.length; i++) {
            if(test[i]%divisor==0){
                arr[stackForarr2]=test[i];
                stackForarr2++;
            }
        }
        Arrays.sort(arr);
        System.out.println("result : "+Arrays.toString(arr));

    }
}

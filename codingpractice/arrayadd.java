package codingpractice;

public class arrayadd {
    public static void main(String[] args) {
        int[] a = new int[]{1,2};
        int[] b = new int[]{5,6};

        int[] c = new int[a.length];
        System.out.println(a.length);

        int sum=0;
        for (int i = 0; i < a.length; i++) {
            c[i]=a[i]*b[i];
            sum+=c[i];
        }
        System.out.println(sum);
    }
}

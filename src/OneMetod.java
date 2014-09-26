import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ALEX on 26.09.2014.
 */
public class OneMetod {
    public static void main(String[] args) {
        int [] x = {1,2,3,4,5};
        System.out.print("Первый массив: ");
        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }
        System.out.println();
        int [] y = {5,6,7,8};
        System.out.print("Второй массив: ");
        for(int i = 0; i < y.length; i++) {
        System.out.print(y[i]);
        }
        System.out.println();
        System.out.print("Длина будущего массива: ");
        int [] z = new int[x.length+y.length];
        int length = z.length;
        System.out.println(length);
        System.out.print("Склеенный массив: ");
        for (int i=0; i<z.length; i=i+1) {
            if (i<x.length) {
                z[i] = x[i];
            } else {
                z[i] = y[i-x.length];
            }
            System.out.print(z[i]);
        }
    }
}

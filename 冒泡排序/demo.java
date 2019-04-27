import javax.swing.*;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] a = {6, 2, 1, 4, 98, 8, 3, 5, 44, 6, 9, 8, 5555};
        bubbleSort(a);
        for (int x = 0; x < a.length - 1; x++) {
            System.out.println(a[x]);
        }
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) { //外层控制循环的次数
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}

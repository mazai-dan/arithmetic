import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] a = {6,2,1,4,98,8,3,5,44,6,9,8,5555};

        System.out.println( HalfMethod(a,98));
    }

    public static int HalfMethod(int[] a,int value) {
        Arrays.sort(a);
        int lower = 0;
        int upper = a.length -1;
        while (upper >= lower){
            int mid = (upper+lower)/ 2; //两数相加取中间值

            if (a[mid] == value){
                return mid; //如果中间值 和 value 相等 直接返回该下标“mid”
            }

            if (a[mid] < value){
                lower = mid + 1; // 如果 中间值 小于 value 把最低lower下标往后移
            }

            if (a[mid] > value){// 如果 中间值 大于 value 把最高upper下标往前移
                upper = mid-1;
            }
        }
        return -1;
    }
}

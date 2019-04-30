import javax.swing.*;
import java.util.*;
/*
    随机生成50个数字（整数），每个数字的范围是10-50，统计每个数字出现的次数以及
    出现次数最多的数字与他的个数，最后每个数字机器出现的数字打印出来，如果某个数字
    出现次数为0，则不要打印它，打印时按照数字的升序排列。
 */
public class demo {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < 50; i++) {
            int item = genNum();
            if (map.get(item) == null) {
                map.put(item, 1);
            } else {
                map.put(item, map.get(item) + 1);
            }
        }
       for (Iterator iterator = map.entrySet().iterator();iterator.hasNext();){
           System.out.println(iterator.next());
       }
    }

    public static int genNum() {
        int num = 0;
        while (true) {
            num = (int) (Math.random() * 100);
            if (num <= 50 && num >= 10) {
                return num;
            }
        }
    }
}



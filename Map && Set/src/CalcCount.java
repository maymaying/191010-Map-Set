import java.util.Map;
import java.util.TreeMap;

public class CalcCount {
    //只出现一次的数字
    //K 是 数字
    //V 是 次数
    public static Map<Integer, Integer> calcCount(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (int n : nums) {
            int c = map.getOrDefault(n, 0);
            map.put(n, c + 1);

            /*
            Integer c = map.get(n);
            if (c == null) {
                map.put(n, 1);
            } else {
                map.put(n, c + 1);
            }
             */
        }
        return map;
    }

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int n : nums) {
            int c = map.getOrDefault(n, 0);
            map.put(n, c + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int n = e.getKey();
            int c = e.getValue();
            if (c == 1) {
                return n;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 1, 2, 3, 9, 1, 3, 9, 2, 8 };
        Map<Integer, Integer> map = calcCount(nums);
        System.out.println(map);
    }

}

package olbrys.mariusz.learn.eightkyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumMixedArray {

    /*
     * Assume input will be only of Integer o String type
     */

    public int sum(List<?> mixed) {
        int sum = 0;
        for (Object number : mixed) {
            if (number instanceof String) {
                sum += Integer.valueOf((String) number);
            } else {
                sum += (int)number;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumMixedArray sumMixedArray = new SumMixedArray();
        sumMixedArray.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0"));
        List<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("5");
        arrayList.add("Tomek");
        System.out.println(arrayList.size());
        String[] array = new String[1];
        array[0] = "Agata";
        array[1] = "Tomek";
        System.out.println(array.length);
    }

}

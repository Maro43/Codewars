package olbrys.mariusz.learn.eightkyu;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedStrings {

    public static String solution(String str) {
        String[] letters = str.split("");
        String result = "";
        for (int i = 0; i < letters.length; i++) {
            if (i == letters.length - 1) {
                result = letters[i] + result;
            } else {
                result = letters[i] + result;
            }
        }
        return result;
    }

    public static String solution2(String str) {
        List<String> letters = Arrays.asList(str.split(""));
        Collections.reverse(letters);
        return String.join("", letters);
    }

    public static void main(String[] args) {
        String test = solution("IkarVR To Jet Test");
        String test2 = solution2("IkarVR To Jet Test");
        System.out.println(test);
        System.out.println(test2.equals(test));
    }


}
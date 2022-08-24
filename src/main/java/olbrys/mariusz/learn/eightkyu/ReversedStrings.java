package olbrys.mariusz.learn.eightkyu;


public class ReversedStrings {

    public static String solution(String str) {
        String[] Letters = str.split("");
        String Result = "";
        for (int i = 0; i < Letters.length; i++) {
            if (i == Letters.length - 1)
                Result = Letters[i] + Result;
            else Result = Letters[i] + Result;
        }
        return Result;
    }


    public static void main(String[] args) {
        String Tets = solution("IkarVR To Jet Test");
        System.out.println(Tets);
    }
//    List Letters = Arrays.asList(str.split(""));
//     Collections.reverse(Letters);
//     return String.join(Letters);
}
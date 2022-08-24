package olbrys.mariusz.learn.eightkyu;

public class RemoveFirstandLastCharacter {
    public static String removeChars(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        String Test = removeChars("Kobylka");
        System.out.println(Test);
    }
}

package olbrys.mariusz.learn.eightkyu;

public class RemoveFirstandLastCharacter {
    public static String removeChars(String str) {
        str = str.substring(1, str.length() - 1);
        return str;
    }

    public static void main(String[] args) {
        String Test = removeChars("Kobylka");
        System.out.println(Test);
    }
}

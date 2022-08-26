package olbrys.mariusz.learn.eightkyu;

public class RemoveFirstAndLastCharacter {
    public static String removeChars(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(removeChars("Kobylka"));
    }
}

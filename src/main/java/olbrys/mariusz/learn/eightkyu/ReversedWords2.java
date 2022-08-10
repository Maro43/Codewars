package olbrys.mariusz.learn.eightkyu;

/*
Complete the solution so that it reverses all of the words within the string passed in.

Example(Input --> Output):
"The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"
             System.out.println(s[i]);

 */

public class ReversedWords2 {
    public static String reverseWords(String str) {
        String[] s = str.split(" ");
        String r = "";
        for (int i = s.length - 1; i >= 0; i--) {
            if (i == s.length - 1)
                r = s[i];
            else
                r = r + " " + s[i];

        }
        return r;
    }

    public static void main(String[] args) {
        String reverse = reverseWords("Ada ma kota i kot ma Ade");
        System.out.println(reverse);
    }
}
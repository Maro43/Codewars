package olbrys.mariusz.learn.eightkyu;

/*
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
The output should be two capital letters with a dot separating them.
It should look like this:

Sam Harris => S.H
patrick feeney => P.F
 */

public class AbbreviateTwoWordName {

    public static String abbrevName(String name) {
        String[] split = name.split(" ");
        String result = "";
        for (String s : split) {
            char charAt = s.charAt(0);
            System.out.println(charAt);
        }
        System.out.println("Mariusz Olbryś");
        System.out.println(split[0].charAt(0) + "." + split[1].charAt(0));


        return name + "." + name;
    }

    public static void main(String[] args) {
        abbrevName("Mariusz Olbryś");
        abbrevName("Sam Harris");
    }

}

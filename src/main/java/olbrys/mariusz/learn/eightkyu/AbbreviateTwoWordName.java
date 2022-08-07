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
        return name.split(" ")[0].toUpperCase().charAt(0) + "." + name.split(" ")[1].toUpperCase().charAt(0);
    }

}

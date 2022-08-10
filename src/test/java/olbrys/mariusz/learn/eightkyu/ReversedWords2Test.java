package olbrys.mariusz.learn.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversedWords2Test {
    @Test
    public void testSomething() {
        assertEquals("eating like I", ReversedWords2.reverseWords("I like eating"));
        assertEquals("flying like I", ReversedWords2.reverseWords("I like flying"));
        assertEquals("nice is world The", ReversedWords2.reverseWords("The world is nice"));
    }
}
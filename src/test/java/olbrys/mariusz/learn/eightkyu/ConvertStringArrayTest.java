package olbrys.mariusz.learn.eightkyu;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ConvertStringArrayTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, ConvertStringArray.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, ConvertStringArray.stringToArray("I love arrays they are my favorite"));
    }
}
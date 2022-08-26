package olbrys.mariusz.learn.eightkyu;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveFirstandLastCharacterTest {
    @Test
    public void testRemoval() {
        assertEquals("loquen", RemoveFirstAndLastCharacter.removeChars("eloquent"));
        assertEquals("ountr", RemoveFirstAndLastCharacter.removeChars("country"));
        assertEquals("erso", RemoveFirstAndLastCharacter.removeChars("person"));
        assertEquals("lac", RemoveFirstAndLastCharacter.removeChars("place"));
    }
}
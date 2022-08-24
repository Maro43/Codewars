package olbrys.mariusz.learn.eightkyu;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveFirstandLastCharacterTest {
    @Test
    public void testRemoval() {
        assertEquals("loquen", RemoveFirstandLastCharacter.removeChars("eloquent"));
        assertEquals("ountr", RemoveFirstandLastCharacter.removeChars("country"));
        assertEquals("erso", RemoveFirstandLastCharacter.removeChars("person"));
        assertEquals("lac", RemoveFirstandLastCharacter.removeChars("place"));
    }
}
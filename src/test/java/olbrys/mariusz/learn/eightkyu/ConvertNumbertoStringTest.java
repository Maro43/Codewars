package olbrys.mariusz.learn.eightkyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class ConvertNumbertoStringTest {
    @Test
    public void tests() {
        assertEquals("67", ConvertNumbertoString.numberToString(67));
        assertEquals("123", ConvertNumbertoString.numberToString(123));
        assertEquals("999", ConvertNumbertoString.numberToString(999));
    }
}
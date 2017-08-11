package bootcamp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToIntConverterTest {

    @Test
    public void shouldConvertToInterger() {
        assertEquals(123, new StringToIntConverter().convert("123"));
    }
}

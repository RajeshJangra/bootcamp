package bootcamp;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LineTest {
    @Test
    public void length() throws Exception {
        assertEquals(3D, new Line(new Point(0, 0, 0), new Point(3, 3, 3)).length());
    }

}
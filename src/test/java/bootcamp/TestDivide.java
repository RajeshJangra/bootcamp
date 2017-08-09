package bootcamp;

import org.junit.Test;

import java.util.stream.IntStream;

import static java.lang.Double.POSITIVE_INFINITY;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestDivide {

    @Test
    public void testDivide6By3() {
        assertThat(new Divide().doOperation(6, 3), is(2D));
    }

    @Test
    public void testDivideSomeLongNumber() {
        assertThat(new Divide().doOperation(12222000000D, 122220000D), is(100D));
    }

    @Test
    public void testDivideByZero() {
        assertThat(new Divide().doOperation(12222000000D, 0D), is(POSITIVE_INFINITY));
    }

    @Test
    public void testDivideByZeroWithDifferentNegativeValuesShouldBeEqual() {
        IntStream.range(-100, 0).forEach(number -> assertThat(new Divide().doOperation((double) number, 0D), is(POSITIVE_INFINITY)));
    }

    @Test
    public void testDivideByZeroWithDifferentPositiveValuesShouldBeEqual() {
        IntStream.range(1, 100).forEach(number -> assertThat(new Divide().doOperation((double) number, 0D), is(POSITIVE_INFINITY)));
    }

    @Test
    public void testDivideByAnyShouldBeZero() {
        assertThat(new Divide().doOperation(10D, POSITIVE_INFINITY), is(0D));
    }
}

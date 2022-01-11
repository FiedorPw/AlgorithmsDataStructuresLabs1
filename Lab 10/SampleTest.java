package Lab10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {


    @Test
    void divideInteger() {
        Sample test = new Sample();
        assertEquals(5, test.divide(10, 2));
        assertEquals(3, test.divide(30, 10));
    }

    @Test
    void divideDouble() {
        Sample test = new Sample();
        assertEquals(1.25, test.divide(2.5, 2.0));
        assertEquals(6.25, test.divide(25.0, 4.0));
    }

    @ParameterizedTest
    @MethodSource("divideParameters")
    void testDivideParametrized(int a, int b, int result) {
        Sample test = new Sample();
        assertEquals(result, test.divide(a, b));
    }

    @Test
    void divideByZeroIntegers() {
        Sample test = new Sample();
        assertThrows(ArithmeticException.class,() -> test.divide(1,0));
    }
    void divideByZeroDoubles() {
        Sample test = new Sample();
        assertEquals(test.divide(1.0,0.0), Double.POSITIVE_INFINITY);
    }
    private static Stream<Arguments> divideParameters() {
        return Stream.of(
                Arguments.of(18, 6, 3),
                Arguments.of(14, 2, 7)
        );

    }
}
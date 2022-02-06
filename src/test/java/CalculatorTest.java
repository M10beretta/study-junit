import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    private double a;
    private double b;

    @BeforeEach
    void setUp() {
        a = 112;
        b = -42;
    }

    @Test
    void plus() {
        assertEquals(70, calculator.add(a, b));
    }

    @Test
    void minus() {
        assertEquals(154, calculator.subtract(a, b));

    }

    @Test
    void multiple() {
        assertEquals(-4704, calculator.multiply(a, b));

    }

    @Test
    void divide() {
        assertEquals(-2.6666, calculator.divide(a, b), 0.0001);
    }

    @Test()
    void testDivideInfinity() {
        assertTrue(Double.isInfinite(calculator.divide(a, 0)));
    }

    @Test()
    void testDivideNaN() {
        assertTrue(Double.isNaN(calculator.divide(0, 0)));
    }
}
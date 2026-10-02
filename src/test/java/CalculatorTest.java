import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.add(2, 3));
    }
// Testing Jenkins GitHub Webhook
    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();

        assertEquals(2, calculator.subtract(5, 3));
    }
}

package HomworkTestNg;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class ArithmeticOperationsTest {
    @Test
    public void testArithmeticOperations() {
        assertEquals(HomeworkTestNg.add(2, 3), 5);
        assertEquals(HomeworkTestNg.subtract(2, 3), -1);
        assertEquals(HomeworkTestNg.multiply(2, 3), 6);
        assertEquals(HomeworkTestNg.divide(5, 2), 2.5);
        assertThrows(ArithmeticException.class, () -> HomeworkTestNg.divide(5, 0));
    }
}

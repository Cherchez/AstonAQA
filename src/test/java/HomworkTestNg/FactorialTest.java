package HomworkTestNg;

import org.testng.annotations.Test;

import static HomworkTestNg.HomeworkTestNg.calculateFactorial;
import static org.testng.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void testCalculateFactorial() {
        assertEquals(calculateFactorial(0), 1);
        assertEquals(calculateFactorial(5), 120);
        assertEquals(calculateFactorial(1), 1);
    }
}

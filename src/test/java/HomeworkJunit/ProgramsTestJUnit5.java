package HomeworkJunit;

import org.junit.jupiter.api.Test;

import static HomeworkJunit.Programs.calculateFactorial;
import static HomeworkJunit.Programs.calculateTriangleArea;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class ProgramsTestJUnit5 {
    @Test
    void testFactorial() {
        assertEquals(120, calculateFactorial(5));
        assertEquals(1, calculateFactorial(0));
        assertThrows(IllegalArgumentException.class, () -> calculateFactorial(-1));
    }

    @Test
    void testTriangleArea() {
        assertEquals(10.0, calculateTriangleArea(5, 4));
        assertThrows(IllegalArgumentException.class, () -> calculateTriangleArea(-1, 4));
    }

    @Test
    void testArithmeticOperations() {
        assertEquals(5, Programs.add(2, 3));
        assertEquals(-1, Programs.subtract(2, 3));
        assertEquals(6, Programs.multiply(2, 3));
        assertEquals(2.5, Programs.divide(5, 2));
        assertThrows(ArithmeticException.class, () -> Programs.divide(5, 0));
    }

    @Test
    void testCompare() {
        assertEquals(1, Programs.compare(5, 3));
        assertEquals(-1, Programs.compare(3, 5));
        assertEquals(0, Programs.compare(5, 5));
    }
}

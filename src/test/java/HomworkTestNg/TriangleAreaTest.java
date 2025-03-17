package HomworkTestNg;

import org.testng.annotations.Test;

import static HomworkTestNg.HomeworkTestNg.calculateTriangleArea;
import static org.testng.Assert.assertEquals;

public class TriangleAreaTest {
    @Test
    public void testCalculateArea() {
        assertEquals(calculateTriangleArea(5, 4), 10.0);
        assertEquals(calculateTriangleArea(10, 5), 25.0);
    }
}

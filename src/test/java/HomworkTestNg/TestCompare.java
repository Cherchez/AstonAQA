package HomworkTestNg;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCompare {
    @Test
    public void testCompare() {
        assertEquals(HomeworkTestNg.compare(5, 3), 1);
        assertEquals(HomeworkTestNg.compare(3, 5), -1);
        assertEquals(HomeworkTestNg.compare(5, 5), 0);
    }
}

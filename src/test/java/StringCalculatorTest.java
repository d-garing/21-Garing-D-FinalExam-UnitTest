import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    public void testNegatives()
    {
        assertThrows(IndexOutOfBoundsException.class, () -> StringCalculator.add("-1,2"));
    }

    @Test
    public void testNegatives2()
    {
        assertEquals(2,StringCalculator.add("0,2"));
    }

    @Test
    public void testHigh()
    {
        assertEquals(1,StringCalculator.add("1,1000"));
    }
}
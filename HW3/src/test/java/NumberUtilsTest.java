import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {

    @Test
    public void testEvenNumber() {
        Main utils = new Main();
        assertTrue(utils.evenOddNumber(2));
        assertTrue(utils.evenOddNumber(10));
        assertTrue(utils.evenOddNumber(0));
    }

    @Test
    public void testOddNumber() {
        Main utils = new Main();
        assertFalse(utils.evenOddNumber(3));
        assertFalse(utils.evenOddNumber(11));
        assertFalse(utils.evenOddNumber(-7));
    }

    // Тестирование в пределах интервала
    @Test
    public void testNumberInInterval() {
        Main utils = new Main();
        assertTrue(utils.numberInInterval(50));
        assertTrue(utils.numberInInterval(26));
        assertTrue(utils.numberInInterval(99));
    }

    // Тестирование ниже интервала
    @Test
    public void testNumberBelowInterval() {
        Main utils = new Main();
        assertFalse(utils.numberInInterval(10));
        assertFalse(utils.numberInInterval(25));
        assertFalse(utils.numberInInterval(-5));
    }

    // Тестирование выше интервала
    @Test
    public void testNumberAboveInterval() {
        Main utils = new Main();
        assertFalse(utils.numberInInterval(100));
        assertFalse(utils.numberInInterval(150));
        assertFalse(utils.numberInInterval(1000));
    }
}

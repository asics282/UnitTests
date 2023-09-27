package HW1.Calculator;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void calculateTest() {
        assertEquals(Calculator.calculate(2, 9, '+'), 11, "неправильное сложение");
        assertEquals(Calculator.calculate(5, 2, '-'), 3, "неправильное вычитание");
        assertEquals(Calculator.calculate(2, 3, '*'), 6, "неправильное умножение");
        assertEquals(Calculator.calculate(18, 9, '/'), 2, "неправильное деление");

    }
    public void calculateDiscountTest(){
        double total = 1000;
        int discount = 20;
        double resultExpected = 1000 - 1000*(20/100);
        assertEquals(resultExpected, Calculator.calculateDiscount(1000, 20), "неправильная сумма с учетом скидки");
    }
}

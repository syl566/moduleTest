import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private int x;
    private int y;

    @BeforeEach
    void setup() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testAddNumber() {
        Calculator calculator = new Calculator();
        int result = calculator.addNumber(15, 5);
        assertEquals(x, y, result);
    }

    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(10, 5);
        assertEquals(x, y, result);
    }
    @Test
    void testMultiplication(){
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(9, 5);
        assertEquals(x, y, result);
    }
    @Test
    void testDivision(){
        Calculator calculator = new Calculator();
        int result = calculator.division(20, 2);
        assertEquals(x, y, result);
    }
    @Test
    void testDivisionParZero(){
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class,()-> calculator.division(10,0));
    }


}

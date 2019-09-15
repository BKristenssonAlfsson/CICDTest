import com.test.cicdtest.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class CalculatorTest {

    Calculator calc;

    @BeforeEach
    public void setup() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void twoPlusTwoEqualFour() {

        Assertions.assertEquals(4, calc.add(2,2), "2 + 2 should be 4");
    }

    @Test
    public void twoPointFiveMinusOnePointThreeEqualsOnePointTwo() {
        Assertions.assertEquals(1.2, calc.subtract(2.5, 2), "2.5 - 1.3 should be 1.2" );
    }
}

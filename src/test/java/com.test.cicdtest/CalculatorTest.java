package com.test.cicdtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    @Test
    public void twoPlusTwoEqualFour() {
        Calculator calc = new Calculator();

        assertEquals(4, calc.add(2,2), "2 + 2 should be 4");
    }
}

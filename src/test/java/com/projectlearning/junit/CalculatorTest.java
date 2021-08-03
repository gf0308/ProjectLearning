package com.projectlearning.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import lombok.extern.slf4j.Slf4j;

//@Slf4j
public class CalculatorTest {

	@Test
    public void testSum() {
        Calculator c = new Calculator();
        double result = c.sum(10, 50);
        assertEquals(60, result, 0);
    }
}

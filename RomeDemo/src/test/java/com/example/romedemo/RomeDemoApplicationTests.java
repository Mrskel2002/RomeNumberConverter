package com.example.romedemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RomeDemoApplicationTests {

    @Test
    public void testSolution_whenInputValueIsValid_ShouldReturnCorrectValue() {
        String expectResult = "MMMCMXCIX";
        String result = Conversion.solution(3999);
        assertEquals(expectResult, result);
    }
    @Test
    public void testSolution_whenInputValueIsValid_ShouldReturnCorrectValue_hardNumbers() {
        String expectResult2 = "MCDLIX";
        String result2 = Conversion.solution(1459);
        assertEquals(expectResult2, result2);
    }
    @Test
    public void testSolution_whenInputValueIsNegative_ShouldReturnError() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Conversion.solution(-3999));
    }
    @Test
        public void testSolution_whenInputValueIsZero_ShouldReturnError() {
        String expectResult4 = "";
        String result4 = Conversion.solution(0);
        assertEquals(expectResult4, result4);
    }
    @Test
    public void testSolution_whenInputValueIsMaxValue_ShouldReturnError() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Conversion.solution(Integer.MAX_VALUE));
    }
    @Test
        public void testSolution_whenInputValueIsMInValue_ShouldReturnError() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Conversion.solution(Integer.MIN_VALUE));
    }
}

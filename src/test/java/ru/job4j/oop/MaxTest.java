package ru.job4j.oop;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxTest {

    @Test
    public void whenMaxOfTwoNumbers() {
        Max max = new Max();
        assertEquals(5.0, max.max(2.0, 3.0), 0.01);
    }

    @Test
    public void whenMaxOfThreeNumbers() {
        Max max = new Max();
        assertEquals(6.0, max.max(1.0, 2.0, 3.0), 0.01);
    }

    @Test
    public void whenMaxOfFourNumbers() {
        Max max = new Max();
        assertEquals(10.0, max.max(1.0, 2.0, 3.0, 4.0), 0.01);
    }
}


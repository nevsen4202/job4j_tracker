package ru.job4j.oop;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxTest {

    @Test
    public void whenMaxOfTwoNumbers() {
        assertEquals(2, Max.max(1, 2));
        assertEquals(3, Max.max(3, 2));
    }

    @Test
    public void whenMaxOfThreeNumbers() {
        assertEquals(3, Max.max(1, 2, 3));
        assertEquals(4, Max.max(4, 2, 3));
    }

    @Test
    public void whenMaxOfFourNumbers() {
        assertEquals(4, Max.max(1, 2, 3, 4));
        assertEquals(5, Max.max(5, 2, 3, 4));
    }
}


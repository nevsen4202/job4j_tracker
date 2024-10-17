package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    @Test
    public void whenDistance3dThenCorrect() {
        Point a = new Point(0, 0, 1);
        Point b = new Point(0, 2, 2);
        double expected = Math.sqrt(5);
        double result = a.distance3d(b);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void whenSamePointThenDistanceIsZero() {
        Point a = new Point(1, 1, 1);
        double expected = 0.0;
        double result = a.distance3d(a);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void whenDifferentPointsThenCorrectDistance() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 6, 8);
        double expected = Math.sqrt(50);
        double result = a.distance3d(b);
        assertEquals(expected, result, 0.001);
    }
}


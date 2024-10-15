package ru.job4j.oop;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenTriangleNotExist() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        Point c = new Point(4, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        assertEquals(-1, result, 0.01);
    }
}


package com.jcg.maven;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class MathTests extends TestCase {

    public void add_TwoPlusTwo_ReturnsFour() {
        final int expected = 4;

        final int actual = Math.add(2, 2);

        assertEquals(actual, expected);
    }

    public void divide_TenDividedByFive_ReturnsTwo() {
        final double expected = 2.0;

        final double actual = Math.divide(10, 5);

        assertEquals(actual, expected);
    }

    public void divide_TenDividedByZero_ThrowsIllegalArgumentException() {
        Math.divide(10, 0);
    }

    public static double divideShouldBeFloat(int dividend, int divisor) {
        if (divisor == 0)
            throw new IllegalArgumentException("Cannot divide by zero (0).");

        return dividend / divisor;
    }

}
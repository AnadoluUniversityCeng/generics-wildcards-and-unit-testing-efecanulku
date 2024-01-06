package edu.estu;

import org.junit.Test;

import static org.junit.Assert.fail;

/* *********************************************************
 **** WRITE YOUR FAILING UNIT TEST(S) INTO THIS FILE! *****
 ***********************************************************
 */

/**
 * Unit tests for the first part of the project.
 */
public class FailingTest {

    @Test
    public void testInfiniteLoopBug() {
        try {
            // This test is expected to fail because the method infiniteLoop enters an infinite loop for certain inputs.
            App.infiniteLoop(Double.POSITIVE_INFINITY);
            // If we reach this point, the test has failed
            fail("Expected infinite loop, but the method did not enter one.");
        } catch (Exception e) {
            // This is expected, as the method is intentionally causing an infinite loop
        }
    }
}

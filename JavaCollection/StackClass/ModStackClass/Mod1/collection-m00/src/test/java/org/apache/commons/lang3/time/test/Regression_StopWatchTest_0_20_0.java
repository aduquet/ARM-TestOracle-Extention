package org.apache.commons.lang3.time.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_StopWatchTest_0_20_0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StopWatchTest_0_20_0.test01");
        org.apache.commons.lang3.time.StopWatchTestDriver stopWatchTestDriver0 = new org.apache.commons.lang3.time.StopWatchTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            stopWatchTestDriver0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StopWatchTest_0_20_0.test02");
        org.apache.commons.lang3.time.StopWatchTestDriver stopWatchTestDriver0 = new org.apache.commons.lang3.time.StopWatchTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            stopWatchTestDriver0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StopWatchTest_0_20_0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StopWatchTest_0_20_0.test04");
        org.apache.commons.lang3.time.StopWatchTestDriver stopWatchTestDriver0 = new org.apache.commons.lang3.time.StopWatchTestDriver();
        stopWatchTestDriver0.reset();
        stopWatchTestDriver0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatchTestDriver0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StopWatchTest_0_20_0.test05");
        org.apache.commons.lang3.time.StopWatchTestDriver stopWatchTestDriver0 = new org.apache.commons.lang3.time.StopWatchTestDriver();
        stopWatchTestDriver0.reset();
        java.lang.Class<?> wildcardClass2 = stopWatchTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StopWatchTest_0_20_0.test06");
        org.apache.commons.lang3.time.StopWatchTestDriver stopWatchTestDriver0 = new org.apache.commons.lang3.time.StopWatchTestDriver();
        stopWatchTestDriver0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatchTestDriver0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StopWatchTest_0_20_0.test07");
        org.apache.commons.lang3.time.StopWatchTestDriver stopWatchTestDriver0 = new org.apache.commons.lang3.time.StopWatchTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            stopWatchTestDriver0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StopWatchTest_0_20_0.test08");
        org.apache.commons.lang3.time.StopWatchTestDriver stopWatchTestDriver0 = new org.apache.commons.lang3.time.StopWatchTestDriver();
        stopWatchTestDriver0.reset();
        stopWatchTestDriver0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatchTestDriver0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StopWatchTest_0_20_0.test09");
        org.apache.commons.lang3.time.StopWatchTestDriver stopWatchTestDriver0 = new org.apache.commons.lang3.time.StopWatchTestDriver();
        stopWatchTestDriver0.reset();
        stopWatchTestDriver0.reset();
        stopWatchTestDriver0.start();
        stopWatchTestDriver0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatchTestDriver0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StopWatchTest_0_20_0.test10");
        org.apache.commons.lang3.time.StopWatchTestDriver stopWatchTestDriver0 = new org.apache.commons.lang3.time.StopWatchTestDriver();
        java.lang.Class<?> wildcardClass1 = stopWatchTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StopWatchTest_0_20_0.test11");
        org.apache.commons.lang3.time.StopWatchTestDriver stopWatchTestDriver0 = new org.apache.commons.lang3.time.StopWatchTestDriver();
        stopWatchTestDriver0.reset();
        stopWatchTestDriver0.start();
        // The following exception was thrown during execution in test generation
        try {
            stopWatchTestDriver0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StopWatchTest_0_20_0.test12");
        org.apache.commons.lang3.time.StopWatchTestDriver stopWatchTestDriver0 = new org.apache.commons.lang3.time.StopWatchTestDriver();
        stopWatchTestDriver0.reset();
        stopWatchTestDriver0.start();
        stopWatchTestDriver0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatchTestDriver0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StopWatchTest_0_20_0.test13");
        org.apache.commons.lang3.time.StopWatchTestDriver stopWatchTestDriver0 = new org.apache.commons.lang3.time.StopWatchTestDriver();
        stopWatchTestDriver0.reset();
        stopWatchTestDriver0.reset();
        stopWatchTestDriver0.start();
        stopWatchTestDriver0.split();
    }
}


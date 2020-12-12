package experiment.util.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_StackTest_0_10_0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_10_0.test1");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass2 = stackTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_10_0.test2");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.push(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_10_0.test3");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_10_0.test4");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_10_0.test5");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}


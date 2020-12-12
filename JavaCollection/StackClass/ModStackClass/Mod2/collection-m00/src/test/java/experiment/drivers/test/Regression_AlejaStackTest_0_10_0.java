package experiment.drivers.test;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_AlejaStackTest_0_10_0 {

    public static boolean debug = false;

    @Before
    public void setup() {
        System.setProperty("testId", java.time.Instant.now().toEpochMilli() + ":" + java.util.UUID.randomUUID().toString());
    }

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_AlejaStackTest_0_10_0.test1");
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver0 = new experiment.drivers.AlejaStackTestDriver();
        alejaStackTestDriver0.clear();
        java.lang.Class<?> wildcardClass2 = alejaStackTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_AlejaStackTest_0_10_0.test2");
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver0 = new experiment.drivers.AlejaStackTestDriver();
        java.lang.Object obj2 = alejaStackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = alejaStackTestDriver0.pop();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = alejaStackTestDriver0.push(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 1.0f + "'", obj2, 1.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 1.0f + "'", obj3, 1.0f);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_AlejaStackTest_0_10_0.test3");
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver0 = new experiment.drivers.AlejaStackTestDriver();
        java.lang.Object obj2 = alejaStackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = alejaStackTestDriver0.pop();
        alejaStackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = alejaStackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 1.0f + "'", obj2, 1.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 1.0f + "'", obj3, 1.0f);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_AlejaStackTest_0_10_0.test4");
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver0 = new experiment.drivers.AlejaStackTestDriver();
        java.lang.Object obj2 = alejaStackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = alejaStackTestDriver0.pop();
        java.lang.Object obj5 = alejaStackTestDriver0.push((java.lang.Object) (short) 10);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 1.0f + "'", obj2, 1.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 1.0f + "'", obj3, 1.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 10 + "'", obj5, (short) 10);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_AlejaStackTest_0_10_0.test5");
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver0 = new experiment.drivers.AlejaStackTestDriver();
        java.lang.Object obj2 = alejaStackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = alejaStackTestDriver0.pop();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 1.0f + "'", obj2, 1.0f);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 1.0f + "'", obj3, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}


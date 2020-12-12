package experiment.util.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_StackTest_0_50_0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test01");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass2 = stackTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test04");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackTestDriver0.pop();
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test05");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) "");
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.push(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test06");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = stackTestDriver0.pop();
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test07");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test08");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = stackTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test09");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test10");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 100L);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test11");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = stackTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test12");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) "");
        java.lang.Object obj6 = stackTestDriver0.pop();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test13");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 10);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test14");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test15");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test16");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 10);
        java.lang.Object obj6 = stackTestDriver0.pop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short) 10 + "'", obj6.equals((short) 10));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test17");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) 1.0f);
        java.lang.Object obj8 = stackTestDriver5.pop();
        java.lang.Object obj10 = stackTestDriver5.push((java.lang.Object) "");
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj12 = stackTestDriver5.pop();
        java.lang.Class<?> wildcardClass13 = stackTestDriver5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + "" + "'", obj12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test18");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 100);
        stackTestDriver0.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test19");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) wildcardClass3);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "class java.lang.Object");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test20");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test21");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Class<?> wildcardClass1 = stackTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test22");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) 1.0f);
        java.lang.Object obj8 = stackTestDriver5.pop();
        java.lang.Object obj10 = stackTestDriver5.push((java.lang.Object) "");
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Class<?> wildcardClass12 = stackTestDriver5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test23");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 10);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0.0d);
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + false + "'", obj9.equals(false));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test24");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        java.lang.Object obj5 = stackTestDriver3.push((java.lang.Object) 1.0f);
        java.lang.Object obj6 = stackTestDriver3.pop();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push(obj6);
        java.lang.Object obj9 = stackTestDriver0.pop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test25");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 100);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 10.0f + "'", obj7.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test26");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) "");
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_50_0.test27");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}


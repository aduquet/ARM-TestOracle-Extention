package experiment.util.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_StackTest_0_100_0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test01");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass2 = stackTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test02");
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
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test03");
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
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test04");
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
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test05");
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
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test06");
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
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test07");
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
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test08");
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
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test09");
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
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test10");
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
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test13");
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
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test14");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test15");
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
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test16");
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
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test17");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Class<?> wildcardClass1 = stackTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test18");
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test20");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass3 = stackTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test21");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 10);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0.0d);
        java.lang.Object obj9 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test22");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) "");
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackTestDriver0.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
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
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test23");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 100);
        stackTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test24");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 100L);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) false);
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) 1.0f);
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver9);
        experiment.util.StackTestDriver stackTestDriver13 = new experiment.util.StackTestDriver();
        java.lang.Object obj15 = stackTestDriver13.push((java.lang.Object) 1.0f);
        java.lang.Object obj16 = stackTestDriver13.pop();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = stackTestDriver0.push(obj16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1.0f + "'", obj11.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1.0f + "'", obj15.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1.0f + "'", obj18.equals(1.0f));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test25");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 100);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass8 = stackTestDriver0.getClass();
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
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test26");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) 1.0f);
        java.lang.Object obj8 = stackTestDriver5.pop();
        java.lang.Object obj10 = stackTestDriver5.push((java.lang.Object) "");
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        java.lang.Object obj13 = stackTestDriver5.push((java.lang.Object) 100L);
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
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100L + "'", obj13.equals(100L));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test27");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 0.0f);
        stackTestDriver0.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0f + "'", obj4.equals(0.0f));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test28");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
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
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test29");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) wildcardClass3);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test30");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 10);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0.0d);
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        stackTestDriver8.clear();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = stackTestDriver8.push((java.lang.Object) wildcardClass11);
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        stackTestDriver8.clear();
        experiment.util.StackTestDriver stackTestDriver16 = new experiment.util.StackTestDriver();
        java.lang.Object obj18 = stackTestDriver16.push((java.lang.Object) 1.0f);
        java.lang.Object obj19 = stackTestDriver16.pop();
        java.lang.Object obj21 = stackTestDriver16.push((java.lang.Object) (short) 10);
        experiment.util.StackTestDriver stackTestDriver22 = new experiment.util.StackTestDriver();
        java.lang.Object obj24 = stackTestDriver22.push((java.lang.Object) 1.0f);
        java.lang.Object obj25 = stackTestDriver22.pop();
        java.lang.Object obj27 = stackTestDriver22.push((java.lang.Object) (byte) 100);
        java.lang.Object obj29 = stackTestDriver22.push((java.lang.Object) 10.0f);
        java.lang.Object obj30 = stackTestDriver16.push((java.lang.Object) 10.0f);
        java.lang.Object obj31 = stackTestDriver8.push((java.lang.Object) stackTestDriver16);
        experiment.util.StackTestDriver stackTestDriver32 = new experiment.util.StackTestDriver();
        stackTestDriver32.clear();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = stackTestDriver32.push((java.lang.Object) wildcardClass35);
        java.lang.Object obj37 = stackTestDriver16.push((java.lang.Object) wildcardClass35);
        java.lang.Object obj38 = stackTestDriver0.push((java.lang.Object) wildcardClass35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj12.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1.0f + "'", obj18.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) 10 + "'", obj21.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1.0f + "'", obj24.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1.0f + "'", obj25.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (byte) 100 + "'", obj27.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 10.0f + "'", obj29.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 10.0f + "'", obj30.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj36.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj37.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj38.toString(), "class java.lang.Object");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test31");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 0.0f);
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0f + "'", obj4.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0d + "'", obj6.equals(1.0d));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test32");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        java.lang.Object obj5 = stackTestDriver3.push((java.lang.Object) 1.0f);
        java.lang.Object obj6 = stackTestDriver3.pop();
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) 1.0f);
        java.lang.Object obj11 = stackTestDriver8.pop();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) "");
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj15 = stackTestDriver8.pop();
        java.lang.Class<?> wildcardClass16 = stackTestDriver8.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = stackTestDriver8.pop();
            org.junit.Assert.fail("Expected exception of type experiment.util.EmptyStackException; message: null");
        } catch (experiment.util.EmptyStackException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1.0f + "'", obj11.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test33");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 100L);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        stackTestDriver10.clear();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = stackTestDriver10.push((java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = stackTestDriver0.push(obj14);
        java.lang.Object obj16 = stackTestDriver0.pop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + false + "'", obj9.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj14.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj15.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj16.toString(), "class java.lang.Object");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test34");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) "");
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) 1.0f);
        java.lang.Object obj11 = stackTestDriver8.pop();
        java.lang.Object obj12 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        stackTestDriver8.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1.0f + "'", obj11.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test35");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        experiment.util.StackTestDriver stackTestDriver1 = new experiment.util.StackTestDriver();
        java.lang.Object obj3 = stackTestDriver1.push((java.lang.Object) 1.0f);
        experiment.util.StackTestDriver stackTestDriver4 = new experiment.util.StackTestDriver();
        java.lang.Object obj6 = stackTestDriver4.push((java.lang.Object) 1.0f);
        java.lang.Object obj7 = stackTestDriver4.pop();
        stackTestDriver4.clear();
        experiment.util.StackTestDriver stackTestDriver9 = new experiment.util.StackTestDriver();
        java.lang.Object obj11 = stackTestDriver9.push((java.lang.Object) 1.0f);
        java.lang.Object obj12 = stackTestDriver9.pop();
        java.lang.Object obj14 = stackTestDriver9.push((java.lang.Object) "");
        java.lang.Object obj15 = stackTestDriver4.push((java.lang.Object) stackTestDriver9);
        java.lang.Object obj16 = stackTestDriver9.pop();
        java.lang.Class<?> wildcardClass17 = stackTestDriver9.getClass();
        java.lang.Object obj18 = stackTestDriver1.push((java.lang.Object) stackTestDriver9);
        java.lang.Object obj19 = stackTestDriver0.push((java.lang.Object) stackTestDriver1);
        java.lang.Object obj20 = stackTestDriver1.pop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1.0f + "'", obj11.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test36");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 0.0f);
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) 1.0f);
        java.lang.Object obj8 = stackTestDriver5.pop();
        stackTestDriver5.clear();
        java.lang.Object obj11 = stackTestDriver5.push((java.lang.Object) 100L);
        java.lang.Object obj13 = stackTestDriver5.push((java.lang.Object) false);
        java.lang.Object obj14 = stackTestDriver5.pop();
        experiment.util.StackTestDriver stackTestDriver15 = new experiment.util.StackTestDriver();
        stackTestDriver15.clear();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = stackTestDriver15.push((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = stackTestDriver5.push(obj19);
        java.lang.Object obj21 = stackTestDriver0.push(obj19);
        java.lang.Object obj22 = stackTestDriver0.pop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0f + "'", obj4.equals(0.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100L + "'", obj11.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + false + "'", obj13.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + false + "'", obj14.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj19.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj20.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj21.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj22.toString(), "class java.lang.Object");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test37");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        java.lang.Object obj5 = stackTestDriver3.push((java.lang.Object) 1.0f);
        java.lang.Object obj6 = stackTestDriver3.pop();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push(obj6);
        stackTestDriver0.clear();
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
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test38");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 10);
        java.lang.Object obj7 = stackTestDriver0.push((java.lang.Object) 0.0d);
        java.lang.Object obj8 = stackTestDriver0.pop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0.0d + "'", obj7.equals(0.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0.0d + "'", obj8.equals(0.0d));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test39");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 100L);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj9 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + false + "'", obj9.equals(false));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test40");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) "");
        java.lang.Object obj6 = stackTestDriver0.pop();
        stackTestDriver0.clear();
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
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test41");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        java.lang.Object obj5 = stackTestDriver3.push((java.lang.Object) 1.0f);
        java.lang.Object obj6 = stackTestDriver3.pop();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push(obj6);
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) 1.0f);
        java.lang.Object obj13 = stackTestDriver10.pop();
        stackTestDriver10.clear();
        java.lang.Object obj16 = stackTestDriver10.push((java.lang.Object) 100L);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) false);
        java.lang.Object obj19 = stackTestDriver10.pop();
        experiment.util.StackTestDriver stackTestDriver20 = new experiment.util.StackTestDriver();
        stackTestDriver20.clear();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = stackTestDriver20.push((java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = stackTestDriver10.push(obj24);
        java.lang.Object obj26 = stackTestDriver0.push((java.lang.Object) stackTestDriver10);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0f + "'", obj13.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100L + "'", obj16.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + false + "'", obj19.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj24.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj25.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test42");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) 1.0f);
        java.lang.Object obj8 = stackTestDriver5.pop();
        java.lang.Object obj10 = stackTestDriver5.push((java.lang.Object) "");
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        stackTestDriver5.clear();
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
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test43");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) wildcardClass3);
        java.lang.Object obj5 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        java.lang.Class<?> wildcardClass7 = stackTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj5.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test44");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        java.lang.Object obj5 = stackTestDriver3.push((java.lang.Object) 1.0f);
        java.lang.Object obj6 = stackTestDriver3.pop();
        stackTestDriver3.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) 1.0f);
        java.lang.Object obj11 = stackTestDriver8.pop();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) "");
        java.lang.Object obj14 = stackTestDriver3.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj15 = stackTestDriver8.pop();
        java.lang.Class<?> wildcardClass16 = stackTestDriver8.getClass();
        java.lang.Object obj17 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1.0f + "'", obj11.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test45");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1L + "'", obj4.equals(1L));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test46");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (short) 10);
        stackTestDriver0.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short) 10 + "'", obj5.equals((short) 10));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test47");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        java.lang.Object obj5 = stackTestDriver0.push((java.lang.Object) (byte) 100);
        experiment.util.StackTestDriver stackTestDriver6 = new experiment.util.StackTestDriver();
        java.lang.Object obj8 = stackTestDriver6.push((java.lang.Object) 1.0f);
        java.lang.Object obj9 = stackTestDriver6.pop();
        stackTestDriver6.clear();
        java.lang.Object obj12 = stackTestDriver6.push((java.lang.Object) 100L);
        java.lang.Object obj14 = stackTestDriver6.push((java.lang.Object) false);
        java.lang.Object obj15 = stackTestDriver6.pop();
        java.lang.Object obj16 = stackTestDriver0.push(obj15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (byte) 100 + "'", obj5.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100L + "'", obj12.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + false + "'", obj14.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false + "'", obj15.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false + "'", obj16.equals(false));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test48");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) wildcardClass3);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) 1.0f);
        java.lang.Object obj11 = stackTestDriver8.pop();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (short) 10);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) 1.0f);
        java.lang.Object obj17 = stackTestDriver14.pop();
        java.lang.Object obj19 = stackTestDriver14.push((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = stackTestDriver14.push((java.lang.Object) 10.0f);
        java.lang.Object obj22 = stackTestDriver8.push((java.lang.Object) 10.0f);
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        experiment.util.StackTestDriver stackTestDriver24 = new experiment.util.StackTestDriver();
        stackTestDriver24.clear();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = stackTestDriver24.push((java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = stackTestDriver8.push((java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass30 = stackTestDriver8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1.0f + "'", obj11.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 10 + "'", obj13.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0f + "'", obj17.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) 100 + "'", obj19.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 10.0f + "'", obj21.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10.0f + "'", obj22.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj28.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj29.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test49");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) wildcardClass3);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) 1.0f);
        java.lang.Object obj11 = stackTestDriver8.pop();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (short) 10);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) 1.0f);
        java.lang.Object obj17 = stackTestDriver14.pop();
        java.lang.Object obj19 = stackTestDriver14.push((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = stackTestDriver14.push((java.lang.Object) 10.0f);
        java.lang.Object obj22 = stackTestDriver8.push((java.lang.Object) 10.0f);
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Object obj25 = stackTestDriver0.push((java.lang.Object) (short) 10);
        experiment.util.StackTestDriver stackTestDriver26 = new experiment.util.StackTestDriver();
        java.lang.Object obj28 = stackTestDriver26.push((java.lang.Object) 1.0f);
        java.lang.Object obj29 = stackTestDriver26.pop();
        java.lang.Object obj31 = stackTestDriver26.push((java.lang.Object) (byte) 100);
        java.lang.Object obj33 = stackTestDriver26.push((java.lang.Object) 10.0f);
        java.lang.Object obj34 = stackTestDriver0.push(obj33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1.0f + "'", obj11.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 10 + "'", obj13.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0f + "'", obj17.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) 100 + "'", obj19.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 10.0f + "'", obj21.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10.0f + "'", obj22.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) 10 + "'", obj25.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1.0f + "'", obj28.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1.0f + "'", obj29.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (byte) 100 + "'", obj31.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 10.0f + "'", obj33.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 10.0f + "'", obj34.equals(10.0f));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test50");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver5 = new experiment.util.StackTestDriver();
        java.lang.Object obj7 = stackTestDriver5.push((java.lang.Object) 1.0f);
        java.lang.Object obj8 = stackTestDriver5.pop();
        java.lang.Object obj10 = stackTestDriver5.push((java.lang.Object) "");
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) stackTestDriver5);
        stackTestDriver0.clear();
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
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test51");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        stackTestDriver0.clear();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.Object obj4 = stackTestDriver0.push((java.lang.Object) wildcardClass3);
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        stackTestDriver0.clear();
        experiment.util.StackTestDriver stackTestDriver8 = new experiment.util.StackTestDriver();
        java.lang.Object obj10 = stackTestDriver8.push((java.lang.Object) 1.0f);
        java.lang.Object obj11 = stackTestDriver8.pop();
        java.lang.Object obj13 = stackTestDriver8.push((java.lang.Object) (short) 10);
        experiment.util.StackTestDriver stackTestDriver14 = new experiment.util.StackTestDriver();
        java.lang.Object obj16 = stackTestDriver14.push((java.lang.Object) 1.0f);
        java.lang.Object obj17 = stackTestDriver14.pop();
        java.lang.Object obj19 = stackTestDriver14.push((java.lang.Object) (byte) 100);
        java.lang.Object obj21 = stackTestDriver14.push((java.lang.Object) 10.0f);
        java.lang.Object obj22 = stackTestDriver8.push((java.lang.Object) 10.0f);
        java.lang.Object obj23 = stackTestDriver0.push((java.lang.Object) stackTestDriver8);
        java.lang.Class<?> wildcardClass24 = stackTestDriver8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj4.toString(), "class java.lang.Object");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1.0f + "'", obj11.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + (short) 10 + "'", obj13.equals((short) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0f + "'", obj17.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) 100 + "'", obj19.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 10.0f + "'", obj21.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 10.0f + "'", obj22.equals(10.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test52");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        experiment.util.StackTestDriver stackTestDriver3 = new experiment.util.StackTestDriver();
        java.lang.Object obj5 = stackTestDriver3.push((java.lang.Object) 1.0f);
        java.lang.Object obj6 = stackTestDriver3.pop();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        java.lang.Object obj8 = stackTestDriver0.push(obj6);
        java.lang.Object obj9 = stackTestDriver0.pop();
        experiment.util.StackTestDriver stackTestDriver10 = new experiment.util.StackTestDriver();
        java.lang.Object obj12 = stackTestDriver10.push((java.lang.Object) 1.0f);
        java.lang.Object obj13 = stackTestDriver10.pop();
        stackTestDriver10.clear();
        java.lang.Object obj16 = stackTestDriver10.push((java.lang.Object) 100L);
        java.lang.Object obj18 = stackTestDriver10.push((java.lang.Object) false);
        experiment.util.StackTestDriver stackTestDriver19 = new experiment.util.StackTestDriver();
        java.lang.Object obj21 = stackTestDriver19.push((java.lang.Object) 1.0f);
        java.lang.Object obj22 = stackTestDriver10.push((java.lang.Object) stackTestDriver19);
        java.lang.Object obj23 = stackTestDriver0.push(obj22);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0f + "'", obj13.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100L + "'", obj16.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + false + "'", obj18.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test53");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 100L);
        java.lang.Object obj8 = stackTestDriver0.push((java.lang.Object) false);
        java.lang.Object obj9 = stackTestDriver0.pop();
        java.lang.Object obj11 = stackTestDriver0.push((java.lang.Object) (byte) -1);
        java.lang.Object obj12 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + false + "'", obj8.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + false + "'", obj9.equals(false));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte) -1 + "'", obj11.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (byte) -1 + "'", obj12.equals((byte) -1));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_StackTest_0_100_0.test54");
        experiment.util.StackTestDriver stackTestDriver0 = new experiment.util.StackTestDriver();
        java.lang.Object obj2 = stackTestDriver0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackTestDriver0.pop();
        stackTestDriver0.clear();
        java.lang.Object obj6 = stackTestDriver0.push((java.lang.Object) 100L);
        java.lang.Object obj7 = stackTestDriver0.pop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + 1.0f + "'", obj2.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L + "'", obj6.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L + "'", obj7.equals(100L));
    }
}


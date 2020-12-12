package experiment.util.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeMapTest_0_50_0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test01");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass2 = treeMapTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test02");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1.0f);
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0.0f, (java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.Boolean");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test03");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver8 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver8.clear();
        treeMapTestDriver8.clear();
        java.lang.Object obj13 = treeMapTestDriver8.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.put((java.lang.Object) 0L, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test04");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        treeMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass7 = treeMapTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test05");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj3 = treeMapTestDriver0.put((java.lang.Object) '4', (java.lang.Object) (byte) 1);
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver4.put((java.lang.Object) '4', (java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test06");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj3 = treeMapTestDriver0.put((java.lang.Object) '4', (java.lang.Object) (byte) 1);
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj6 = treeMapTestDriver4.remove((java.lang.Object) 1.0f);
        java.lang.Object obj9 = treeMapTestDriver4.put((java.lang.Object) 0.0f, (java.lang.Object) '#');
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver10.clear();
        treeMapTestDriver10.clear();
        treeMapTestDriver10.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.put((java.lang.Object) 0.0f, (java.lang.Object) treeMapTestDriver10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to java.lang.Float");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test07");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver6.remove((java.lang.Object) 1.0f);
        java.lang.Object obj10 = treeMapTestDriver6.remove((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.remove(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test08");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.Long");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test09");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1.0f);
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0.0f, (java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.Byte");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test10");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test11");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        treeMapTestDriver0.clear();
        java.lang.Object obj8 = treeMapTestDriver0.remove((java.lang.Object) 100);
        experiment.util.TreeMapTestDriver treeMapTestDriver9 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj11 = treeMapTestDriver9.remove((java.lang.Object) 1.0f);
        java.lang.Object obj13 = treeMapTestDriver9.remove((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test12");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1.0f);
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0.0f, (java.lang.Object) '#');
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.put((java.lang.Object) (byte) 10, obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test13");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1.0f);
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) 0.0f, (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass6 = treeMapTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test14");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.put((java.lang.Object) (-1.0d), (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.Double");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test15");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = treeMapTestDriver0.put(obj6, obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test16");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test17");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Class<?> wildcardClass1 = treeMapTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test18");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver7.clear();
        treeMapTestDriver7.clear();
        treeMapTestDriver7.clear();
        java.lang.Class<?> wildcardClass11 = treeMapTestDriver7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver7, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test19");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        experiment.util.TreeMapTestDriver treeMapTestDriver6 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver6.clear();
        treeMapTestDriver6.clear();
        java.lang.Object obj10 = treeMapTestDriver6.remove((java.lang.Object) 1);
        java.lang.Object obj12 = treeMapTestDriver6.remove((java.lang.Object) 100.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver13 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver13.clear();
        treeMapTestDriver13.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver6, (java.lang.Object) treeMapTestDriver13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test20");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 10);
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver4.put((java.lang.Object) '4', (java.lang.Object) (byte) 1);
        treeMapTestDriver4.clear();
        java.lang.Class<?> wildcardClass9 = treeMapTestDriver4.getClass();
        experiment.util.TreeMapTestDriver treeMapTestDriver10 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver10.clear();
        treeMapTestDriver10.clear();
        java.lang.Object obj15 = treeMapTestDriver10.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        treeMapTestDriver10.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver17 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj19 = treeMapTestDriver17.remove((java.lang.Object) 1.0f);
        java.lang.Object obj21 = treeMapTestDriver17.remove((java.lang.Object) 100.0f);
        java.lang.Object obj22 = treeMapTestDriver10.remove((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = treeMapTestDriver0.put((java.lang.Object) treeMapTestDriver4, obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test21");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test22");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) (-1L));
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test23");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        java.lang.Object obj3 = treeMapTestDriver0.remove((java.lang.Object) (-1));
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeMapTestDriver0.put((java.lang.Object) wildcardClass5, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test24");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test25");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        java.lang.Object obj5 = treeMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) 1.0d);
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_0_50_0.test26");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 1.0f);
        java.lang.Object obj4 = treeMapTestDriver0.remove((java.lang.Object) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }
}


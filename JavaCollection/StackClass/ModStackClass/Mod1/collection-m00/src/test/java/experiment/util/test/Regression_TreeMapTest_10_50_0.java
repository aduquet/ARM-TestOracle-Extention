package experiment.util.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_TreeMapTest_10_50_0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test01");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj3 = treeMapTestDriver0.put((java.lang.Object) (short) 10, (java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Character");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test02");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj5 = treeMapTestDriver2.put((java.lang.Object) (short) 10, (java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (short) 10, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test03");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj3 = treeMapTestDriver0.put((java.lang.Object) (short) 10, (java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Long");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test04");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test05");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj3 = treeMapTestDriver0.put((java.lang.Object) (short) 10, (java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Byte");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test06");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj3 = treeMapTestDriver0.put((java.lang.Object) (short) -1, (java.lang.Object) 10);
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeMapTestDriver0.remove(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test07");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        java.lang.Object obj4 = treeMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) (short) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj8 = treeMapTestDriver5.put((java.lang.Object) (short) 10, (java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeMapTestDriver0.remove(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test08");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeMapTestDriver0.put((java.lang.Object) (-1.0d), obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test09");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = treeMapTestDriver0.put((java.lang.Object) 100L, obj2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = obj3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test10");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj3 = treeMapTestDriver0.put((java.lang.Object) (short) 10, (java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Character");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test11");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test12");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = treeMapTestDriver0.put((java.lang.Object) 100L, obj2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.Double");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test13");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj3 = treeMapTestDriver0.put((java.lang.Object) (short) -1, (java.lang.Object) 10);
        java.lang.Class<?> wildcardClass4 = treeMapTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test14");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass2 = treeMapTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test15");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        java.lang.Object obj3 = treeMapTestDriver0.remove((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = obj3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test16");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        java.lang.Object obj3 = treeMapTestDriver0.remove((java.lang.Object) (-1.0d));
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = treeMapTestDriver0.remove(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test17");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj3 = treeMapTestDriver0.put((java.lang.Object) (short) 10, (java.lang.Object) (byte) 10);
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj7 = treeMapTestDriver4.put((java.lang.Object) (short) 10, (java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = treeMapTestDriver0.put((java.lang.Object) (byte) 10, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Byte");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test18");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        java.lang.Object obj4 = treeMapTestDriver0.put((java.lang.Object) 1, (java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test19");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        experiment.util.TreeMapTestDriver treeMapTestDriver1 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj3 = treeMapTestDriver1.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj6 = treeMapTestDriver1.put((java.lang.Object) '#', (java.lang.Object) (short) -1);
        java.lang.Object obj7 = treeMapTestDriver0.remove((java.lang.Object) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test20");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        java.lang.Object obj4 = treeMapTestDriver0.put((java.lang.Object) 100.0d, (java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test21");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj3 = treeMapTestDriver0.put((java.lang.Object) (short) -1, (java.lang.Object) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) 0.0d, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Double");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test22");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = treeMapTestDriver0.remove((java.lang.Object) (byte) 100);
        experiment.util.TreeMapTestDriver treeMapTestDriver4 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj6 = treeMapTestDriver4.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj9 = treeMapTestDriver4.put((java.lang.Object) '#', (java.lang.Object) (short) -1);
        java.lang.Object obj10 = treeMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) (short) -1);
        treeMapTestDriver0.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test23");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = treeMapTestDriver0.remove(obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test24");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj3 = treeMapTestDriver0.put((java.lang.Object) (short) 10, (java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeMapTestDriver0.put((java.lang.Object) 0.0f, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to java.lang.Float");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test25");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        java.lang.Object obj3 = treeMapTestDriver0.remove((java.lang.Object) (-1.0d));
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        java.lang.Object obj8 = treeMapTestDriver0.put((java.lang.Object) true, (java.lang.Object) (-1.0d));
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.put(obj9, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test26");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = treeMapTestDriver0.put((java.lang.Object) 100L, obj2);
        treeMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass5 = treeMapTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test27");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        java.lang.Object obj3 = treeMapTestDriver0.remove((java.lang.Object) (-1.0d));
        treeMapTestDriver0.clear();
        treeMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = treeMapTestDriver0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test28");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        java.lang.Object obj4 = treeMapTestDriver0.put((java.lang.Object) 1, (java.lang.Object) 1.0f);
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver5.clear();
        java.lang.Object obj8 = treeMapTestDriver5.remove((java.lang.Object) (-1.0d));
        treeMapTestDriver5.clear();
        treeMapTestDriver5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = treeMapTestDriver0.remove((java.lang.Object) treeMapTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: experiment.util.TreeMapTestDriver cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test29");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj3 = treeMapTestDriver0.put((java.lang.Object) (short) -1, (java.lang.Object) 10);
        java.lang.Object obj5 = treeMapTestDriver0.remove((java.lang.Object) (short) -1);
        treeMapTestDriver0.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10 + "'", obj5.equals(10));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test30");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        java.lang.Object obj4 = treeMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = treeMapTestDriver0.put((java.lang.Object) "hi!", (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test31");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        java.lang.Object obj4 = treeMapTestDriver0.put((java.lang.Object) 100.0d, (java.lang.Object) 10.0d);
        experiment.util.TreeMapTestDriver treeMapTestDriver5 = new experiment.util.TreeMapTestDriver();
        java.lang.Class<?> wildcardClass6 = treeMapTestDriver5.getClass();
        experiment.util.TreeMapTestDriver treeMapTestDriver7 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver7.clear();
        java.lang.Object obj10 = treeMapTestDriver7.remove((java.lang.Object) (-1.0d));
        treeMapTestDriver7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = treeMapTestDriver0.put((java.lang.Object) wildcardClass6, (java.lang.Object) treeMapTestDriver7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_TreeMapTest_10_50_0.test32");
        experiment.util.TreeMapTestDriver treeMapTestDriver0 = new experiment.util.TreeMapTestDriver();
        treeMapTestDriver0.clear();
        experiment.util.TreeMapTestDriver treeMapTestDriver2 = new experiment.util.TreeMapTestDriver();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj5 = treeMapTestDriver2.put((java.lang.Object) 100L, obj4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = treeMapTestDriver0.remove(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj5);
    }
}


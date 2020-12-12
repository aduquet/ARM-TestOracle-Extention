package experiment.drivers.test;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_AlejaStackTest_0_8000_4 {

    public static boolean debug = false;

    @Before
    public void setup() {
        System.setProperty("testId", java.time.Instant.now().toEpochMilli() + ":" + java.util.UUID.randomUUID().toString());
    }

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_AlejaStackTest_0_8000_4.test2001");
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver0 = new experiment.drivers.AlejaStackTestDriver();
        java.lang.Object obj2 = alejaStackTestDriver0.push((java.lang.Object) 1.0f);
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver3 = new experiment.drivers.AlejaStackTestDriver();
        java.lang.Object obj5 = alejaStackTestDriver3.push((java.lang.Object) 1.0f);
        java.lang.Object obj6 = alejaStackTestDriver3.pop();
        alejaStackTestDriver3.clear();
        alejaStackTestDriver3.clear();
        alejaStackTestDriver3.clear();
        java.lang.Object obj10 = alejaStackTestDriver0.push((java.lang.Object) alejaStackTestDriver3);
        java.lang.Object obj12 = alejaStackTestDriver0.push((java.lang.Object) (byte) 0);
        java.lang.Object obj13 = alejaStackTestDriver0.pop();
        alejaStackTestDriver0.clear();
        alejaStackTestDriver0.clear();
        alejaStackTestDriver0.clear();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 1.0f + "'", obj2, 1.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 0 + "'", obj13, (byte) 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_AlejaStackTest_0_8000_4.test2002");
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver0 = new experiment.drivers.AlejaStackTestDriver();
        java.lang.Object obj2 = alejaStackTestDriver0.push((java.lang.Object) 1.0f);
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver3 = new experiment.drivers.AlejaStackTestDriver();
        java.lang.Object obj5 = alejaStackTestDriver3.push((java.lang.Object) 1.0f);
        java.lang.Object obj6 = alejaStackTestDriver3.pop();
        alejaStackTestDriver3.clear();
        alejaStackTestDriver3.clear();
        alejaStackTestDriver3.clear();
        java.lang.Object obj10 = alejaStackTestDriver0.push((java.lang.Object) alejaStackTestDriver3);
        java.lang.Object obj12 = alejaStackTestDriver0.push((java.lang.Object) (byte) 0);
        alejaStackTestDriver0.clear();
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver14 = new experiment.drivers.AlejaStackTestDriver();
        alejaStackTestDriver14.clear();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = alejaStackTestDriver14.push((java.lang.Object) wildcardClass17);
        alejaStackTestDriver14.clear();
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver20 = new experiment.drivers.AlejaStackTestDriver();
        java.lang.Object obj22 = alejaStackTestDriver20.push((java.lang.Object) 1.0f);
        java.lang.Object obj23 = alejaStackTestDriver20.pop();
        alejaStackTestDriver20.clear();
        java.lang.Object obj26 = alejaStackTestDriver20.push((java.lang.Object) 100L);
        java.lang.Object obj27 = alejaStackTestDriver14.push(obj26);
        java.lang.Object obj29 = alejaStackTestDriver14.push((java.lang.Object) 1.0f);
        alejaStackTestDriver14.clear();
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver31 = new experiment.drivers.AlejaStackTestDriver();
        java.lang.Object obj33 = alejaStackTestDriver31.push((java.lang.Object) 1.0f);
        java.lang.Object obj34 = alejaStackTestDriver31.pop();
        alejaStackTestDriver31.clear();
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver36 = new experiment.drivers.AlejaStackTestDriver();
        alejaStackTestDriver36.clear();
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        java.lang.Object obj40 = alejaStackTestDriver36.push((java.lang.Object) wildcardClass39);
        alejaStackTestDriver36.clear();
        alejaStackTestDriver36.clear();
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver43 = new experiment.drivers.AlejaStackTestDriver();
        alejaStackTestDriver43.clear();
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        java.lang.Object obj47 = alejaStackTestDriver43.push((java.lang.Object) wildcardClass46);
        java.lang.Object obj48 = alejaStackTestDriver36.push((java.lang.Object) wildcardClass46);
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver49 = new experiment.drivers.AlejaStackTestDriver();
        java.lang.Object obj51 = alejaStackTestDriver49.push((java.lang.Object) 1.0f);
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver52 = new experiment.drivers.AlejaStackTestDriver();
        java.lang.Object obj54 = alejaStackTestDriver52.push((java.lang.Object) 1.0f);
        java.lang.Object obj55 = alejaStackTestDriver52.pop();
        alejaStackTestDriver52.clear();
        alejaStackTestDriver52.clear();
        alejaStackTestDriver52.clear();
        java.lang.Object obj59 = alejaStackTestDriver49.push((java.lang.Object) alejaStackTestDriver52);
        java.lang.Object obj61 = alejaStackTestDriver49.push((java.lang.Object) 10L);
        java.lang.Object obj63 = alejaStackTestDriver49.push((java.lang.Object) 0L);
        java.lang.Object obj64 = alejaStackTestDriver36.push(obj63);
        alejaStackTestDriver36.clear();
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver66 = new experiment.drivers.AlejaStackTestDriver();
        java.lang.Object obj68 = alejaStackTestDriver66.push((java.lang.Object) 1.0f);
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver69 = new experiment.drivers.AlejaStackTestDriver();
        java.lang.Object obj71 = alejaStackTestDriver69.push((java.lang.Object) 1.0f);
        java.lang.Object obj72 = alejaStackTestDriver69.pop();
        alejaStackTestDriver69.clear();
        alejaStackTestDriver69.clear();
        alejaStackTestDriver69.clear();
        java.lang.Object obj76 = alejaStackTestDriver66.push((java.lang.Object) alejaStackTestDriver69);
        alejaStackTestDriver66.clear();
        java.lang.Class<?> wildcardClass78 = alejaStackTestDriver66.getClass();
        java.lang.Object obj79 = alejaStackTestDriver36.push((java.lang.Object) wildcardClass78);
        java.lang.Object obj80 = alejaStackTestDriver31.push((java.lang.Object) wildcardClass78);
        java.lang.Object obj81 = alejaStackTestDriver14.push(obj80);
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver82 = new experiment.drivers.AlejaStackTestDriver();
        java.lang.Object obj84 = alejaStackTestDriver82.push((java.lang.Object) 1.0f);
        java.lang.Object obj85 = alejaStackTestDriver82.pop();
        java.lang.Object obj87 = alejaStackTestDriver82.push((java.lang.Object) (short) 10);
        java.lang.Object obj89 = alejaStackTestDriver82.push((java.lang.Object) "hi!");
        experiment.drivers.AlejaStackTestDriver alejaStackTestDriver90 = new experiment.drivers.AlejaStackTestDriver();
        alejaStackTestDriver90.clear();
        java.lang.Object obj92 = new java.lang.Object();
        java.lang.Class<?> wildcardClass93 = obj92.getClass();
        java.lang.Object obj94 = alejaStackTestDriver90.push((java.lang.Object) wildcardClass93);
        java.lang.Object obj95 = alejaStackTestDriver82.push((java.lang.Object) alejaStackTestDriver90);
        java.lang.Object obj96 = alejaStackTestDriver82.pop();
        java.lang.Object obj97 = alejaStackTestDriver14.push(obj96);
        java.lang.Object obj98 = alejaStackTestDriver0.push((java.lang.Object) alejaStackTestDriver14);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 1.0f + "'", obj2, 1.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 1.0f + "'", obj6, 1.0f);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (byte) 0 + "'", obj12, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1.0f + "'", obj22, 1.0f);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1.0f + "'", obj23, 1.0f);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100L + "'", obj26, 100L);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100L + "'", obj27, 100L);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 1.0f + "'", obj29, 1.0f);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1.0f + "'", obj33, 1.0f);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 1.0f + "'", obj34, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "class java.lang.Object");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "class java.lang.Object");
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 1.0f + "'", obj51, 1.0f);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 1.0f + "'", obj54, 1.0f);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 1.0f + "'", obj55, 1.0f);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 10L + "'", obj61, 10L);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + 0L + "'", obj63, 0L);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 0L + "'", obj64, 0L);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 1.0f + "'", obj68, 1.0f);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 1.0f + "'", obj71, 1.0f);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 1.0f + "'", obj72, 1.0f);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertEquals(obj79.toString(), "class experiment.drivers.AlejaStackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj79), "class experiment.drivers.AlejaStackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj79), "class experiment.drivers.AlejaStackTestDriver");
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertEquals(obj80.toString(), "class experiment.drivers.AlejaStackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj80), "class experiment.drivers.AlejaStackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj80), "class experiment.drivers.AlejaStackTestDriver");
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertEquals(obj81.toString(), "class experiment.drivers.AlejaStackTestDriver");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj81), "class experiment.drivers.AlejaStackTestDriver");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj81), "class experiment.drivers.AlejaStackTestDriver");
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + 1.0f + "'", obj84, 1.0f);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + 1.0f + "'", obj85, 1.0f);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + (short) 10 + "'", obj87, (short) 10);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + "hi!" + "'", obj89, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNotNull(obj94);
        org.junit.Assert.assertEquals(obj94.toString(), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj94), "class java.lang.Object");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj94), "class java.lang.Object");
        org.junit.Assert.assertNotNull(obj95);
        org.junit.Assert.assertNotNull(obj96);
        org.junit.Assert.assertNotNull(obj97);
        org.junit.Assert.assertNotNull(obj98);
    }
}


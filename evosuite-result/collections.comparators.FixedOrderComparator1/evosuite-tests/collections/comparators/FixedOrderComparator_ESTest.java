/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 09 20:18:48 GMT 2017
 */

package collections.comparators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import collections.comparators.FixedOrderComparator;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FixedOrderComparator_ESTest extends FixedOrderComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      // Undeclared exception!
      try { 
        fixedOrderComparator0.setUnknownObjectBehavior(1259);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unrecognised value for unknown behaviour flag
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      fixedOrderComparator0.checkLocked();
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      fixedOrderComparator0.compare(objectArray0[0], fixedOrderComparator0.UNKNOWN_AFTER);
      boolean boolean0 = fixedOrderComparator0.isLocked();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
      
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      int int0 = fixedOrderComparator0.getUnknownObjectBehavior();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      linkedList0.add((Object) linkedList0);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.add(linkedList0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      boolean boolean0 = fixedOrderComparator0.add("4c><aCJ}&");
      assertTrue(boolean0);
      
      boolean boolean1 = fixedOrderComparator0.add("4c><aCJ}&");
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.isLocked();
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      fixedOrderComparator0.add(linkedList0);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.compare(linkedList0, "y~05]oK<?/d5BW*J");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attempting to compare unknown object y~05]oK<?/d5BW*J
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      fixedOrderComparator0.setUnknownObjectBehavior(1);
      fixedOrderComparator0.add(2);
      fixedOrderComparator0.addAsEqual(2, (Object) null);
      Object object0 = new Object();
      int int0 = fixedOrderComparator0.compare(object0, (Object) null);
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      fixedOrderComparator0.setUnknownObjectBehavior(1);
      fixedOrderComparator0.add(2);
      int int0 = fixedOrderComparator0.compare(2, "");
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      fixedOrderComparator0.add((Object) null);
      int int0 = fixedOrderComparator0.compare(fixedOrderComparator0, (Object) null);
      assertTrue(fixedOrderComparator0.isLocked());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      fixedOrderComparator0.compare(fixedOrderComparator0, (Object) null);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.checkLocked();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a FixedOrderComparator after a comparison
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      fixedOrderComparator0.add("4c><aCJ}&");
      fixedOrderComparator0.compare("4c><aCJ}&", "4c><aCJ}&");
      // Undeclared exception!
      try { 
        fixedOrderComparator0.add("4c><aCJ}&");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a FixedOrderComparator after a comparison
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        fixedOrderComparator0.compare((Object) null, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Attempting to compare unknown object null
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        fixedOrderComparator0.addAsEqual(object0, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // java.lang.Object@5661955f not known to collections.comparators.FixedOrderComparator@1
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      assertFalse(fixedOrderComparator0.isLocked());
      
      fixedOrderComparator0.setUnknownObjectBehavior(2);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      // Undeclared exception!
      try { 
        fixedOrderComparator0.setUnknownObjectBehavior((-421));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unrecognised value for unknown behaviour flag
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      fixedOrderComparator0.setUnknownObjectBehavior(0);
      fixedOrderComparator0.compare(objectArray0[1], fixedOrderComparator0.UNKNOWN_AFTER);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.addAsEqual(objectArray0[1], "X/Ax`\"*vc6(o6");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a FixedOrderComparator after a comparison
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) null);
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = null;
      try {
        fixedOrderComparator0 = new FixedOrderComparator((List) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The list of items must not be null
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(linkedList0);
      assertFalse(fixedOrderComparator0.isLocked());
      
      boolean boolean0 = fixedOrderComparator0.add(linkedList0);
      boolean boolean1 = fixedOrderComparator0.addAsEqual(linkedList0, linkedList0);
      assertEquals(2, fixedOrderComparator0.getUnknownObjectBehavior());
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = null;
      try {
        fixedOrderComparator0 = new FixedOrderComparator((Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The list of items must not be null
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator();
      fixedOrderComparator0.setUnknownObjectBehavior(1);
      Object object0 = new Object();
      fixedOrderComparator0.compare((Object) null, object0);
      // Undeclared exception!
      try { 
        fixedOrderComparator0.setUnknownObjectBehavior(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot modify a FixedOrderComparator after a comparison
         //
         verifyException("collections.comparators.FixedOrderComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      FixedOrderComparator fixedOrderComparator0 = new FixedOrderComparator(objectArray0);
      int int0 = fixedOrderComparator0.getUnknownObjectBehavior();
      assertEquals(2, int0);
  }
}

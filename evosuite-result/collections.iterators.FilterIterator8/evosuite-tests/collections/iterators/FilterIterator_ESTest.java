/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 09 20:55:17 GMT 2017
 */

package collections.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import collections.Predicate;
import collections.functors.InstanceofPredicate;
import collections.functors.UniquePredicate;
import collections.iterators.FilterIterator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FilterIterator_ESTest extends FilterIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FilterIterator filterIterator0 = new FilterIterator();
      Predicate predicate0 = filterIterator0.getPredicate();
      assertNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FilterIterator filterIterator0 = new FilterIterator();
      Iterator iterator0 = filterIterator0.getIterator();
      assertNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = linkedList0.listIterator();
      FilterIterator filterIterator0 = new FilterIterator(listIterator0);
      linkedList0.clear();
      // Undeclared exception!
      try { 
        filterIterator0.remove();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FilterIterator filterIterator0 = new FilterIterator();
      // Undeclared exception!
      try { 
        filterIterator0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.iterators.FilterIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.iterator();
      Class<String> class0 = String.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      linkedList0.addFirst(predicate0);
      FilterIterator filterIterator0 = new FilterIterator(iterator0, predicate0);
      // Undeclared exception!
      try { 
        filterIterator0.next();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FilterIterator filterIterator0 = new FilterIterator();
      // Undeclared exception!
      try { 
        filterIterator0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.iterators.FilterIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      linkedList0.add(object0);
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      linkedList0.add(object0);
      FilterIterator filterIterator0 = new FilterIterator(iterator0);
      // Undeclared exception!
      try { 
        filterIterator0.hasNext();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FilterIterator filterIterator0 = new FilterIterator();
      // Undeclared exception!
      try { 
        filterIterator0.hasNext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.iterators.FilterIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      Predicate predicate0 = UniquePredicate.getInstance();
      FilterIterator filterIterator0 = new FilterIterator(iterator0, predicate0);
      // Undeclared exception!
      try { 
        filterIterator0.remove();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) null);
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      Predicate predicate0 = UniquePredicate.getInstance();
      FilterIterator filterIterator0 = new FilterIterator(iterator0, predicate0);
      filterIterator0.next();
      filterIterator0.remove();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      Predicate predicate0 = UniquePredicate.getInstance();
      FilterIterator filterIterator0 = new FilterIterator(iterator0, predicate0);
      // Undeclared exception!
      try { 
        filterIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.iterators.FilterIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) null);
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      Predicate predicate0 = UniquePredicate.getInstance();
      FilterIterator filterIterator0 = new FilterIterator(iterator0, predicate0);
      filterIterator0.hasNext();
      Object object0 = filterIterator0.next();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      Predicate predicate0 = UniquePredicate.getInstance();
      FilterIterator filterIterator0 = new FilterIterator(iterator0, predicate0);
      boolean boolean0 = filterIterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.iterator();
      Class<String> class0 = String.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      FilterIterator filterIterator0 = new FilterIterator(iterator0, predicate0);
      filterIterator0.setPredicate(predicate0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      Predicate predicate0 = UniquePredicate.getInstance();
      FilterIterator filterIterator0 = new FilterIterator(iterator0, predicate0);
      Iterator iterator1 = filterIterator0.getIterator();
      assertNotNull(iterator1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Iterator<Object> iterator0 = linkedList0.descendingIterator();
      Predicate predicate0 = UniquePredicate.getInstance();
      FilterIterator filterIterator0 = new FilterIterator(iterator0, predicate0);
      Predicate predicate1 = filterIterator0.getPredicate();
      assertSame(predicate0, predicate1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FilterIterator filterIterator0 = new FilterIterator();
      filterIterator0.setIterator(filterIterator0);
  }
}
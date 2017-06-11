/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 09 21:01:28 GMT 2017
 */

package collections.map;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import collections.Predicate;
import collections.functors.AllPredicate;
import collections.functors.InstanceofPredicate;
import collections.functors.NotNullPredicate;
import collections.functors.TruePredicate;
import collections.functors.UniquePredicate;
import collections.map.PredicatedMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PredicatedMap_ESTest extends PredicatedMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, truePredicate0, truePredicate0);
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      predicatedMap0.putAll(hashMap1);
      assertTrue(hashMap1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      Class<String> class1 = String.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class1);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, instanceofPredicate0);
      Object object0 = predicatedMap0.checkSetValue("Map must not be null");
      assertEquals("Map must not be null", object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, truePredicate0, truePredicate0);
      Integer integer0 = new Integer(1);
      predicatedMap0.validate(integer0, integer0);
      assertTrue(predicatedMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Map map0 = PredicatedMap.decorate(hashMap0, (Predicate) null, (Predicate) null);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, (Predicate) null, (Predicate) null);
      predicatedMap0.put((Object) null, "-\"2-");
      predicatedMap0.put((Object) null, "`HmT0Rz#P?OHDdE");
      assertEquals(1, map0.size());
      assertEquals(1, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, truePredicate0, truePredicate0);
      Object object0 = predicatedMap0.checkSetValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Class<String> class0 = String.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, instanceofPredicate0, instanceofPredicate0);
      Object object0 = new Object();
      Integer integer0 = new Integer(1377);
      // Undeclared exception!
      try { 
        predicatedMap0.validate(object0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, truePredicate0, truePredicate0);
      Integer integer0 = new Integer(1);
      Object object0 = predicatedMap0.put(truePredicate0, integer0);
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      Set<Map.Entry<Object, String>> set0 = (Set<Map.Entry<Object, String>>)hashMap1.entrySet();
      hashMap0.put(set0, object0);
      hashMap1.put(hashMap0, "");
      // Undeclared exception!
      try { 
        predicatedMap0.putAll(hashMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Predicate predicate0 = TruePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.putAll((Map) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Predicate[] predicateArray0 = new Predicate[3];
      Predicate predicate0 = UniquePredicate.getInstance();
      predicateArray0[0] = predicate0;
      Predicate predicate1 = NotNullPredicate.getInstance();
      predicateArray0[1] = predicate1;
      Predicate predicate2 = UniquePredicate.getInstance();
      predicateArray0[2] = predicate2;
      hashMap0.put(predicateArray0[2], "");
      Predicate predicate3 = AllPredicate.getInstance(predicateArray0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate3, predicateArray0[1]);
      // Undeclared exception!
      try { 
        predicatedMap0.putAll(hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, truePredicate0, truePredicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.putAll(predicatedMap0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unresolved compilation problems: 
         // \tDuplicate methods named spliterator with the parameters () and () are inherited from the types Set and Collection
         // \tDuplicate methods named spliterator with the parameters () and () are inherited from the types Collection and Iterable
         //
         verifyException("collections.map.AbstractInputCheckedMapDecorator$EntrySet", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Predicate[] predicateArray0 = new Predicate[1];
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      predicateArray0[0] = (Predicate) uniquePredicate0;
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, (Predicate) null);
      Object object0 = predicatedMap0.putIfAbsent(predicatedMap0, uniquePredicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.put(predicatedMap0, object0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      predicatedMap0.put((Object) null, hashMap0);
      Predicate predicate0 = UniquePredicate.getInstance();
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(predicatedMap0, (Predicate) null, predicate0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      hashMap0.put("The predicate collection must not contain a null predicate, index ", "The predicate collection must not contain a null predicate, index ");
      Predicate predicate0 = UniquePredicate.getInstance();
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(hashMap0, predicate0, predicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Predicate predicate0 = TruePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(predicatedMap0, predicate0, predicate0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unresolved compilation problems: 
         // \tDuplicate methods named spliterator with the parameters () and () are inherited from the types Set and Collection
         // \tDuplicate methods named spliterator with the parameters () and () are inherited from the types Collection and Iterable
         //
         verifyException("collections.map.AbstractInputCheckedMapDecorator$EntrySet", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      // Undeclared exception!
      try { 
        predicatedMap0.checkSetValue(predicatedMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      Map map0 = PredicatedMap.decorate(hashMap0, uniquePredicate0, (Predicate) null);
      hashMap0.put(map0, map0);
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap(map0, uniquePredicate0, (Predicate) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, truePredicate0);
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap(map0, truePredicate0, truePredicate0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unresolved compilation problems: 
         // \tDuplicate methods named spliterator with the parameters () and () are inherited from the types Set and Collection
         // \tDuplicate methods named spliterator with the parameters () and () are inherited from the types Collection and Iterable
         //
         verifyException("collections.map.AbstractInputCheckedMapDecorator$EntrySet", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, truePredicate0, truePredicate0);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Class<String> class0 = String.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.checkSetValue(hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot set value - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>(2543);
      Class<String> class0 = String.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, instanceofPredicate0, instanceofPredicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.put("zJ,Y3O88)6#ZMzm*M^", class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Predicate[] predicateArray0 = new Predicate[3];
      Predicate predicate0 = UniquePredicate.getInstance();
      predicateArray0[0] = predicate0;
      Predicate predicate1 = NotNullPredicate.getInstance();
      predicateArray0[1] = predicate1;
      predicateArray0[2] = predicate0;
      hashMap0.put(predicateArray0[2], "");
      Predicate predicate2 = AllPredicate.getInstance(predicateArray0);
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap(hashMap0, predicate2, predicateArray0[1]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      Object object0 = new Object();
      predicatedMap0.put(object0, (Object) null);
      Predicate[] predicateArray0 = new Predicate[8];
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(hashMap0, allPredicate0, predicateArray0[1]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.functors.AllPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, truePredicate0, truePredicate0);
      Integer integer0 = new Integer(1);
      predicatedMap0.put(truePredicate0, integer0);
      Map map0 = PredicatedMap.decorate(hashMap0, truePredicate0, truePredicate0);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Predicate[] predicateArray0 = new Predicate[1];
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, (Predicate) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        predicatedMap0.put(predicatedMap0, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.functors.AllPredicate", e);
      }
  }
}
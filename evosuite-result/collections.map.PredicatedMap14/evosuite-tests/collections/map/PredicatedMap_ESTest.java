/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 09 21:26:43 GMT 2017
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
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PredicatedMap_ESTest extends PredicatedMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Map map0 = PredicatedMap.decorate(hashMap0, (Predicate) null, (Predicate) null);
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, notNullPredicate0, notNullPredicate0);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Predicate predicate0 = TruePredicate.getInstance();
      Map map0 = PredicatedMap.decorate(hashMap0, (Predicate) null, (Predicate) null);
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, notNullPredicate0, notNullPredicate0);
      Object object0 = new Object();
      predicatedMap0.put(object0, object0);
      Map map1 = PredicatedMap.decorate(hashMap0, (Predicate) null, predicate0);
      assertTrue(map1.equals((Object)map0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Predicate[] predicateArray0 = new Predicate[8];
      Predicate predicate0 = NotNullPredicate.getInstance();
      predicateArray0[0] = predicate0;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Predicate predicate1 = AllPredicate.getInstance((Collection) linkedList0);
      predicateArray0[1] = predicate1;
      Class<Object> class0 = Object.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      predicateArray0[2] = (Predicate) instanceofPredicate0;
      predicateArray0[3] = predicate1;
      predicateArray0[4] = predicate0;
      predicateArray0[5] = predicate1;
      Predicate predicate2 = UniquePredicate.getInstance();
      predicateArray0[6] = predicate2;
      predicateArray0[7] = (Predicate) instanceofPredicate0;
      Predicate predicate3 = AllPredicate.getInstance(predicateArray0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate3, predicateArray0[1]);
      Object object0 = predicatedMap0.checkSetValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>(0);
      AllPredicate allPredicate0 = new AllPredicate((Predicate[]) null);
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, predicate0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        predicatedMap0.validate((Object) null, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, uniquePredicate0, uniquePredicate0);
      Object object0 = new Object();
      predicatedMap0.validate(uniquePredicate0, object0);
      // Undeclared exception!
      try { 
        predicatedMap0.validate(object0, hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Map map0 = PredicatedMap.decorate(hashMap0, (Predicate) null, (Predicate) null);
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, (Predicate) null, (Predicate) null);
      Integer integer0 = new Integer(0);
      predicatedMap0.put(hashMap0, integer0);
      // Undeclared exception!
      try { 
        predicatedMap0.putAll(predicatedMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
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
  public void test08()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Class<Object> class0 = Object.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      Map map0 = PredicatedMap.decorate(hashMap0, instanceofPredicate0, instanceofPredicate0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, instanceofPredicate0, instanceofPredicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.putAll(map0);
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
  public void test09()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      hashMap0.put(predicatedMap0, "Cannot add key - Predicate rejected it");
      // Undeclared exception!
      try { 
        predicatedMap0.put(hashMap0, predicate0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      hashMap0.put("[8N{$", "[8N{$");
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(hashMap0, uniquePredicate0, uniquePredicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      // Undeclared exception!
      try { 
        predicatedMap0.checkSetValue(hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Predicate[] predicateArray0 = new Predicate[3];
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      predicateArray0[0] = (Predicate) allPredicate0;
      Integer integer0 = new Integer(0);
      hashMap0.put(integer0, allPredicate0);
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, allPredicate0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Predicate[] predicateArray0 = new Predicate[2];
      Integer integer0 = new Integer(634);
      hashMap0.put("", integer0);
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate((Class) null);
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap(hashMap0, instanceofPredicate0, predicateArray0[0]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.functors.InstanceofPredicate", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Predicate[] predicateArray0 = new Predicate[0];
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap((Map) null, allPredicate0, allPredicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Map must not be null
         //
         verifyException("collections.map.AbstractMapDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      Map map0 = PredicatedMap.decorate(hashMap0, uniquePredicate0, uniquePredicate0);
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap(map0, uniquePredicate0, truePredicate0);
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
  public void test16()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Predicate predicate0 = TruePredicate.getInstance();
      Map map0 = PredicatedMap.decorate(hashMap0, predicate0, (Predicate) null);
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, notNullPredicate0, notNullPredicate0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        predicatedMap0.put((Object) null, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Map map0 = PredicatedMap.decorate(hashMap0, (Predicate) null, (Predicate) null);
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, notNullPredicate0, notNullPredicate0);
      predicatedMap0.putAll(hashMap0);
      assertTrue(predicatedMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Predicate[] predicateArray0 = new Predicate[9];
      Class<String> class0 = String.class;
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      predicateArray0[0] = (Predicate) instanceofPredicate0;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, instanceofPredicate0, predicateArray0[0]);
      // Undeclared exception!
      try { 
        predicatedMap0.checkSetValue((Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot set value - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Map map0 = PredicatedMap.decorate(hashMap0, (Predicate) null, (Predicate) null);
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, notNullPredicate0, notNullPredicate0);
      Object object0 = predicatedMap0.checkSetValue("");
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      hashMap0.put((String) null, "p#kG')wcjlt4");
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, uniquePredicate0, uniquePredicate0);
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
  public void test21()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Map map0 = PredicatedMap.decorate(hashMap0, (Predicate) null, (Predicate) null);
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(map0, notNullPredicate0, notNullPredicate0);
      Object object0 = new Object();
      predicatedMap0.put(object0, object0);
      Predicate[] predicateArray0 = new Predicate[5];
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(map0, (Predicate) null, allPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Object object0 = new Object();
      Integer integer0 = new Integer(0);
      hashMap0.put(object0, integer0);
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      Object object1 = predicatedMap0.put(object0, object0);
      assertEquals(0, object1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
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
}
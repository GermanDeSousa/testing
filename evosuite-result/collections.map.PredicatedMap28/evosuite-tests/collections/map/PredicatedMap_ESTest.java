/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 09 22:36:46 GMT 2017
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PredicatedMap_ESTest extends PredicatedMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      PredicatedMap predicatedMap1 = new PredicatedMap(predicatedMap0, (Predicate) null, (Predicate) null);
      predicatedMap1.putAll(hashMap0);
      assertTrue(predicatedMap1.equals((Object)predicatedMap0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      predicatedMap0.put((Object) null, hashMap0);
      predicatedMap0.put((Object) null, (Object) null);
      assertEquals(1, predicatedMap0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, truePredicate0, truePredicate0);
      Object object0 = predicatedMap0.checkSetValue((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      predicatedMap0.put(hashMap0, hashMap0);
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
  public void test05()  throws Throwable  {
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, truePredicate0, predicate0);
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
  public void test06()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Integer integer0 = new Integer(287);
      hashMap0.put(integer0, "<Y>s2gi45PP>)");
      Predicate predicate0 = UniquePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
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
  public void test07()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
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
  public void test08()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Predicate[] predicateArray0 = new Predicate[6];
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      predicateArray0[0] = (Predicate) truePredicate0;
      Class<Integer> class0 = Integer.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      predicateArray0[1] = predicate0;
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      predicateArray0[2] = (Predicate) notNullPredicate0;
      AllPredicate allPredicate0 = new AllPredicate(predicateArray0);
      predicateArray0[3] = (Predicate) allPredicate0;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, allPredicate0);
      Integer integer0 = new Integer(0);
      hashMap0.put(allPredicate0, integer0);
      Map map0 = predicatedMap0.map;
      // Undeclared exception!
      PredicatedMap.decorate(map0, predicateArray0[2], allPredicate0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Predicate predicate0 = UniquePredicate.getInstance();
      Map map0 = PredicatedMap.decorate(hashMap0, predicate0, predicate0);
      Class<Integer> class0 = Integer.class;
      Integer integer0 = new Integer((-298));
      hashMap0.put(map0, integer0);
      InstanceofPredicate instanceofPredicate0 = new InstanceofPredicate(class0);
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(hashMap0, predicate0, instanceofPredicate0);
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
      Object object0 = new Object();
      hashMap0.put(object0, object0);
      AllPredicate allPredicate0 = new AllPredicate((Predicate[]) null);
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(hashMap0, allPredicate0, allPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      Object object0 = new Object();
      predicatedMap0.put(object0, object0);
      Class<String> class0 = String.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(predicatedMap0, predicate0, (Predicate) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, predicate0);
      // Undeclared exception!
      try { 
        PredicatedMap.decorate(predicatedMap0, (Predicate) null, (Predicate) null);
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
  public void test13()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      // Undeclared exception!
      try { 
        predicatedMap0.checkSetValue("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      UniquePredicate uniquePredicate0 = new UniquePredicate();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, uniquePredicate0, uniquePredicate0);
      Object object0 = new Object();
      hashMap0.put(predicatedMap0, object0);
      PredicatedMap predicatedMap1 = null;
      try {
        predicatedMap1 = new PredicatedMap(hashMap0, uniquePredicate0, uniquePredicate0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("collections.functors.AllPredicate", "collections.functors.AllPredicate");
      AllPredicate allPredicate0 = new AllPredicate((Predicate[]) null);
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap(hashMap0, allPredicate0, allPredicate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PredicatedMap predicatedMap0 = null;
      try {
        predicatedMap0 = new PredicatedMap((Map) null, (Predicate) null, (Predicate) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Map must not be null
         //
         verifyException("collections.map.AbstractMapDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Predicate predicate0 = TruePredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      PredicatedMap predicatedMap1 = null;
      try {
        predicatedMap1 = new PredicatedMap(predicatedMap0, predicate0, predicate0);
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
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, truePredicate0, predicate0);
      boolean boolean0 = predicatedMap0.isSetValueChecking();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, notNullPredicate0, notNullPredicate0);
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
  public void test20()  throws Throwable  {
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, truePredicate0, predicate0);
      Object object0 = predicatedMap0.checkSetValue("sil0go@U^BL>\"");
      assertEquals("sil0go@U^BL>\"", object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Predicate predicate0 = NotNullPredicate.getInstance();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, predicate0, predicate0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        predicatedMap0.put(object0, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      NotNullPredicate notNullPredicate0 = (NotNullPredicate)NotNullPredicate.INSTANCE;
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, notNullPredicate0, notNullPredicate0);
      // Undeclared exception!
      try { 
        predicatedMap0.validate((Object) null, notNullPredicate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add key - Predicate rejected it
         //
         verifyException("collections.map.PredicatedMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TruePredicate truePredicate0 = (TruePredicate)TruePredicate.INSTANCE;
      Class<Object> class0 = Object.class;
      Predicate predicate0 = InstanceofPredicate.getInstance(class0);
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, truePredicate0, predicate0);
      predicatedMap0.validate(truePredicate0, "sil0go@U^BL>\"");
      assertEquals(0, predicatedMap0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      PredicatedMap predicatedMap0 = new PredicatedMap(hashMap0, (Predicate) null, (Predicate) null);
      predicatedMap0.put((Object) null, hashMap0);
      Map map0 = PredicatedMap.decorate(predicatedMap0, (Predicate) null, (Predicate) null);
      assertFalse(map0.isEmpty());
  }
}

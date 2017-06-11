/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 09 21:52:39 GMT 2017
 */

package math.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import math.genetics.Chromosome;
import math.genetics.DummyRandomKey;
import math.genetics.ElitisticListPopulation;
import math.genetics.Population;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ElitisticListPopulation_ESTest extends ElitisticListPopulation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(66, 1.0);
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      DummyRandomKey dummyRandomKey0 = new DummyRandomKey(linkedList0);
      elitisticListPopulation0.addChromosome(dummyRandomKey0);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomes();
      elitisticListPopulation0.addChromosomes(list0);
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01);
      
      Population population0 = elitisticListPopulation0.nextGeneration();
      assertNotSame(population0, elitisticListPopulation0);
      assertEquals(2, population0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(283, 0.0);
      Population population0 = elitisticListPopulation0.nextGeneration();
      assertNotSame(population0, elitisticListPopulation0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 548, 0.9);
      double double0 = elitisticListPopulation0.getElitismRate();
      assertEquals(0.9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(63, 1.0);
      elitisticListPopulation0.addChromosome((Chromosome) null);
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      DummyRandomKey dummyRandomKey0 = new DummyRandomKey(linkedList0);
      elitisticListPopulation0.addChromosome(dummyRandomKey0);
      // Undeclared exception!
      try { 
        elitisticListPopulation0.nextGeneration();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("math.genetics.Chromosome", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      List<Chromosome> list0 = elitisticListPopulation0.getChromosomeList();
      ElitisticListPopulation elitisticListPopulation1 = null;
      try {
        elitisticListPopulation1 = new ElitisticListPopulation(list0, 0, 0.9);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("math.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 1270, 1270);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (1,270)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) null, 1237, 2579.1892712);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("math.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("math.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(1609, 1609);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (1,609)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(66, 1.0);
      elitisticListPopulation0.setElitismRate(1.0);
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 548, 0.9);
      try { 
        elitisticListPopulation0.setElitismRate(548);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (548)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(283, 0.0);
      try { 
        elitisticListPopulation0.setElitismRate((-3956.7572700948));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (-3,956.757)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(283, 0.0);
      double double0 = elitisticListPopulation0.getElitismRate();
      assertEquals(0.0, double0, 0.01);
  }
}
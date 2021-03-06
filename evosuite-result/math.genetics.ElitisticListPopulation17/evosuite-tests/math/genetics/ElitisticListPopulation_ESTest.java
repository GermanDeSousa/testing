/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 09 21:42:51 GMT 2017
 */

package math.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import math.genetics.Chromosome;
import math.genetics.DummyBinaryChromosome;
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
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(3725, 1.0);
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      DummyRandomKey dummyRandomKey0 = new DummyRandomKey(linkedList0);
      elitisticListPopulation0.addChromosome(dummyRandomKey0);
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      DummyBinaryChromosome dummyBinaryChromosome0 = new DummyBinaryChromosome(linkedList1);
      elitisticListPopulation0.addChromosome(dummyBinaryChromosome0);
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01);
      
      Population population0 = elitisticListPopulation0.nextGeneration();
      assertEquals(2, population0.getPopulationSize());
      assertNotSame(population0, elitisticListPopulation0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(294, 0.0);
      Population population0 = elitisticListPopulation0.nextGeneration();
      assertNotSame(population0, elitisticListPopulation0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 1, 1);
      assertEquals(1.0, elitisticListPopulation0.getElitismRate(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1169, 0.0);
      double double0 = elitisticListPopulation0.getElitismRate();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 0, 0.0);
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
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) null, 1152, (-1673.309095787281));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("math.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation((-1570), (-1570));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("math.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(292, (-19.49));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (-19.49)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(3725, 1.0);
      try { 
        elitisticListPopulation0.setElitismRate(3725);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (3,725)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1169, 0.0);
      Double[] doubleArray0 = new Double[1];
      Double double0 = new Double(0.9);
      doubleArray0[0] = double0;
      elitisticListPopulation0.setElitismRate((double) doubleArray0[0]);
      assertEquals(0.9, elitisticListPopulation0.getElitismRate(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(3725, 1.0);
      double double0 = elitisticListPopulation0.getElitismRate();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1169, 0.0);
      try { 
        elitisticListPopulation0.setElitismRate((-1125.2418246723));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (-1,125.242)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 84, 115.22785973312416);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (115.228)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }
}

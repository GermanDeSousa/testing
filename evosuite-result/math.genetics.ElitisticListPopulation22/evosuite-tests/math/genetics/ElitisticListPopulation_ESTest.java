/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 09 22:08:01 GMT 2017
 */

package math.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import math.genetics.Chromosome;
import math.genetics.DummyBinaryChromosome;
import math.genetics.DummyListChromosome;
import math.genetics.ElitisticListPopulation;
import math.genetics.Population;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ElitisticListPopulation_ESTest extends ElitisticListPopulation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(562, 0.9);
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      DummyBinaryChromosome dummyBinaryChromosome0 = new DummyBinaryChromosome(linkedList1);
      linkedList0.add((Chromosome) dummyBinaryChromosome0);
      linkedList0.add((Chromosome) dummyBinaryChromosome0);
      elitisticListPopulation0.addChromosomes(linkedList0);
      elitisticListPopulation0.addChromosomes(linkedList0);
      assertEquals(0.9, elitisticListPopulation0.getElitismRate(), 0.01);
      
      Population population0 = elitisticListPopulation0.nextGeneration();
      assertEquals(3, population0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(266, 0.0);
      Population population0 = elitisticListPopulation0.nextGeneration();
      assertNotSame(population0, elitisticListPopulation0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(266, 0.0);
      double double0 = elitisticListPopulation0.getElitismRate();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      linkedList0.add((Chromosome) null);
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      DummyListChromosome dummyListChromosome0 = new DummyListChromosome(linkedList1);
      linkedList0.add((Chromosome) dummyListChromosome0);
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 1401, 0.0);
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
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, (-2662), 0.0);
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
        elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 1333, 1333);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (1,333)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = null;
      try {
        elitisticListPopulation0 = new ElitisticListPopulation((List<Chromosome>) null, 0, 0);
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
        elitisticListPopulation0 = new ElitisticListPopulation((-1717), (-1717));
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
        elitisticListPopulation0 = new ElitisticListPopulation(275, 275);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (275)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(266, 0.0);
      elitisticListPopulation0.setElitismRate(0.0);
      assertEquals(266, elitisticListPopulation0.getPopulationLimit());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(212, 0.0);
      try { 
        elitisticListPopulation0.setElitismRate(212);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (212)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      try { 
        elitisticListPopulation0.setElitismRate((-3628.0969533745883));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // elitism rate (-3,628.097)
         //
         verifyException("math.genetics.ElitisticListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(562, 0.9);
      double double0 = elitisticListPopulation0.getElitismRate();
      assertEquals(0.9, double0, 0.01);
  }
}

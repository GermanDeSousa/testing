import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTestElitisticListPopulation18A0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test01");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', (-1.0d));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test02");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        try {
            elitisticListPopulation5.setPopulationLimit(0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test03");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = null;
        try {
            elitisticListPopulation5.setChromosomes(list_chromosome7);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test04");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) 'a', (double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test05");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        double d8 = elitisticListPopulation5.getElitismRate();
        try {
            math.genetics.Chromosome chromosome9 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d8 == 0.0d);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test06");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        try {
            elitisticListPopulation5.setPopulationLimit((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test07");
        java.util.List<math.genetics.Chromosome> list_chromosome0 = null;
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation3 = new math.genetics.ElitisticListPopulation(list_chromosome0, (int) (short) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test08");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (short) 10, (double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test09");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation10 = new math.genetics.ElitisticListPopulation(list_chromosome7, (int) (short) 100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test10");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test11");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome6 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(spliterator_chromosome6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test12");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.Collection<math.genetics.Chromosome> collection_chromosome10 = null;
        try {
            elitisticListPopulation5.addChromosomes(collection_chromosome10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue(i9 == 35);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test13");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test14");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome25 = null;
        elitisticListPopulation24.addChromosome(chromosome25);
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation24.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome27);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(list_chromosome27);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test15");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        java.lang.String str12 = elitisticListPopulation11.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome21);
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation26 = new math.genetics.ElitisticListPopulation(list_chromosome21, (int) (short) 10, (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test16");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome7 = elitisticListPopulation5.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(spliterator_chromosome7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test17");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        int i9 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome10 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue(i9 == 35);
        org.junit.Assert.assertNotNull(iterator_chromosome10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test18");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        try {
            math.genetics.Chromosome chromosome8 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test19");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate(0.0d);
        math.genetics.Chromosome chromosome9 = null;
        elitisticListPopulation5.addChromosome(chromosome9);
        try {
            elitisticListPopulation5.setElitismRate((double) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test20");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate(0.0d);
        try {
            math.genetics.Chromosome chromosome9 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test21");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation5.iterator();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation5.addChromosome(chromosome12);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test22");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        int i8 = elitisticListPopulation5.getPopulationLimit();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i8 == 35);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test23");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        double d15 = elitisticListPopulation2.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(d15 == 0.0d);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test24");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        math.genetics.Chromosome[] chromosome_array19 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome20 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome20, chromosome_array19);
        math.genetics.ElitisticListPopulation elitisticListPopulation24 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome20, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array25 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome26 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome26, chromosome_array25);
        math.genetics.ElitisticListPopulation elitisticListPopulation30 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome26, (int) '#', 0.0d);
        java.lang.String str31 = elitisticListPopulation30.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome32 = elitisticListPopulation30.getChromosomes();
        math.genetics.Chromosome[] chromosome_array33 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome34 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome34, chromosome_array33);
        math.genetics.ElitisticListPopulation elitisticListPopulation38 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome34, (int) '#', 0.0d);
        java.lang.String str39 = elitisticListPopulation38.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome40 = elitisticListPopulation38.getChromosomes();
        elitisticListPopulation30.setChromosomes(list_chromosome40);
        elitisticListPopulation24.setChromosomes(list_chromosome40);
        elitisticListPopulation5.setChromosomes(list_chromosome40);
        int i44 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertNotNull(chromosome_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(chromosome_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "[]" + "'", str31.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome32);
        org.junit.Assert.assertNotNull(chromosome_array33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]" + "'", str39.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome40);
        org.junit.Assert.assertTrue(i44 == 1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test25");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        try {
            elitisticListPopulation5.setElitismRate((double) '#');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test26");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        double d9 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setPopulationLimit((int) (short) 1);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue(d9 == 0.0d);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test27");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        try {
            math.genetics.Chromosome chromosome7 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test28");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setPopulationLimit((int) '4');
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test29");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.lang.String str7 = elitisticListPopulation5.toString();
        double d8 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "[]" + "'", str7.equals("[]"));
        org.junit.Assert.assertTrue(d8 == 0.0d);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test30");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Population population8 = elitisticListPopulation5.nextGeneration();
        int i9 = elitisticListPopulation5.getPopulationSize();
        math.genetics.Chromosome chromosome10 = null;
        elitisticListPopulation5.addChromosome(chromosome10);
        try {
            math.genetics.Population population12 = elitisticListPopulation5.nextGeneration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(population8);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test31");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate(0.0d);
        math.genetics.Chromosome[] chromosome_array9 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome10 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome10, chromosome_array9);
        math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome10, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome15 = null;
        elitisticListPopulation14.addChromosome(chromosome15);
        math.genetics.Population population17 = elitisticListPopulation14.nextGeneration();
        int i18 = elitisticListPopulation14.getPopulationLimit();
        java.lang.String str19 = elitisticListPopulation14.toString();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array26 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome27 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome27, chromosome_array26);
        math.genetics.ElitisticListPopulation elitisticListPopulation31 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome27, (int) '#', 0.0d);
        java.lang.String str32 = elitisticListPopulation31.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome33 = elitisticListPopulation31.getChromosomes();
        math.genetics.Chromosome[] chromosome_array34 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome35 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome35, chromosome_array34);
        math.genetics.ElitisticListPopulation elitisticListPopulation39 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome35, (int) '#', 0.0d);
        java.lang.String str40 = elitisticListPopulation39.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome41 = elitisticListPopulation39.getChromosomes();
        elitisticListPopulation31.setChromosomes(list_chromosome41);
        elitisticListPopulation25.setChromosomes(list_chromosome41);
        elitisticListPopulation14.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome41);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome41);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(population17);
        org.junit.Assert.assertTrue(i18 == 35);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "[null]" + "'", str19.equals("[null]"));
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(chromosome_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "[]" + "'", str32.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome33);
        org.junit.Assert.assertNotNull(chromosome_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "[]" + "'", str40.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome41);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test32");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation(list_chromosome10, (int) (short) 10, (double) (short) 1);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test33");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        try {
            math.genetics.Chromosome chromosome10 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test34");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        math.genetics.Population population9 = elitisticListPopulation5.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(population9);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test35");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (byte) 100, (double) ' ');
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test36");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        java.lang.String str12 = elitisticListPopulation11.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome21);
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation5.iterator();
        int i25 = elitisticListPopulation5.getPopulationLimit();
        try {
            math.genetics.Chromosome chromosome26 = elitisticListPopulation5.getFittestChromosome();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertTrue(i25 == 35);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test37");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome8 = elitisticListPopulation5.iterator();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        java.util.List<math.genetics.Chromosome> list_chromosome10 = elitisticListPopulation5.getChromosomes();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome11 = list_chromosome10.spliterator();
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation14 = new math.genetics.ElitisticListPopulation(list_chromosome10, (int) (short) -1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(iterator_chromosome8);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
        org.junit.Assert.assertNotNull(list_chromosome10);
        org.junit.Assert.assertNotNull(spliterator_chromosome11);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test38");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        double d12 = elitisticListPopulation5.getElitismRate();
        math.genetics.Population population13 = elitisticListPopulation5.nextGeneration();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome20 = null;
        elitisticListPopulation19.addChromosome(chromosome20);
        math.genetics.Chromosome[] chromosome_array22 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome23 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome23, chromosome_array22);
        math.genetics.ElitisticListPopulation elitisticListPopulation27 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome23, (int) '#', 0.0d);
        double d28 = elitisticListPopulation27.getElitismRate();
        math.genetics.Chromosome[] chromosome_array29 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome30 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b31 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30, chromosome_array29);
        elitisticListPopulation27.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation19.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome30);
        elitisticListPopulation5.setElitismRate((double) 0.0f);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertTrue(d12 == 0.0d);
        org.junit.Assert.assertNotNull(population13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(chromosome_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(d28 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array29);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test39");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(35, (double) 100L);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test40");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome11 = elitisticListPopulation5.iterator();
        elitisticListPopulation5.setPopulationLimit((int) '#');
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome11);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test41");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setElitismRate((double) 0L);
        math.genetics.Population population22 = elitisticListPopulation5.nextGeneration();
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome23 = population22.spliterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(population22);
        org.junit.Assert.assertNotNull(spliterator_chromosome23);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test42");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        java.lang.String str17 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation5.addChromosome(chromosome21);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome20);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test43");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome6 = null;
        elitisticListPopulation5.addChromosome(chromosome6);
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        double d14 = elitisticListPopulation13.getElitismRate();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        elitisticListPopulation13.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16);
        elitisticListPopulation5.setElitismRate((double) 0L);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(d14 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test44");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate(0.0d);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome9 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(iterator_chromosome9);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test45");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome12 = null;
        elitisticListPopulation5.addChromosome(chromosome12);
        math.genetics.Population population14 = elitisticListPopulation5.nextGeneration();
        int i15 = elitisticListPopulation5.getPopulationSize();
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome16 = elitisticListPopulation5.iterator();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(population14);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(iterator_chromosome16);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test46");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        int i6 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test47");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(0, (double) 'a');
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test48");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        math.genetics.Chromosome[] chromosome_array3 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome4 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome4, chromosome_array3);
        math.genetics.ElitisticListPopulation elitisticListPopulation8 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome4, (int) '#', 0.0d);
        double d9 = elitisticListPopulation8.getElitismRate();
        math.genetics.Chromosome[] chromosome_array10 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome11 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11, chromosome_array10);
        elitisticListPopulation8.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome11);
        elitisticListPopulation2.setChromosomes((java.util.List<math.genetics.Chromosome>) arraylist_chromosome11);
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        elitisticListPopulation2.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome22 = elitisticListPopulation2.iterator();
        math.genetics.Population population23 = elitisticListPopulation2.nextGeneration();
        org.junit.Assert.assertNotNull(chromosome_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(d9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_chromosome22);
        org.junit.Assert.assertNotNull(population23);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test49");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) -1, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type math.exception.NotPositiveException");
        } catch (math.exception.NotPositiveException e) {
        }
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test50");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        java.lang.String str17 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        int i20 = elitisticListPopulation5.getPopulationLimit();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertTrue(i20 == 35);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test51");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) 'a', 0.0d);
        math.genetics.Chromosome chromosome3 = null;
        elitisticListPopulation2.addChromosome(chromosome3);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test52");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array12 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome13 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome13, chromosome_array12);
        math.genetics.ElitisticListPopulation elitisticListPopulation17 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome13, (int) '#', 0.0d);
        java.lang.String str18 = elitisticListPopulation17.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome19 = elitisticListPopulation17.getChromosomes();
        math.genetics.Chromosome[] chromosome_array20 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome21 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome21, chromosome_array20);
        math.genetics.ElitisticListPopulation elitisticListPopulation25 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome21, (int) '#', 0.0d);
        java.lang.String str26 = elitisticListPopulation25.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome27 = elitisticListPopulation25.getChromosomes();
        elitisticListPopulation17.setChromosomes(list_chromosome27);
        elitisticListPopulation11.setChromosomes(list_chromosome27);
        elitisticListPopulation5.setChromosomes(list_chromosome27);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(chromosome_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "[]" + "'", str18.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome19);
        org.junit.Assert.assertNotNull(chromosome_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "[]" + "'", str26.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome27);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test53");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        elitisticListPopulation5.setPopulationLimit((int) (byte) 1);
        int i19 = elitisticListPopulation5.getPopulationSize();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test54");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test55");
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation((int) (short) 10, (double) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test56");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        elitisticListPopulation5.setElitismRate(0.0d);
        try {
            elitisticListPopulation5.setElitismRate((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test57");
        math.genetics.ElitisticListPopulation elitisticListPopulation2 = new math.genetics.ElitisticListPopulation(100, (double) 0L);
        java.util.Spliterator<math.genetics.Chromosome> spliterator_chromosome3 = elitisticListPopulation2.spliterator();
        org.junit.Assert.assertNotNull(spliterator_chromosome3);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test58");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        java.lang.String str6 = elitisticListPopulation5.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome7 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array8 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome9 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome9, chromosome_array8);
        math.genetics.ElitisticListPopulation elitisticListPopulation13 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome9, (int) '#', 0.0d);
        java.lang.String str14 = elitisticListPopulation13.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome15 = elitisticListPopulation13.getChromosomes();
        elitisticListPopulation5.setChromosomes(list_chromosome15);
        java.lang.String str17 = elitisticListPopulation5.toString();
        math.genetics.Chromosome chromosome18 = null;
        elitisticListPopulation5.addChromosome(chromosome18);
        java.util.List<math.genetics.Chromosome> list_chromosome20 = elitisticListPopulation5.getChromosomes();
        double d21 = elitisticListPopulation5.getElitismRate();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[]" + "'", str6.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome7);
        org.junit.Assert.assertNotNull(chromosome_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "[]" + "'", str14.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "[]" + "'", str17.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome20);
        org.junit.Assert.assertTrue(d21 == 0.0d);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test59");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        java.lang.String str12 = elitisticListPopulation11.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome21);
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation5.iterator();
        int i25 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome26 = elitisticListPopulation5.getChromosomes();
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertTrue(i25 == 35);
        org.junit.Assert.assertNotNull(list_chromosome26);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test60");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        try {
            math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) (byte) 10, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type math.exception.OutOfRangeException");
        } catch (math.exception.OutOfRangeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test61");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        math.genetics.Chromosome[] chromosome_array6 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome7 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome7, chromosome_array6);
        math.genetics.ElitisticListPopulation elitisticListPopulation11 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome7, (int) '#', 0.0d);
        java.lang.String str12 = elitisticListPopulation11.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome13 = elitisticListPopulation11.getChromosomes();
        math.genetics.Chromosome[] chromosome_array14 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome15 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome15, chromosome_array14);
        math.genetics.ElitisticListPopulation elitisticListPopulation19 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome15, (int) '#', 0.0d);
        java.lang.String str20 = elitisticListPopulation19.toString();
        java.util.List<math.genetics.Chromosome> list_chromosome21 = elitisticListPopulation19.getChromosomes();
        elitisticListPopulation11.setChromosomes(list_chromosome21);
        elitisticListPopulation5.setChromosomes(list_chromosome21);
        java.util.Iterator<math.genetics.Chromosome> iterator_chromosome24 = elitisticListPopulation5.iterator();
        int i25 = elitisticListPopulation5.getPopulationLimit();
        java.util.List<math.genetics.Chromosome> list_chromosome26 = null;
        try {
            elitisticListPopulation5.setChromosomes(list_chromosome26);
            org.junit.Assert.fail("Expected exception of type math.exception.NullArgumentException");
        } catch (math.exception.NullArgumentException e) {
        }
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(chromosome_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "[]" + "'", str12.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome13);
        org.junit.Assert.assertNotNull(chromosome_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "[]" + "'", str20.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome21);
        org.junit.Assert.assertNotNull(iterator_chromosome24);
        org.junit.Assert.assertTrue(i25 == 35);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "randoop.RegressionTestElitisticListPopulation18A0.test62");
        math.genetics.Chromosome[] chromosome_array0 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome1 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b2 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome1, chromosome_array0);
        math.genetics.ElitisticListPopulation elitisticListPopulation5 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome1, (int) '#', 0.0d);
        double d6 = elitisticListPopulation5.getElitismRate();
        math.genetics.Chromosome[] chromosome_array7 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome8 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8, chromosome_array7);
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome8);
        java.lang.String str11 = elitisticListPopulation5.toString();
        elitisticListPopulation5.setPopulationLimit((int) (byte) 100);
        java.util.List<math.genetics.Chromosome> list_chromosome14 = elitisticListPopulation5.getChromosomes();
        math.genetics.Chromosome[] chromosome_array15 = new math.genetics.Chromosome[] {};
        java.util.ArrayList<math.genetics.Chromosome> arraylist_chromosome16 = new java.util.ArrayList<math.genetics.Chromosome>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<math.genetics.Chromosome>) arraylist_chromosome16, chromosome_array15);
        math.genetics.ElitisticListPopulation elitisticListPopulation20 = new math.genetics.ElitisticListPopulation((java.util.List<math.genetics.Chromosome>) arraylist_chromosome16, (int) '#', 0.0d);
        math.genetics.Chromosome chromosome21 = null;
        elitisticListPopulation20.addChromosome(chromosome21);
        java.util.List<math.genetics.Chromosome> list_chromosome23 = elitisticListPopulation20.getChromosomes();
        elitisticListPopulation5.addChromosomes((java.util.Collection<math.genetics.Chromosome>) list_chromosome23);
        org.junit.Assert.assertNotNull(chromosome_array0);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(d6 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
        org.junit.Assert.assertNotNull(list_chromosome14);
        org.junit.Assert.assertNotNull(chromosome_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(list_chromosome23);
    }
}


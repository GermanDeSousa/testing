/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jun 09 22:43:22 GMT 2017
 */

package math.genetics;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ElitisticListPopulation_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "math.genetics.ElitisticListPopulation"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "America/Argentina/Buenos_Aires"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ElitisticListPopulation_ESTest_scaffolding.class.getClassLoader() ,
      "math.exception.NumberIsTooLargeException",
      "math.random.RandomGenerator",
      "math.exception.util.Localizable",
      "math.genetics.StoppingCondition",
      "math.genetics.SelectionPolicy",
      "math.genetics.InvalidRepresentationException",
      "math.exception.MathIllegalNumberException",
      "math.exception.util.ExceptionContextProvider",
      "math.genetics.CrossoverPolicy",
      "math.exception.util.ArgUtils",
      "math.genetics.GeneticAlgorithm",
      "math.exception.MathIllegalArgumentException",
      "math.genetics.MutationPolicy",
      "math.random.JDKRandomGenerator",
      "math.exception.OutOfRangeException",
      "math.exception.util.LocalizedFormats",
      "math.genetics.ElitisticListPopulation",
      "math.genetics.Population",
      "math.genetics.ListPopulation",
      "math.util.FastMath",
      "math.genetics.Fitness",
      "math.exception.NotPositiveException",
      "math.exception.util.ExceptionContext",
      "math.exception.NullArgumentException",
      "math.exception.NumberIsTooSmallException",
      "math.genetics.Chromosome"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ElitisticListPopulation_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "math.exception.util.LocalizedFormats",
      "math.exception.MathIllegalArgumentException",
      "math.exception.NullArgumentException",
      "math.exception.util.ExceptionContext",
      "math.genetics.Chromosome",
      "math.exception.MathIllegalNumberException",
      "math.exception.NumberIsTooSmallException",
      "math.exception.NotPositiveException",
      "math.exception.OutOfRangeException",
      "math.util.FastMath",
      "math.random.JDKRandomGenerator",
      "math.genetics.GeneticAlgorithm",
      "math.genetics.InvalidRepresentationException",
      "math.exception.NumberIsTooLargeException"
    );
  }
}

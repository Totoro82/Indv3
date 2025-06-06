
/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * make changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the 'entrega system'.
 *
 */

//////////////////////////////////////////////////////////////////////
//
// File generated at: 2023/10/4 -- 22:53:33
// Seed: {1696,452811,596091}
//
//////////////////////////////////////////////////////////////////////



package aed.individual3;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.CountDownLatch;
import java.lang.reflect.*;
import es.upm.aedlib.Entry;
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.graph.*;
import es.upm.aedlib.indexedlist.*;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.*;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.*;
import java.util.function.Function;
import java.util.stream.Stream;



/**
 * The main tester class which contains JUnit5 tests.
 */
@SuppressWarnings({"unused","deprecation"})
public class TesterInd3 {

  
    

  @BeforeAll
  public static void init () 
  {
    TestUtils.reportPid() ;
    ResultsHandler.init() ;
    ResultsHandler.setNumTestsRemaining(59,60) ;
    TestData.setTesterType(true) ;
  }
  
  @AfterAll
  public static void reportResults () 
  {
    ResultsHandler.report_results() ;
  }
  
  @Test
  public void test_01 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_01";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_01") ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_01") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_02 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_02";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_02") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] {  })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_02") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_03 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_03";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_03") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 1 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_03") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_04 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_04";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_04") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 1,2 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_04") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_05 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_05";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_05") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -6,-13 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_05") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_06 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_06";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_06") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,0,1 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_06") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_07 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_07";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_07") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 1,2,3 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_07") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_08 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_08";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_08") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 2,4,6 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_08") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_09 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_09";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_09") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -3,15,15 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_09") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_10 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_10";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_10") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 1,1,-1 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_10") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_11 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_11";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_11") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 4,-4,-12 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_11") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_12 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_12";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_12") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 6,4,2 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_12") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_13 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_13";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_13") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 7,7,7 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_13") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_14 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_14";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_14") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 9,-4,3 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_14") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_15 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_15";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_15") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -7,3,13,23 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_15") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_16 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_16";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_16") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 2,8,14,20 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_16") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_17 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_17";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_17") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 4,-1,7,-6 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_17") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_18 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_18";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_18") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -4,-2,0,2,4 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_18") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_19 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_19";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_19") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 4,2,0,-2,-4 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_19") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_20 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_20";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_20") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -3,-1,1,3,5 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_20") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_21 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_21";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_21") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -1,-4,-7,-10,-13 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_21") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_22 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_22";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_22") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,0,0,0,0 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_22") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_23 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_23";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_23") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 1,-1,-3,-5,-7 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_23") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_24 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_24";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_24") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 4,3,2,null,1 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_24") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_25 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_25";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_25") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -4,-2,0,2,4,5 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_25") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_26 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_26";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_26") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -4,9,22,35,48,61 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_26") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_27 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_27";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_27") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -2,0,2,4,6,8 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_27") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_28 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_28";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_28") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,-10,-20,-30,-40,-50 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_28") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_29 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_29";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_29") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,0,0,0,0,0 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_29") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_30 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_30";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_30") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 1,10,19,28,37,46 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_30") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_31 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_31";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_31") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 2,-4,-10,-16,-22,-2 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_31") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_32 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_32";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_32") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -6,1,3,8,15,22,29 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_32") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_33 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_33";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_33") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,13,8,26,39,52,null })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_33") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_34 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_34";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_34") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 2,4,-4,-10,-16,-22,-28 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_34") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_35 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_35";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_35") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -1,3,7,11,null,null,15,19 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_35") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_36 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_36";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_36") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 1,2,3,4,null,5,6,-2 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_36") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_37 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_37";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_37") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 14,-2,-18,-34,-50,-66,-82,-98 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_37") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_38 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_38";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_38") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -11,2,null,null,-9,15,28,41,54 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_38") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_39 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_39";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_39") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -4,-4,-4,-4,-4,-4,-4,-4,-4 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_39") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_40 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_40";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_40") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -4,-1,2,5,8,-4,11,null,14 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_40") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_41 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_41";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_41") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -1,-1,-1,-1,-1,-1,-1,null,-1 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_41") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_42 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_42";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_42") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,-4,null,-8,-12,-16,2,-20,-24 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_42") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_43 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_43";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_43") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -12,0,12,24,36,48,60,null,-8,72 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_43") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_44 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_44";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_44") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 5,-5,-15,-25,0,-35,-45,-55,-65,null })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_44") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_45 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_45";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_45") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 5,8,3,-2,-7,-12,-17,-22,-27,-32 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_45") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_46 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_46";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_46") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -14,6,26,46,66,86,14,106,126,146,166 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_46") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_47 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_47";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_47") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -1,1,3,5,7,9,11,13,15,17,0 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_47") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_48 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_48";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_48") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,-1,-2,-3,-4,-5,-3,-6,-7,-8,-9 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_48") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_49 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_49";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_49") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 2,-1,null,null,-4,-7,4,-10,-13,-16,-19 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_49") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_50 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_50";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_50") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 6,-3,-12,-21,-30,-39,-48,-57,-16,-66,-75 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_50") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_51 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_51";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_51") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 8,-5,3,null,null,-18,-31,-44,-57,-70,-83 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_51") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_52 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_52";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_52") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 0,0,0,0,0,0,0,null,0,0,0,0 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_52") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_53 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_53";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_53") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 6,-6,-6,-18,-30,-42,-54,-66,-78,-90,-102,-114 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_53") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_54 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_54";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_54") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -13,-1,11,23,35,47,59,71,0,83,95,107,119 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_54") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_55 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_55";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_55") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 1,0,-1,-2,null,-3,-4,-5,null,-6,-7,-8,-9 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_55") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_56 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_56";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_56") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 11,8,5,2,-1,-4,-7,-10,-13,-16,-19,-22,-25 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_56") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_57 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_57";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_57") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { -3,-2,3,9,15,21,27,33,39,45,51,null,57,63 })).doCall().checkResult(false) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_57") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_58 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_58";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_58") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 1,1,1,1,null,1,1,null,1,null,null,1,null,1 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_58") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  
  @Test
  public void test_59 () 
  {
    if (ResultsHandler.isTimedout())
    {
        fail("Testing stopped due to global timeout -- too slow execution");
    }
    boolean resultIs = true ;
    try
    {
      resultIs = Assertions.assertTimeoutPreemptively(Duration.ofSeconds(10), ()  -> {
TesterCode.resetPrinter() ;
TestData.initTrace() ;
TestData.testName = "test_59";
boolean ok_sofar = true ;
ResultsHandler.startTest("test_59") ;
if (ok_sofar)
  ok_sofar = new IsArithmeticSequence(new NodePositionList<Integer>(new Integer[] { 3,-2,-7,-12,null,-17,null,null,-22,-27,-32,-37,-42,-47 })).doCall().checkResult(true) ;
return ok_sofar ;
}
) ;
    }
    catch ( org.opentest4j.AssertionFailedError exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.DURING, "*** TIMEOUT! *** Very slow or non-terminating execution",exc) ;
      resultIs = false ;
    }
    catch ( Throwable exc )
    {
      TestUtils.printCallException(TestUtils.ExecutionTime.UNRELATED, "Internal testing error; please report this to teachers",exc) ;
      resultIs = false ;
    }
    String messages = TestData.getMessages() ;
    ResultsHandler.stopTest("test_59") ;
    ResultsHandler.add_result("isArithmeticSequence",resultIs) ;
    if (messages.length() > 0)
      System.out.println(messages) ;
    if (!resultIs)
      Assertions.assertTrue(resultIs,messages) ;
  }
  


static class Tests {
  static String tester = "TesterInd3";
}

























static class TestUtils {
  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String print(Object obj) {
    return TesterCode.printer(obj);
  }

  static String standardPrinter(Object obj) {
    return printer(obj, x -> standardPrinter(x));
  }

  static String printer(Object obj, Function<Object,String> print) {
    if (obj == null)
      return "null";

    if (obj instanceof String) {
      return("\""+ obj +"\"");
    } else if (obj instanceof Position<?>) {
      return obj.toString();
    } else if (obj instanceof Pair<?,?>) {
      Pair<?,?> p = (Pair<?,?>) obj;
      return "Pair("+print.apply(p.getLeft())+","+print.apply(p.getRight())+")";
    } else if (obj instanceof java.util.Set<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("{");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("}");
      return buf.toString();
    } else if (obj instanceof Iterable<?>) {
      Iterable<?> l = (Iterable<?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Object lobj : l) {
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(lobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Map<?,?>) {
      Map<?,?> m = (Map<?,?>) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (Entry<?,?> lobj : m.entries()) {
        if (first) first=false;
        else buf.append(",");
        buf.append("("+print.apply(lobj.getKey())+","+print.apply(lobj.getValue())+")");
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof Object[]) {
      Object[] arr = (Object[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        Object aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    } else if (obj instanceof int[]) {
      int[] arr = (int[]) obj;
      StringBuffer buf = new StringBuffer();
      buf.append("[");
      boolean first = true;
      for (int i=0; i<arr.length; i++) {
        int aobj = arr[i];
        if (first) first=false;
        else buf.append(",");
        buf.append(print.apply(aobj));
      }
      buf.append("]");
      return buf.toString();
    }
    else
      return obj.toString();
  }

  static void printWarning(String TestName) {
      TestData.message("\n*** Warning in "+(TestName==null?"":TestName)+":");
  }

  static void printError(String TestName) {
      TestData.message("\n\n***********************************************");
      TestData.message("*** Error in "+(TestName==null?"":TestName)+":");
  }

  static void terminateErrorPrint() {
      TestData.message("\n***********************************************\n\n");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
    printError(TestData.testName);

      int traceLength = TestData.numCommands();

      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time)+"\n");
        TestData.message(TestData.getTrace());
      }

      switch (time) {
      case AFTER:
	  TestData.message("the call to "+msg+" raised the exception "+exc+
			     " although it should not have");
	  break;
      default:
	  TestData.message(" -- the exception "+exc+" was raised although it "+
			     "should not have been\n"+msg);
	  break;
      }
      TestData.message(getStackTrace(exc));
      terminateErrorPrint();
    }

  static String getStackTrace(Throwable throwable) {
    filterStackTrace(throwable);
    StringWriter errors = new StringWriter();
    throwable.printStackTrace(new PrintWriter(errors));
    return errors.toString();
  }

  static void filterStackTrace(Throwable throwable) {
    StackTraceElement[] stackTrace = throwable.getStackTrace();
    ArrayList<StackTraceElement> l = new ArrayList<StackTraceElement>();
    for (int i=0; i<stackTrace.length; i++) {
      String className = stackTrace[i].getClassName();
      if (className.startsWith("jdk.internal")
          || className.startsWith("org.junit")) break;
      l.add(stackTrace[i]);
    }
    StackTraceElement[] cutStackTrace = new StackTraceElement[l.size()];
    throwable.setStackTrace(l.toArray(cutStackTrace));
  }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printCallException(Throwable exc, Supplier<String> msg) {
    printCallException(ExecutionTime.LAST,msg.get(),exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    TestData.message("\n\n***********************************************");
    if (TestData.testName != "") {
      TestData.message("\n*** Warning for "+TestData.testName+": ");
    } else
      TestData.message("\n*** Warning:");

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
    
      if (traceLength > 0) {
        TestData.message(callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
    TestData.message(msg);
    terminateErrorPrint();
  }

  static void printError(ExecutionTime time, String msg) {
    printError(TestData.testName);

    if (time != TestUtils.ExecutionTime.UNRELATED) {
      int traceLength = TestData.numCommands();
      
      if (traceLength > 0) {
        TestData.message("\n"+callSeqString(traceLength,time));
        TestData.message(TestData.getTrace());
      }
    }
      
    TestData.message(msg);
    terminateErrorPrint();
  }

  static String callSeqString(int traceLength, ExecutionTime time) {
    if (traceLength < 2)
      return "while executing the call ";
    else {
      switch(time) {
      case AFTER:
	  return "after executing the call sequence ";
      case LAST:
	  return "while executing the last statement of call sequence ";
      case DURING:
	  return "while executing the call sequence ";
      case UNRELATED:
	  return "";
      }
      return "";
    }
  }

  // Checks that results, which may not be an exception nor null
  // (needs prior checks), which are iterables, return the same
  // set of elements.
  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<E,F> call,
                    TestResult<E,F> result,
                    F expected) {
    return sameSet(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E extends Iterable<?>,F extends Iterable<?>>
    boolean sameSet(TestCall<?,?> call, E value, F expected) {

    HashSet<Object> s1 = new HashSet<Object>();
    HashSet<Object> s2 = new HashSet<Object>();
    for (Object e : value)
      s1.add(e);
    for (Object f : expected)
      s2.add(f);
    if (!s1.equals(s2)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(s1)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(s2));
      return false;
    }
    return true;
  }

  // Checks that results, which are basic arrays, are equal
  static <E,F> boolean eqArrays(TestCall<int[],int[]> call,
                                TestResult<int[],int[]> result,
                                int[] expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return eqArrays(call, result.getValue(), expected);
  }

  static boolean eqArrays(TestCall<int[],int[]> call, int[] value, int[] expected) {
    boolean ok_sofar = value.length == expected.length;

    if (ok_sofar) {
      for (int i=0; i<value.length && ok_sofar; i++) {
        ok_sofar = ok_sofar && (value[i] == expected[i]);
      }
    }

    if (!ok_sofar) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an array "+printArray(value)+
         " which differs from the expected array "+printArray(expected));
    }
    return ok_sofar;
  }

  // Checks that the result is a member of the iterable
  static <E,F> boolean memberElements(TestCall<E,F> call,
				     TestResult<E,F> result,
				     F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    boolean checkResult = memberElements(call,result.getValue(),expected);
    if (!checkResult)
      printError
        (ExecutionTime.DURING,
         "the call "+ call +
         " returned a value "+TestUtils.print(result.getValue())+
         "\nwhich was not included among the expected values\n"+
         TestUtils.print(expected));
    return checkResult;
  }

  static <E,F> boolean memberElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!memberElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value\n  "+TestUtils.print(value)+
         "\nwhich is not included among the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  public static <E,F>
    boolean memberElements(E value, F expectedP) {
    if (expectedP instanceof Iterable<?>) {
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      HashSet<Object> s = new HashSet<Object>();
      for (Object e : expected) {
        s.add(e);
      }
      return s.contains(value);
    } else {
      System.out.println
	("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }

  // Checks that results, which are iterables, return the same
  // elements, regardless of the order.
  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElements(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElements(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!sameElements(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElements(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      HashMap<Object,Integer> s1 = new HashMap<Object,Integer>();
      HashMap<Object,Integer> s2 = new HashMap<Object,Integer>();
      for (Object e : value) {
        Integer si = s1.get(e);
        if (si == null) si = 0;
        s1.put(e,si+1);
      }
      for (Object f : expected) {
        Integer si = s2.get(f);
        if (si == null) si = 0;
        s2.put(f,si+1);
      }
        return s1.equals(s2);
    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }



  // Checks that results, which are iterables, return the same
  // elements, preserving the order.
  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    TestResult<E,F> result,
                                    F expected) {
    if (!call.noException())
      return false;
    if (!call.nonNull())
      return false;

    return sameElementsInOrder(call,result.getValue(),expected);
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...

  static <E,F> boolean sameElementsInOrder(TestCall<E,F> call,
                                    E value,
                                    F expected) {
    
    if (!sameElementsInOrder(value,expected)) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a value which contained the elements\n  "+TestUtils.print(value)+
         "\nwhich differs from the expected elements\n  "+TestUtils.print(expected));
      return false;
    }
    return true;
  }

  // *********************************************
  // WARNING: this relies on a sane definition of
  // hashCode and equals which does not fail upon finding
  // null values...
  static <E,F>
    boolean sameElementsInOrder(E valueP, F expectedP) {
    if ((valueP instanceof Iterable<?>) &&
        (expectedP instanceof Iterable<?>)) {
      Iterable<?> value = (Iterable<?>) valueP;
      Iterable<?> expected = (Iterable<?>) expectedP;
    
      Iterator<?> it1 = value.iterator();
      Iterator<?> it2 = expected.iterator();

      if (it1 == null) return false;

      while (it1.hasNext() && it2.hasNext()) {
        Object e2 = it2.next();
        Object e1 = null;
        try { e1 = it1.next(); }
        catch (Throwable exc) {
          return false;
        }
        if (e2 == null && e1 != null) return false;
        if (!e2.equals(e1)) return false;
      }

        return it1.hasNext() == it2.hasNext();

    } else {
      if (!(valueP instanceof Iterable<?>))
        System.out.println
          ("*** Error: result of type "+valueP.getClass()+" does not implement Iterable");
      if (!(expectedP instanceof Iterable<?>))
        System.out.println
          ("*** Error: expected of type "+expectedP.getClass()+" does not implement Iterable");
      throw new RuntimeException();
    }
  }
  
  // *********************************************
  // WARNING: this relies on a sane definition of
  // equals which does not fail upon finding
  // null values...
  static <E> boolean wellSorted(TestCall<?,?> call,
                                IndexedList<E> value,
                                ArrayIndexedList<ArrayIndexedList<E>> expected) {
    
    int i = 0;
    IndexedList<E> eqClass = null;
    for (E e : value) {
      if (eqClass == null) {
        if (i < expected.size())
          eqClass = new ArrayIndexedList<E>(expected.get(i));
        else {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
        }
      }
      if (!eqClass.remove(e)) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
      }
      if (eqClass.size() == 0) {
        eqClass = null;
        i++;
      }
    }
    if (eqClass != null || i < expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list: "+value+
             " which isn't sorted correctly. The correct sort order is "+expected);
          return false;
    }
    return true;
  }


  static <E> boolean wellSorted(TestCall<?,?> call,
                                PositionList<E> value,
                                PositionList<E> expected,
                                Function<Pair<E,E>,Boolean> isSame) {

    PositionList<E> expectedCopy = new NodePositionList<E>(expected);

    if (value.size() != expected.size()) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned a list:\n  "+value+
         "\nwhich contains the wrong number of elements.\n"+
         "The correct list (modulo order of equal elements) is\n  "+
         expectedCopy);
      return false;
    }

    Position<E> valuePos = value.first();
    
    while (valuePos != null) {
      E valueE = valuePos.element();

      if (valueE == null) {
        if (value.size() != expected.size()) {
          printError
            (ExecutionTime.DURING,
             "the call "+call.toString()+
             " returned a list:\n  "+value+
             "\nwhich contains a null element.\n"+
             "The correct list (modulo order of equal elements) is\n  "+
             expectedCopy);
          return false;
        }
      }

      Position<E> expectedPos = expected.first();
      boolean found = false;
      boolean equals = true;

      while (expectedPos != null && !found && equals) {
        E expectedE = expectedPos.element();
        if (valueE.equals(expectedE)) {
          found = true;
          expected.remove(expectedPos);
        } else if (!isSame.apply(new Pair<E,E>(valueE,expectedE)))
          equals = false;

        if (!found && equals) {
          expectedPos = expected.next(expectedPos);
        }
      }

      if (!found) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned a list:\n  "+value+
           "\nwhich contains elements either incorrect elements or elements in the wrong order."+
           "\nThe correct list (modulo order of equal elements) is\n  "+
           expectedCopy);
        return false;
      }

      valuePos = value.next(valuePos);
    }
    return true;
  }


  static <E> PositionList<E> extractElementsFromIterable(String callString, Iterable<E> i) {
    if (i == null) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an null iterable");
      return null;
    }

    PositionList<E> l = null;

    try {
      java.util.Iterator<E> it = i.iterator();
      l = extractElementsFromIterator(it);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return null;
    }
    return l;
  }

  static <E> PositionList<E> extractElementsFromIterator(java.util.Iterator<E> it) {
    PositionList<E> l = new NodePositionList<E>();
    while (it.hasNext()) {
      l.addLast(it.next());
    }
    return l;
  }

  static <E,F> boolean unorderedIterableCorrect
    (TestCall<Iterable<E>,F[]> call,
     TestResult<Iterable<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = null;

    try {
      it = result.getValue().iterator();
      if (it == null) {
        printError
          (ExecutionTime.DURING,
           "the call "+call.toString()+
           " returned an iterable which returned a null iterator");
	return false;
      }
      else return unorderedIteratorCorrect(() -> call.toString(), it, expected);
    } catch (Throwable exc) {
      printError
        (ExecutionTime.DURING,
         "the call "+call.toString()+
         " returned an iterable which when used raised the exception "+
         exc+"\n"+getStackTrace(exc));
      return false;
    }
  }

  static <E,F> boolean unorderedIteratorCorrect
    (TestCall<java.util.Iterator<E>,F[]> call,
     TestResult<java.util.Iterator<E>,F[]> result,
     F[] expected) {
    java.util.Iterator<E> it = result.getValue();
    return unorderedIteratorCorrect(() -> call.toString(), it, expected);
  }

  static <E,F> boolean unorderedIteratorCorrect
    (Supplier<String> callString,
     java.util.Iterator<E> it,
     F[] expected) {

    PositionList<E> l = null;

    try { l = extractElementsFromIterator(it); }
    catch ( Throwable exc ) {
      TestUtils.printCallException(exc);
      return false;
    }

    if (l == null) return false;

    boolean correct = (expected.length == l.size());

    if (correct) {
      PositionList<F> expectedList = new NodePositionList<F>();
      for (int j=0; j<expected.length; j++) {
        expectedList.addLast(expected[j]);
      }
      HashSet<Object> s1 = new HashSet<Object>();
      HashSet<Object> s2 = new HashSet<Object>();
      for (Object e : l)
        s1.add(e);
      for (Object f : expectedList)
        s2.add(f);
      if (!s1.equals(s2)) {
        printError
          (ExecutionTime.DURING,
           "the call "+callString.get()+
           " returned an iterator which returned the elements "+TestUtils.print(s1)+
           " which differs from the expected elements "+TestUtils.print(s2));
        return false;
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString.get()+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  static <E,F> boolean iterableCorrect(String callString, E[] original, Iterable<E> i) {
    PositionList<E> l = extractElementsFromIterable(callString, i);
    if (l == null) return false;

    boolean correct = (original.length == l.size());

    if (correct) {
      Position<E> cursor = l.first();
      for (int j=0; j<original.length; j++) {
        if (original[j] == null) {
          correct = correct && (cursor.element() == null);
        }
        correct = correct && original[j].equals(cursor.element());
        if (!correct) break;
        cursor = l.next(cursor);
      }
    }
   
    if (!correct) {
      printError
        (ExecutionTime.DURING,
         "the call "+callString+
         " returned an iterable with the elements "+TestUtils.print(l)+
         " but should have returned the elements "+TestUtils.print(original));
      return false;
    } else return true;
  }

  static <E> boolean unchanged(String callString, E[] original, PositionList<E> l) {
      boolean ok_sofar = l.size() == original.length;

      Position<E> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
	  E elem = lPos.element();

	  if (elem == null) ok_sofar = (original[i] == null);
	  else ok_sofar = elem.equals(original[i]);

	  lPos = l.next(lPos);
	  ++i;
      }

      if (!ok_sofar) {
	  printError
            (ExecutionTime.DURING,
	       "the call "+callString+
	       " has modified the input list "+TestUtils.print(original)+
	     "; it has now the elements "+TestUtils.print(l));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static <E> boolean unchanged(String callString, E[] original, E[] newer) {
      boolean ok_sofar = newer.length == original.length;

      for (int i=0; i<newer.length; i++) {
	  if (newer[i] == null) ok_sofar = (original[i] == null);
	  else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
	  printError
	      (ExecutionTime.DURING,
	       "the call "+callString+
	       " has modified the input array "+TestUtils.print(original)+
	       "; it has now the elements "+TestUtils.print(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  static String printArray(Object[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  static String printArray(char[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }

  public static <T> PositionList<T> toPositionList(T[] arr) {
    NodePositionList<T> l = new NodePositionList<T>();
    for (int i=0; i<arr.length; i++)
      l.addLast(arr[i]);
    return l;
  }

  public static <T> IndexedList<T> toIndexedList(T[] arr) {
    ArrayIndexedList<T> l = new ArrayIndexedList<T>();
    for (int i=0; i<arr.length; i++)
      l.add(0,arr[i]);
    return l;
  }

  public static Object accessAttribute(String fieldName, Object obj) {
    try {
      Field field;
      field = obj.getClass().getDeclaredField(fieldName);
      field.setAccessible(true);
      return field.get(obj);
    } catch ( Throwable exc ) {
      TestUtils.printCallException
        (TestUtils.ExecutionTime.LAST,
         "cannot access the field "+fieldName+": ",
         exc);
      return null;
    }
  }

  public static void reportPid() {
    try {
      String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
      BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
      bw.write(ids[0]);
      bw.close();
    } catch (Exception e) {
      System.out.println("Avisa al profesor de fallo sacando el PID");
    }
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public static <T> T[] toGenericArray(T ... elems) {
    return elems;
  }

  public static boolean ensureAedlibVersion(int major, int minor, int patchlevel) {
    boolean isOk = true;
    int aedlibMajor = 0, aedlibMinor = 0, aedlibPatchlevel = 0;
    
    try {
      Class<?> aedlibVersion = Class.forName("es.upm.aedlib.Version");
      Method majorMethod = aedlibVersion.getDeclaredMethod("major");
      Method minorMethod = aedlibVersion.getDeclaredMethod("minor");
      Method patchlevelMethod = aedlibVersion.getDeclaredMethod("patchlevel");

      aedlibMajor =
	(Integer) majorMethod.invoke(null);
      aedlibMinor = 
	(Integer) minorMethod.invoke(null);
      aedlibPatchlevel = 
	(Integer) patchlevelMethod.invoke(null);

      isOk =
	((aedlibMajor > major)
	 || ((aedlibMajor == major) &&
	     ((aedlibMinor > minor)
	      || ((aedlibMinor == minor) &&
		  (aedlibPatchlevel >= patchlevel)))));
    } catch (Throwable exc) {
      System.out.println
	("*** WARNING: cannot check aedlib version number due to "+exc);
      exc.printStackTrace();
    }

    if (!isOk) {
      String errorMessage =
	"*** ERROR: aedlib is too old. Minimum version needed is "+
	major+"."+minor+"."+patchlevel+"; your version is "+
	aedlibMajor+"."+aedlibMinor+"."+aedlibPatchlevel+
	". Please download a new version of aedlib from moodle\n";
      System.out.println(errorMessage);
      throw new RuntimeException(errorMessage);
    } else return true; 	      
  }

  @SuppressWarnings("unchecked")
  public static es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer> es_upm_aedlib_map_Entry_refl_cnstr(Object... params) {
    return (es.upm.aedlib.Entry<es.upm.aedlib.graph.Vertex<Integer>,Integer>) reflectionNew("es.upm.aedlib.map.HashEntry",params);
  }

  public static Object reflectionNew(String className, Object... params) {
    try {
      Class<?> cl = Class.forName(className);
      for (java.lang.reflect.Constructor<?> cnstr : cl.getConstructors()) {
        Class<?>[] parameterTypes = cnstr.getParameterTypes();
        if (parameterTypes.length == params.length) {
          boolean equals = true;
          for (int i=0; i<parameterTypes.length && equals; i++) {
              if (!parameterTypes[i].isInstance(params[i])) {
                  equals = false;
                  break;
              }
          }
          if (equals) {
            cnstr.setAccessible(true);
            return cnstr.newInstance(params);
          }
        }
      }
    } catch (ClassNotFoundException exc) {
      System.out.println
        ("*** Warning: could not access class "+className);
      throw new RuntimeException();
    } catch (InstantiationException exc) {
      System.out.println
        ("*** Warning: could not instantiate "+className);
      throw new RuntimeException();
    } catch (IllegalAccessException exc) {
      System.out.println
        ("*** Warning: could not access "+className);
      throw new RuntimeException();
    } catch (InvocationTargetException exc) {
      System.out.println
        ("*** Warning: constructor "+className+" raised an exception");
      throw new RuntimeException();
    }
    throw new RuntimeException();
  }
}

interface TestResult<E,F> {
  boolean isException();
  Throwable getException();
  E getValue();
  boolean checkResult(F expected);
}

static class Result<E,F> implements TestResult<E,F> {
  private boolean isException;
  private Throwable exception;
  private E value;
  Call<E,F> call;

  public static <E,F> Result<E,F> result(E e, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = false;
    result.value = e;
    result.call = call;
    return result;
  }
  
  public static <E,F> Result<E,F> exception(Throwable exception, Call<E,F> call) {
    Result<E,F> result = new Result<E,F>();
    result.isException = true;
    result.exception = exception;
    result.call = call;
    return result;
  }
  
  public boolean isException() {
    return isException;
  }

  public Throwable getException() {
    if (!isException()) {
      TestData.message("*** Internal model error: calling getException() without exception");
      throw new RuntimeException();
    }
    return exception;
  }

  public E getValue() {
    if (isException())
      throw new RuntimeException();
    return value;
  }
  
  Call<E,F> getCall() {
    return call;
  }

  public boolean checkResult(F expected) {
    try {
      return getCall().checkResult(expected);
    } catch (Throwable exc) {
      System.out.println("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      exc.printStackTrace();
      TestData.message("\n\n\n*** Internal testing error: checkResult("+expected+") raised exception "+exc);
      TestUtils.printCallException(exc);
      TestData.message("\n");
      throw new RuntimeException();
    }
  }

  public String toString() {
    String callString = getCall().toString();
    if (!callString.equals("")) {
      if (isException())
	return callString + "  =>  " + getException();
      else
	{
          String valueString = TesterCode.printer(getValue());
          return callString + "  =>  " + format_value(valueString);
        }
    } else return callString;
  }

  private String format_value(String msg) {
    String[] lines = msg.split("\\r?\\n");
    if (lines.length == 1) return msg;
    else {
      StringBuffer resultString = new StringBuffer();
      for (String line : lines) {
        resultString.append("\n    ");
        resultString.append(line);
      }
      return resultString.toString();
    }
  }
}

interface Call<E,F> {
  TestResult<E,F> doCall();
  String toString();
  boolean checkResult(F expected);
}

static abstract class TestCall<E,F> implements Call<E,F> {
  TestResult<E,F> result;
  boolean hasCalled;
  boolean voidReturn = false;

  public TestResult<E,F> doCall() {
    if (hasCalled())
      throw new RuntimeException();

    hasCalled = true;
    TestData.addCallToTrace(this.toString());
    
    try {
      E e = call();
      result = Result.result(e,this);
    } catch (Throwable exception) {
      result = Result.exception(exception,this);
    }

    if (result.isException() || !voidReturn)
      TestData.modifyLastCallInTrace(TesterCode.printer(result));
    
    return result;
  }

  abstract E call() throws Exception;

  boolean hasCalled() {
    return hasCalled;
  }

  boolean noException() {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }
    return true;
  }

  boolean noException(Supplier<String> msg) {
    if (result.isException()) {
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable,msg);
      return false;
    }
    return true;
  }

  boolean throwsException(String expectedName) {
    if (!result.isException()) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown an exception "+expectedName+
         " but did not.");
      return false;
    }

    Throwable exception = result.getException();
    if (!expectedName.equals(exception.getClass().getCanonicalName())) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+" should have thrown the exception "+
         expectedName+
         ", but throwed the exception "+exception+"\n"+
         TestUtils.getStackTrace(exception));
      return false;
    }

    return true;
  }

  boolean nonNull() {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n");
      return false;
    } else return true;
  }

  boolean nonNull(Supplier<String> msg) {
    if (!noException())
      return false;
    if (result.getValue() == null) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned null but it should not have\n"+
         msg.get());
      return false;
    } else return true;
  }

  boolean fresh(Object obj) {
    return fresh(result.getValue(),obj);
  }

  boolean fresh(Object obj1, Object obj2) {
    if (obj1 != null && obj1 == obj2) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned an object\n  "+TestUtils.print(obj1)+
         "\nwhich is the same REFERENCE as an argument object; "+
         "a NEW object should have been returned\n");
      return false;
    } else return true;
  }

  boolean unchanged(Object obj1, Object obj2) {
    return report_unchanged(obj1.equals(obj2),obj1,obj2);
  }

  boolean report_unchanged(boolean result, Object obj1, Object obj2) {
    if (!result) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         "\nchanged a method parameter into\n  "+TestUtils.print(obj1)+
         "\nwhich used to be\n  "+TestUtils.print(obj2)+".\nIt should not have been changed.\n");
    }
    return result;
  }

  boolean unchanged_array(Object[] original, Object[] newer) {
      boolean ok_sofar = newer.length == original.length;

      for (int i=0; i<newer.length; i++) {
	  if (newer[i] == null) ok_sofar = (original[i] == null);
	  else ok_sofar = newer[i].equals(original[i]);
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(int[] original, int[] newer) {
      boolean ok_sofar = newer.length == original.length;

      for (int i=0; i<newer.length; i++) {
	  ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean unchanged_array(char[] original, char[] newer) {
      boolean ok_sofar = newer.length == original.length;

      for (int i=0; i<newer.length; i++) {
	  ok_sofar = newer[i] == original[i];
      }

      if (!ok_sofar) {
	  TestUtils.printError
	      (TestUtils.ExecutionTime.LAST,
	       "the call to "+this+
	       " has modified the input array "+TestUtils.printArray(original)+
	       "; it has now the elements "+TestUtils.printArray(newer));
	  return ok_sofar;
      }
      return ok_sofar;
  }

  boolean setsMatch(Object expected) {
    if (!noException())
      return false;

    if (!(expected instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over expected value "+TestUtils.print(expected));
      throw new RuntimeException();
    }
    Iterable<?> ev = (Iterable<?>) expected;

    E value = result.getValue();
    if (!(value instanceof Iterable<?>)) {
      TestData.message("Cannot iterate over result value "+TestUtils.print(value));
      throw new RuntimeException();
    }
    Iterable<?> iv = (Iterable<?>) value;

    HashSet<Object> ts1 = new HashSet<Object>();
    HashSet<Object> ts2 = new HashSet<Object>();


    for (Object s1 : iv)
      ts1.add(s1);
    for (Object s2 : ev)
      ts2.add(s2);
    
    if (!ts1.equals(ts2)) {
      TestUtils.printError
        (TestUtils.ExecutionTime.LAST,
         "\nthe call to "+this+
         " returned a value\n"+TestUtils.print(value)+
         "\nwhich does not contain the same elements as the expected answer"+
         "\n"+expected);
      return false;
    }

    return true;
  }

  // For use in invariant checking code only -- does not report failure
  boolean silentCheckTrueResult() {
    if (result.isException()) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\n*** INTERNAL ERROR in tester: an invariant raised an exception\n");
      Throwable throwable = result.getException();
      TestUtils.printCallException(throwable);
      return false;
    }

    E value = result.getValue();

    if (value == null) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\n*** INTERNAL ERROR in tester: an invariant returned a null object\n");
      return false;
    }
    
    return value.equals(true);
  }

  boolean equalsExpected(Object value, Object expected) {
    if (value == null) {
      if (expected != null) {
	TestUtils.printError
	  (TestUtils.ExecutionTime.LAST,
	   "\nthe call to "+this+" returned null, "+
	   "but should have returned "+TestUtils.print(expected));
	return false;
      }
      else return true;
    }

    if (!equalsWithArrays(expected,value)) {
      TestUtils.printError
	(TestUtils.ExecutionTime.LAST,
	 "\nthe call to "+this+" returned\n  "+TestUtils.print(value)+
	 "\n\nbut should have returned\n  "+TestUtils.print(expected));
      return false;
    } else return true;
  }

  boolean valuesMatch(Object expected) {
    if (result.isException()) {
      noException();
      return false;
    } else {
      E value = result.getValue();
      return equalsExpected(value, expected);
    }      
  }

  private static boolean equalsWithArrays(Object expected, Object value) {
    if (expected == null) return value == null;
    if (value == null) return expected == null;
    if (expected.equals(value)) return true;
    if (expected instanceof Object[] && value instanceof Object[]) {
      Object[] obj_expected = (Object[]) expected;
      Object[] obj_value = (Object[]) value;
      return Arrays.deepEquals(obj_expected,obj_value);
    } else if (expected instanceof int[] && value instanceof int[]) {
      int[] obj_expected = (int[]) expected;
      int[] obj_value = (int[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof char[] && value instanceof char[]) {
      char[] obj_expected = (char[]) expected;
      char[] obj_value = (char[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof long[] && value instanceof long[]) {
      long[] obj_expected = (long[]) expected;
      long[] obj_value = (long[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof float[] && value instanceof float[]) {
      float[] obj_expected = (float[]) expected;
      float[] obj_value = (float[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof double[] && value instanceof double[]) {
      double[] obj_expected = (double[]) expected;
      double[] obj_value = (double[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof byte[] && value instanceof byte[]) {
      byte[] obj_expected = (byte[]) expected;
      byte[] obj_value = (byte[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof short[] && value instanceof short[]) {
      short[] obj_expected = (short[]) expected;
      short[] obj_value = (short[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else if (expected instanceof boolean[] && value instanceof boolean[]) {
      boolean[] obj_expected = (boolean[]) expected;
      boolean[] obj_value = (boolean[]) value;
      return Arrays.equals(obj_expected,obj_value);
    } else return false;
  }

  public boolean checkResult(F expected) {
    if (!hasCalled())
      throw new RuntimeException();

    return valuesMatch(expected);
  }
}


static class IsArithmeticSequence extends TestCall<Boolean,Boolean>
{
  NodePositionList<Integer> x_1;
  NodePositionList<Integer> x_1_orig;
  
  public IsArithmeticSequence (NodePositionList<Integer> x_1)
  {
    this.x_1 = x_1 ;
    if (x_1 == null)
      x_1_orig = null ;
    else
      x_1_orig = new NodePositionList<Integer>(x_1) ;
  }
  
  public String toString () 
  {
      String output = "Utils.isArithmeticSequence" +
              "(" +
              TesterCode.printer(x_1_orig) +
              ")";
    return output;
  }
  
  public Boolean call () 
  {
    return Utils.isArithmeticSequence(x_1) ;
  }
  
  public boolean checkResult (Boolean expected) 
  {
    if (!noException())
      return false ;
    if (!nonNull())
      return false ;
    if (!(result.isException() || fresh(result.getValue(),x_1)))
      return false ;
    if (!unchanged(x_1,x_1_orig))
      return false ;
      return valuesMatch(expected);
  }
  
}







static class TestData {
  static String testName = "";
  static ArrayList<String> trace;
  static ArrayList<String> messages;
  static boolean isJunitTester;

  public static void initTrace() {
    trace = new ArrayList<String>();
    messages = new ArrayList<String>();
  }

  public static void setTesterType(boolean junitTesting) {
    isJunitTester = junitTesting;
  }

  public static boolean isJunitTester() {
    return isJunitTester;
  }

  public static void addCallToTrace(String callString) {
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
  }

  public static void modifyLastCallInTrace(String callString) {
    if (trace.size() > 0) {
      trace.remove(trace.size()-1);
    if (!callString.equals(""))
      trace.add("  "+callString);
    else
      trace.add(callString);
    }
  }

  public static void message(String message) {
    messages.add(message);
  }

  public static int numCommands() {
    return trace.size();
  }

  private static String arrayToString(ArrayList<String> arr) {
    StringBuffer sb = new StringBuffer();

    for (int i=0; i<arr.size(); i++) {
      String item = arr.get(i);
      if (!item.equals("")) {
	sb.append(item+"\n");
      }
    }
    return sb.toString();
  }

  public static String getTrace() {
    return arrayToString(trace);
  }

  public static String getMessages() {
    return arrayToString(messages);
  }

  public static String getTestName() {
    return testName;
  }

  public static ArrayList<String> getRawTrace() {
    return trace;
  }

  public static void setTrace(ArrayList<String> setTrace) {
    trace = setTrace;
  }

  public static void setTestName(String setTestName) {
    testName = setTestName;
  }

  public static void setContext(String setTestName, ArrayList<String> setTrace) {
    setTestName(setTestName);
    setTrace(setTrace);
  }
}









 
static class ResultsHandler {
  public static volatile CountDownLatch waitForThreads = null;
  static LinkedHashMap<String,Boolean> results_sofar;
  static HashSet<String> runningTests;
  static int numTestsRemaining = 1000;
  static long endTime = 0;

  static void init() {
    results_sofar = new LinkedHashMap<String,Boolean>();
    runningTests = new HashSet<String>();
  }

  static void setNumTestsRemaining(int numTestsToRun, int GlobalTimeoutInSeconds) {
    numTestsRemaining = numTestsToRun;
    endTime = System.currentTimeMillis() + GlobalTimeoutInSeconds* 1000L;
  }

  static boolean isTimedout() {
    return System.currentTimeMillis() > endTime;
  }

  static void startTest(String testName) {
    runningTests.add(testName);
  }

  static void stopTest(String testName) {
    runningTests.remove(testName);
    --numTestsRemaining;
  }

  static boolean results_ok_sofar() {
    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;
    return true;
  }

  static boolean local_results_ok_sofar(String test_type) {
    Boolean result = results_sofar.get(test_type);
    return (result==null) || result;
  }

  static void add_result(String test_type, boolean result) {
    Boolean old_result = results_sofar.get(test_type);
    if ((old_result == null) || old_result)
      results_sofar.put(test_type,result);
  }

  static boolean results_ok() {
    if (results_sofar.size() == 0) {
      System.out.println("\n*** Error: no tests were run");
      return false;
    }

    if (runningTests.size() > 0) {
      System.out.println("\n*** Error: some tests ("+runningTests.size()+") are still running\n");
      return false;
    }

    for (String key : results_sofar.keySet())
      if (!results_sofar.get(key))
        return false;

    if (numTestsRemaining > 0) {
      System.out.println("\n*** Error: some tests ("+numTestsRemaining+") did not run\n");
      return false;
    }

    return true;
  }

  static int get_nota() {
    if (results_ok()) return 10;
    else return 0;
  }

  static void report_results() {
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++\n");

    for (String testName : results_sofar.keySet()) {
      System.out.print("Testing results for "+testName+": ");
      if (results_sofar.get(testName)) {
        System.out.println("succeeded");
      } else {
        System.out.println("failed");
      }
    }

    System.out.println("\n------------------------------------------");
    if (results_ok()) {
      System.out.println("\n"+Tests.tester+": Test finalizado correctamente.\n");
      System.out.println(readFile("aed_success_message.txt"));
    } else {
      System.out.println("\n"+Tests.tester+": errores detectados.\n\n");
    }
  }

  private static String readFile(String filePath) 
  {
    StringBuilder sb = new StringBuilder();
    Path path = Paths.get(filePath);
 
    if (Files.isReadable(path)) {
      try (Stream<String> stream = Files.lines(path, StandardCharsets.UTF_8)) 
        {
          stream.forEach(s -> sb.append(s).append("\n"));
        }
      catch (IOException e) {}
    }
 
    return sb.toString();
  }
  
}


static class TesterCode
{
  
  public static void resetPrinter () 
  {
  }
  
  public static String printer (Object obj) 
  {
    return TestUtils.standardPrinter(obj) ;
  }
  
}


}

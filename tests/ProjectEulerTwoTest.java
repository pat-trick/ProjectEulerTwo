import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test functionality of ProjectEulerTwo.
 */
public class ProjectEulerTwoTest {

  /**
   * Tests computation of the Sum of Even Fibonacci Terms.
   *
   * @throws Exception Error messages from testing.
   */
  @Test
  public void testComputeEvenFibonacciTermSum() throws Exception {
    assertEquals("Sum of numbers less than 10", 10, ProjectEulerTwo.computeEvenFibonacciTermSum(10));
    assertEquals("Sum of numbers less than 100", 44, ProjectEulerTwo.computeEvenFibonacciTermSum(100));
  }
}
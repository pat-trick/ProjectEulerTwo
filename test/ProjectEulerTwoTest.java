import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests ProjectEulerTwo.
 */
public class ProjectEulerTwoTest {

  /**
   * Tests the function testCalculateSumOfEvenFibonacciNumbers.
   *
   * @throws Exception Error thrown during testing.
   */
  @Test
  public void testCalculateSumOfEvenFibonacciNumbers() throws Exception {
    assertEquals("Values less than 10", 10, ProjectEulerTwo.calculateSumOfEvenFibonacciNumbers(10));
    assertEquals("Values less than 100", 44, ProjectEulerTwo.calculateSumOfEvenFibonacciNumbers(100));
  }
}
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the functionality of ProjectEulerTwo.
 *
 */
public class ProjectEulerTwoTest {

  /**
   * Tests various input values for the calculateEvenFibonacciSum function.
   *
   * @throws Exception An error message.
   */
  @Test
  public void testCalculateEvenFibonacciSum() throws Exception {
    assertEquals("Value of sum up to 35", 44, ProjectEulerTwo.calculateEvenFibonacciSum(35));
    assertEquals("Value of sum up to 500", 188, ProjectEulerTwo.calculateEvenFibonacciSum(500));
  }
}
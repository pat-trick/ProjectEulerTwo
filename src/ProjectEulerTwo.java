/**
 *  Created by patrick on 2/4/15.
 */
public final class ProjectEulerTwo {

  /**
   * Constructor for ProjectEulerTwo; currently blank.
   */
  private ProjectEulerTwo() {
    // Not called.
  }

  /**
   * Adds the sum of even Fibonnaci numbers up to 4 million.
   * Then prints out the sum.
   *
   * @param args ignored.
   */
  public static void main(final String[] args) {
    final int testValue = 4000000;
    int sum = calculateEvenFibonacciSum(testValue);
    System.out.println("Total is: " + sum);
  }

  /**
   * Calculates the sum of all even numbers in the Fibonnaci sequence
   * up to a certain max value.
   *
   * @param maxValue The maximum value to calculate up to.
   * @return The sum of all even Fibonnaci numbers up to maxValue.
   */
  public static int calculateEvenFibonacciSum(final int maxValue) {

    int previous = 1;
    int current = 2;
    int next;
    int sum = 0;
    while (current < maxValue) {
      if ((current % 2) == 0) {
        sum += current;
      }
      next = previous + current;
      previous = current;
      current = next;
    }
    return sum;
  }
}

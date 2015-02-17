/**
 * Computes the solution to ProjectEulerTwo.
 *
 * Created by patrick on 2/4/15.
 */
public class ProjectEulerTwo {

  /**
   * Computes the sum of even Fibonacci terms up to 4 million.
   * @param args Ignored.
   */
  public static void main(String[] args) {

    int sum = computeEvenFibonacciTermSum(4000000);
    System.out.println("Total is: " + sum);
  }

  /**
   * Computes the sum of even Fibonacci terms up to maxValue.
   *
   * @param maxValue The maximum value to be computed up to.
   * @return The sum of even Fibonacci terms up to maxValue.
   */
  public static int computeEvenFibonacciTermSum(int maxValue) {
    int previous = 1;
    int current = 2;
    int next = 0;
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

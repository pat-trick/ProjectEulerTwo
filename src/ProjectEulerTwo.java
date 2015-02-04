/* Created by patrick on 2/4/15.
    */
public class ProjectEulerTwo {
  public static void main(String[] args) {
    int previous = 1;
    int current = 2;
    int next = 0;
    int sum = 0;
    while (current < 4000000) {
      if ((current % 2) == 0) {
        sum += current;
      }
      next = previous + current;
//      System.out.println("Next is: " + current);
      previous = current;
      current = next;
    }
    System.out.println("Total is: " + sum);
  }
}

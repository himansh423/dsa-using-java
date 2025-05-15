import java.util.Scanner;

public class Lec8_FibonacciSequence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter N: ");
    int n = sc.nextInt();

    int prev = 0;
    int curr = 1;
    int next = 0;

    System.out.print(prev + " " + curr + " ");
    for (int i = prev; i <= n; i++) {
      next = prev + curr;
      prev = curr;
      curr = next;
      System.out.print(next + " ");
    }
  }
}

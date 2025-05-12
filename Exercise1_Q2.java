import java.util.Scanner;

public class Exercise1_Q2 {
  public static int sumTillNOfOddNumber(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        sum = sum + i;
      }
    }

    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter N: ");
    int n = sc.nextInt();
    int sumOfOddNumbersTillN = sumTillNOfOddNumber(n);
    System.out.println("Sum of Odd Numbers Till N is: " + sumOfOddNumbersTillN);
  }
}

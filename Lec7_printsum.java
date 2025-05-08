import java.util.Scanner;

public class Lec7_printsum {
  public static int sumOfTwoNumbers(int a, int b) {
    int sum = a + b;
    return sum;
  }

  public static int productOf2Numbers(int a, int b) {
    return a * b;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number1: ");
    int a = sc.nextInt();
    System.out.print("Enter Number2: ");
    int b = sc.nextInt();

    int sum = sumOfTwoNumbers(a, b);
    System.out.println("Sum of Num1 and Num2 is: " + sum);

    int product = productOf2Numbers(a, b);
    System.out.println("product of Num1 and Num2 is: " + product);

  }
}

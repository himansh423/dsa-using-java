import java.util.Scanner;

public class Lec3_HWQ1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Num1: ");
    int a = sc.nextInt();

    System.out.print("Enter Operation: ");
    int op = sc.nextInt();

    System.out.print("Enter Num2: ");
    int b = sc.nextInt();
    int ans = 0;
    if (op == 1) {
      ans = a + b;
      System.out.print("Sum is: ");
      System.out.println(ans);
    } else if (op == 2) {
      ans = a - b;
      System.out.print("Difference is: ");
      System.out.println(ans);
    } else if (op == 3) {
      ans = a * b;
      System.out.print("Product is: ");
      System.out.println(ans);
    } else if (op == 4) {
      ans = a / b;
      System.out.print("Division is: ");
      System.out.println(ans);
    } else {
      System.out.println("wrong operation selected.");
    }

  }
}

import java.util.Scanner;

public class Lec7_FactorialOf2Numbers {
  public static int factorialOfN(int n) {
    int factorial = 1;
    for (int i = n; i >= 1; i--) {
      factorial = factorial * i;
    }
    return factorial;
  }

  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number: ");
     int n = sc.nextInt();
     int factorial = factorialOfN(n);
     System.out.println("Factorial of Number " + n + " is: "+ factorial);
  }
}

import java.util.Scanner;

public class Exercise1_Q1 {
  public static int CalAverage(int a, int b, int c) {
    int avg = (a + b + c) / 3;
    return avg;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter A: ");
    int a = sc.nextInt();

    System.out.print("Enter B: ");
    int b = sc.nextInt();

    System.out.print("Enter C: ");
    int c = sc.nextInt();

    int avg = CalAverage(a, b, c);

    System.out.println("Average of A, B and C is: " + avg);
  }
}

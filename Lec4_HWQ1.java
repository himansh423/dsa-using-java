import java.util.Scanner;

public class Lec4_HWQ1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }
}

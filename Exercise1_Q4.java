import java.util.Scanner;

public class Exercise1_Q4 {
  public static double circumferenceOfCircle(double r) {
    double cirF = 2 * 3.14 * r;

    return cirF;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Radius of Circle: ");
    int r = sc.nextInt();

    double cirF = circumferenceOfCircle(r);

    System.out.println("Circumference of Circle is: " + cirF);
  }
}

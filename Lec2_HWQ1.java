import java.util.Scanner;

public class Lec2_HWQ1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Radius of Circle: ");
    int r = sc.nextInt();
    double pi = 3.14;
    double area = pi * (r * r);

    System.out.print("Area of Circle is: ");
    System.out.println(area);

  }
}

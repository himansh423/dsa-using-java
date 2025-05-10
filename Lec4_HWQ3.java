import java.util.Scanner;

public class Lec4_HWQ3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

    do {
      System.out.print("Enter Number (1 to enter marks, 0 to exit): ");
      num = sc.nextInt();

      if (num == 1) {
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        if (marks > 100 || marks < 0) {
          System.out.println("Invalid marks entered.");
        } else if (marks >= 90) {
          System.out.println("This is good");
        } else if (marks >= 60) {
          System.out.println("This is also good");
        } else {
          System.out.println("This is good as well");
        }
      } else if (num == 0) {
        System.out.println("Not executed");
      } else {
        System.out.println("Invalid input. Enter 1 or 0.");
      }

    } while (num != 0);

    sc.close();
  }
}

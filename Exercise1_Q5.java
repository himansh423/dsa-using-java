import java.util.Scanner;

public class Exercise1_Q5 {
  public static void Eligible(int age) {
    if (age >= 18) {
      System.out.print("You're Eligible for vote");
    } else {
      System.out.println("You're not Eligible for Vote");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Your Age: ");
    int age = sc.nextInt();

    Eligible(age);
  }
}

import java.util.Scanner;

public class Lec3_conditions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    if (age >= 18) {
      System.out.println("You're an adult.");
    } else {
      System.out.println("Not an Adult");
    }
  }
}

import java.util.Scanner;

public class Lec7_PrintNameFunctions {
  public static void printMyName(String name) {
    System.out.println("My name Is " + name);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String name = sc.nextLine();

    printMyName(name);
  }
}

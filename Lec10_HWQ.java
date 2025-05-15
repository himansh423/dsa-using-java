import java.util.Scanner;

public class Lec10_HWQ {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Size of Array: ");
    int size = sc.nextInt();
    sc.nextLine(); 

    String names[] = new String[size];

    for (int i = 0; i < names.length; i++) {
      System.out.print("Enter Name " + i + " : ");
      names[i] = sc.nextLine();
    }

    for (int i = 0; i < names.length; i++) {
      System.out.print("Name " + i + " = ");
      System.out.println(names[i]);
    }
  }
}
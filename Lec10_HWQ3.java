import java.util.Scanner;

public class Lec10_HWQ3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Size of Array: ");

    int size = sc.nextInt();
    sc.nextLine();

    int numbers[] = new int[size];

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Enter Element At Index " + i + ": ");
      numbers[i] = sc.nextInt();
    }

    boolean isAscending = true;
    for (int i = 0; i < numbers.length - 1; i++) {
      if (numbers[i] > numbers[i + 1]) {
        isAscending = false;
      }
    }

    if (isAscending) {
      System.out.println("Array is Sorted in Ascending Order.");
    }
    else {
      System.out.println("Array No t Sorted In Ascending order");
    }
  }
}

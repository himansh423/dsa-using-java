import java.util.Scanner;

public class Lec10_findNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size of Array: ");
    int size = sc.nextInt();

    int arr[] = new int[size];

    for (int i = 0; i < arr.length; i++) {
      System.out.print("Enter Element at Index " + i + " : ");
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter Number to find In array: ");
    int x = sc.nextInt();

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        System.out.print("Element Found At index number : " + i);
      }
    }
  }
}

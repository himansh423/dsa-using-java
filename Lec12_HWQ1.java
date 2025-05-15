import java.util.Scanner;

public class Lec12_HWQ1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Size Of Array: ");
    int size = sc.nextInt();
    sc.nextLine();

    String arr[] = new String[size];

    for (int i = 0; i < arr.length; i++) {
      System.out.print("Enter Element at Index " + i + ": ");
      arr[i] = sc.nextLine();
    }

    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      count = count + arr[i].length();
    }

    System.out.println("Combined Count is: " + count);
  }
}

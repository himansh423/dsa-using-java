import java.util.Scanner;

public class Lec11_2dArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = 3;
    int cols = 5;

    int arr[][] = new int[rows][cols];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    int x = 5;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (arr[i][j] == x)
          System.out.print("Element found at index: " + i +"," + j);
      }

    }
  }
}

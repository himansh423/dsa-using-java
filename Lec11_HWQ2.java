public class Lec11_HWQ2 {
  public static void main(String[] args) {

    int arr[][] = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 } };

    int n = 3;
    int m = 4;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(arr[j][i]);
      }
      System.out.println();
    }
  }
}

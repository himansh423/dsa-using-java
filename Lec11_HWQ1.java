public class Lec11_HWQ1 {
  public static void main(String[] args) {
    int arr[][] = {  
        { 1, 2, 3, 4, 5, 6 },
        { 7, 8, 9, 10, 11, 12 },
        { 13, 14, 15, 16, 17, 18 },
        { 19, 20, 21, 22, 23, 24 },
        { 25, 26, 27, 28, 29, 30 }
    };

    int n = 5;
    int m = 6;

    int row_start = 0;
    int row_end = n - 1;
    int column_start = 0;
    int column_end = m - 1;

    System.out.println("The Spiral Order Matrix is:");

    while (row_start <= row_end && column_start <= column_end) {
      // 1. Traverse Top Row
      for (int col = column_start; col <= column_end; col++) {
        System.out.print(arr[row_start][col] + " ");
      }
      row_start++;

      // 2. Traverse Rightmost Column
      for (int row = row_start; row <= row_end; row++) {
        System.out.print(arr[row][column_end] + " ");
      }
      column_end--;

      // 3. Traverse Bottom Row (if still valid)
      if (row_start <= row_end) {
        for (int col = column_end; col >= column_start; col--) {
          System.out.print(arr[row_end][col] + " ");
        }
        row_end--;
      }

      // 4. Traverse Leftmost Column (if still valid)
      if (column_start <= column_end) {
        for (int row = row_end; row >= row_start; row--) {
          System.out.print(arr[row][column_start] + " ");
        }
        column_start++;
      }
    }
  }
}

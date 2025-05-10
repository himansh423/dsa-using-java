public class HollowButterfly {
  public static void main(String[] args) {
    int n = 5;

    // Top Half
    for (int i = 1; i <= n; i++) {
      // Left Wing
      for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) System.out.print("*");
        else System.out.print(" ");
      }

      // Center Spaces
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }

      // Right Wing
      for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) System.out.print("*");
        else System.out.print(" ");
      }

      System.out.println();
    }

    // Bottom Half
    for (int i = n; i >= 1; i--) {
      // Left Wing
      for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) System.out.print("*");
        else System.out.print(" ");
      }

      // Center Spaces
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }

      // Right Wing
      for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i) System.out.print("*");
        else System.out.print(" ");
      }

      System.out.println();
    }
  }
}

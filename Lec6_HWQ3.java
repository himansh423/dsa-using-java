public class Lec6_HWQ3 {
  public static void main(String[] args) {
    int n = 5;

    for (int i = 0; i < n; i++) {
      // Leading spaces
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }

      int number = 1; // First number is always 1
      for (int j = 0; j <= i; j++) {
        System.out.print(number + " ");
        number = number * (i - j) / (j + 1); // Next binomial coefficient
      }

      System.out.println();
    }
  }
}

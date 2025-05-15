public class Exercise1_GCD {
  public static void main(String[] args) {
    int a = 24;
    int b = 10;

    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }

    System.out.println(a);

  }
}

public class Lec7_HWQ2 {
  public static boolean isEven(int n) {

    if (n % 2 == 0) {
      return true;
    } else {
      return false;
    }

  }

  public static void main(String[] args) {
    int n = 3;

    if (isEven(n)) {
      System.out.println(n + " is even number.");
    } else {
      System.out.println(n + " is odd number");
    }
  }
}

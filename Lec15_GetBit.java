public class Lec15_GetBit {
  public static void main(String[] args) {
    int n = 5; // 0101
    int pos = 2;
    int bitmask = 1 << pos;

    if ((bitmask & n) == 0) {
      System.out.println("Bit was Zero");
    } else {
      System.out.println("Bit was one");
    }
  }
}

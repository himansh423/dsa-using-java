import java.util.Scanner;

public class Lec15_UpdateBit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();

    int n = 5;
    int pos = 2;
    int bitmask = 1 << pos;

    if (oper == 1) {
      int newNumber = bitmask | n;
      System.out.println(newNumber);
    } else if (oper == 0) {
      int notBitmask = ~(bitmask);
      int newNumber = notBitmask & n;
      System.out.println(newNumber);
    }

  }
}

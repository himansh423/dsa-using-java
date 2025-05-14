import java.util.Scanner;

public class Exercise1_Q8 {
  public static int exponentOfX(int x, int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result = result * x;
    }
    return result;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter X: ");
    int x = sc.nextInt();

    System.out.print("Enter n: ");
    int n = sc.nextInt();

    int exp = exponentOfX( x,  n);
  
    System.out.println("X^n is: "+ exp);
  }
}

import java.util.Scanner;

public class Exercise1_Q3 {
  public static void GreaterOfTwo(int a , int b) {
    if(a == b){
      System.out.println("Both are Equal");
    }
    else if(a > b){
      System.out.println("A is Greater than B");
    }
    else {
      System.out.println("B is Greater than A");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter A: ");
    int a = sc.nextInt();

    System.out.print("Enter B: ");
    int b = sc.nextInt();

    GreaterOfTwo(a,b);
  }
}

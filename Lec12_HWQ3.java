import java.util.Scanner;

public class Lec12_HWQ3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Your Email Address Please: ");
    String email = sc.nextLine();
    String username = "";
    for (int i = 0; i < email.length(); i++) {
      if (email.charAt(i) == '@') {
        break;
      } else {
        username = username + email.charAt(i);
      }
    }
    System.out.println(username);
  }
}

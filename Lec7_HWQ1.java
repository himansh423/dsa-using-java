public class Lec7_HWQ1 {

  // Function to check if a number is prime
  static boolean isPrime(int n) {
    if (n <= 1)
      return false; // numbers less than or equal to 1 are not prime
    if (n == 2)
      return true; // 2 is prime
    if (n % 2 == 0)
      return false; // even numbers greater than 2 are not prime

    // check for factors from 3 to √n
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    int number = 808;

    if (isPrime(number)) {
      System.out.println(number + " is a Prime Number.");
    } else {
      System.out.println(number + " is NOT a Prime Number.");
    }
  }
}

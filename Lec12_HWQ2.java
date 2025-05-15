public class Lec12_HWQ2 {
  public static void main(String[] args) {
    String original = "aeebegue";
    String result = "";
    for (int i = 0; i < original.length(); i++) {
      if (original.charAt(i) == 'e') {
        result = result + "i";
      } else {
        result = result + original.charAt(i);
      }

    }

    System.out.println(result);

  }
}

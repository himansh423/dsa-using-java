public class Lec13_StringBuilder {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Tony");

    System.out.println(sb);

    // char at index 0
    System.out.println(sb.charAt(0));

    // set char at index 0
    sb.setCharAt(0, 'P');
    System.out.println(sb);

    // insert

    sb.insert(2, "S");
    System.out.println(sb);

    // delete
    sb.delete(2, 3);
    System.out.println(sb);

    // append
    StringBuilder sb2 = new StringBuilder("h");

    sb2.append("e");
    sb2.append("l");
    sb2.append("l");
    sb2.append("o");

    System.out.println(sb2);

  }
}

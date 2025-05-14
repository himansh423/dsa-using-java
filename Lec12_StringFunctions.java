public class Lec12_StringFunctions {
  public static void main(String[] args) {
    // Concatination
    String firstName = "Himanshu";
    String lastName = " Chauhan";

    String fullName = firstName.concat(lastName);

    System.out.println(fullName);
    System.out.println(fullName.length());

    
    ////////////////////////////////////////////////////////
    // charAt
    for (int i = 0; i < fullName.length(); i++) {
      System.out.println(fullName.charAt(i));
    }


    // /////////////////////////////////////////////////
    // compare

    String name1 = "Tony";
    String name2 = "Tony";

    // 1. s1 > s2 : +ve value
    // 2. s1 < s2 : -ve value
    // 3. s1 == s2: 0
    if (name1.compareTo(name2) == 0) {
      System.out.println("Strings are Equal");
    }

    // /////////////////////////////////////////////////

    // sub-string

    String sentence = "My name is Tony Start";

    String name = sentence.substring(11,15);

    System.out.println(name);

  }
}

public class Hello{
  public static void main(String[]args){
    String x = "Hello";
    String y = "World";
    System.out.println(x+y);
  }
  public static int countConsonants(String text) {
      return getConsonants(text).length();
    }



  public static boolean isConsonant(char c) {
      return Character.isLetter(c) && !isVowel(c);
    }
}
